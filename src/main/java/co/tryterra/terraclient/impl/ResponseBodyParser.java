/*
 * Copyright 2022 Terra Enabling Developers Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.tryterra.terraclient.impl;

import co.tryterra.terraclient.api.PartialUser;
import co.tryterra.terraclient.api.TerraApiResponse;
import co.tryterra.terraclient.api.User;
import co.tryterra.terraclient.exceptions.BodyParsingException;
import co.tryterra.terraclient.exceptions.TerraRuntimeException;
import co.tryterra.terraclient.impl.v2.RestClientV2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ResponseBodyParser<T> {
    private static  final Logger logger = LoggerFactory.getLogger(ResponseBodyParser.class);

    private final PartialUser user;
    private final String key;
    private final Class<T> parseTo;
    private final RestClientV2 restClient;

    public ResponseBodyParser(PartialUser user, String key, Class<T> parseTo, RestClientV2 restClient) {
        this.user = user;
        this.key = key;
        this.parseTo = parseTo;
        this.restClient = restClient;
    }

    static class ParsedResponse<T> {
        private final JsonNode rawBody;
        private final List<T> parsedBody;
        private final User user;

        public ParsedResponse(JsonNode rawBody, List<T> parsedBody, User user) {
            this.rawBody = rawBody;
            this.parsedBody = parsedBody;
            this.user = user;
        }

        public JsonNode getRawBody() {
            return this.rawBody;
        }

        public List<T> getParsedBody() {
            return this.parsedBody;
        }

        public User getUser() {
            return this.user;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ResponseBodyParser.ParsedResponse)) return false;
            final ParsedResponse<?> other = (ParsedResponse<?>) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$rawBody = this.getRawBody();
            final Object other$rawBody = other.getRawBody();
            if (this$rawBody == null ? other$rawBody != null : !this$rawBody.equals(other$rawBody)) return false;
            final Object this$parsedBody = this.getParsedBody();
            final Object other$parsedBody = other.getParsedBody();
            if (this$parsedBody == null ? other$parsedBody != null : !this$parsedBody.equals(other$parsedBody))
                return false;
            final Object this$user = this.getUser();
            final Object other$user = other.getUser();
            if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof ResponseBodyParser.ParsedResponse;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $rawBody = this.getRawBody();
            result = result * PRIME + ($rawBody == null ? 43 : $rawBody.hashCode());
            final Object $parsedBody = this.getParsedBody();
            result = result * PRIME + ($parsedBody == null ? 43 : $parsedBody.hashCode());
            final Object $user = this.getUser();
            result = result * PRIME + ($user == null ? 43 : $user.hashCode());
            return result;
        }

        public String toString() {
            return "ResponseBodyParser.ParsedResponse(rawBody=" + this.getRawBody() + ", parsedBody=" + this.getParsedBody() + ", user=" + this.getUser() + ")";
        }
    }

    T jsonNodeToObject(JsonNode node) {
        try {
            return restClient.getObjectMapper().treeToValue(node, parseTo);
        } catch (JsonProcessingException ex) {
            logger.debug("Could not parse node to object successfully", ex);
            return null;
        }
    }

    ParsedResponse<T> parseResponse(Response response) throws BodyParsingException {
        if (response.body() == null) {
            throw new BodyParsingException("No body returned in response");
        }

        JsonNode rawBody;
        try (response) {
            rawBody = restClient.getObjectMapper().readTree(response.body().string());
        } catch (IOException ex) {
            throw new BodyParsingException(ex);
        }

        if (!response.isSuccessful() || parseTo.equals(Void.class)) {
            return new ParsedResponse<>(rawBody, null, null);
        }

        User newUser = null;
        if (user != null && rawBody.get("user") != null) {
            newUser = new UserImpl(rawBody.get("user"), null, null, null, null, null);
        }

        if (key == "listProvidersAPIRoot") {
            try {
                var parsed = List.of(restClient.getObjectMapper().treeToValue(rawBody, parseTo)); 
                return new ParsedResponse<>(rawBody, parsed, newUser);
            } catch (JsonProcessingException ex) {
                throw new BodyParsingException(ex);
            }
        }

        if (rawBody.get(key) == null) {
            return new ParsedResponse<>(rawBody, null, newUser);
        }

        if (!rawBody.get(key).isArray()) {
            logger.debug("Inner key is not an array, attempting to parse it into a single object");
            try {
                return new ParsedResponse<>(
                        rawBody,
                        List.of(restClient.getObjectMapper().treeToValue(rawBody.get(key), parseTo)),
                        newUser
                );
            } catch (JsonProcessingException ex) {
                throw new BodyParsingException(ex);
            }
        }

        if (rawBody.get(key).isEmpty()) {
            return new ParsedResponse<>(rawBody, Collections.emptyList(), newUser);
        }

        var parsed =  StreamSupport.stream(rawBody.get(key).spliterator(), false)
                .map(this::jsonNodeToObject)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return new ParsedResponse<>(rawBody, parsed, newUser);
    }

    public TerraApiResponse<T> toTerraApiResponse(Response response) {
        try {
            var parsed = parseResponse(response);
            return new TerraApiResponseImpl<>(response, parsed.getParsedBody(), parsed.getRawBody(), parsed.getUser());
        } catch (BodyParsingException e) {
            throw new TerraRuntimeException(e);
        }
    }
}
