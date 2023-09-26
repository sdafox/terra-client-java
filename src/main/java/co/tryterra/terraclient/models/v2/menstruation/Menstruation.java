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

package co.tryterra.terraclient.models.v2.menstruation;

import co.tryterra.terraclient.models.v2.common.Metadata;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Menstruation {
    private Metadata metadata;
    @JsonProperty("menstruation_data")
    private MenstruationData menstruationData;

    public Menstruation() {
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public MenstruationData getMenstruationData() {
        return this.menstruationData;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Menstruation)) return false;
        final Menstruation other = (Menstruation) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$metadata = this.getMetadata();
        final Object other$metadata = other.getMetadata();
        if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
        final Object this$menstruationData = this.getMenstruationData();
        final Object other$menstruationData = other.getMenstruationData();
        if (this$menstruationData == null ? other$menstruationData != null : !this$menstruationData.equals(other$menstruationData))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Menstruation;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $metadata = this.getMetadata();
        result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
        final Object $menstruationData = this.getMenstruationData();
        result = result * PRIME + ($menstruationData == null ? 43 : $menstruationData.hashCode());
        return result;
    }

    public String toString() {
        return "Menstruation(metadata=" + this.getMetadata() + ", menstruationData=" + this.getMenstruationData() + ")";
    }
}
