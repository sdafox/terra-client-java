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

public class ReauthData {
    private final User oldUser;
    private final User newUser;

    public ReauthData(User oldUser, User newUser) {
        this.oldUser = oldUser;
        this.newUser = newUser;
    }

    public User getOldUser() {
        return this.oldUser;
    }

    public User getNewUser() {
        return this.newUser;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReauthData)) return false;
        final ReauthData other = (ReauthData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$oldUser = this.getOldUser();
        final Object other$oldUser = other.getOldUser();
        if (this$oldUser == null ? other$oldUser != null : !this$oldUser.equals(other$oldUser)) return false;
        final Object this$newUser = this.getNewUser();
        final Object other$newUser = other.getNewUser();
        if (this$newUser == null ? other$newUser != null : !this$newUser.equals(other$newUser)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReauthData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $oldUser = this.getOldUser();
        result = result * PRIME + ($oldUser == null ? 43 : $oldUser.hashCode());
        final Object $newUser = this.getNewUser();
        result = result * PRIME + ($newUser == null ? 43 : $newUser.hashCode());
        return result;
    }

    public String toString() {
        return "ReauthData(oldUser=" + this.getOldUser() + ", newUser=" + this.getNewUser() + ")";
    }
}
