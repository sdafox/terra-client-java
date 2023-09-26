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

package co.tryterra.terraclient.models;

import co.tryterra.terraclient.api.User;

public class RequestProcessing {
    private final User user;
    private final String reference;

    public RequestProcessing(User user, String reference) {
        this.user = user;
        this.reference = reference;
    }

    public User getUser() {
        return this.user;
    }

    public String getReference() {
        return this.reference;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RequestProcessing)) return false;
        final RequestProcessing other = (RequestProcessing) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$reference = this.getReference();
        final Object other$reference = other.getReference();
        if (this$reference == null ? other$reference != null : !this$reference.equals(other$reference)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RequestProcessing;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $reference = this.getReference();
        result = result * PRIME + ($reference == null ? 43 : $reference.hashCode());
        return result;
    }

    public String toString() {
        return "RequestProcessing(user=" + this.getUser() + ", reference=" + this.getReference() + ")";
    }
}
