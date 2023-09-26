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

public class AuthData {
    private final User user;
    private final String referenceId;
    private final String widgetSessionId;

    public AuthData(User user, String referenceId, String widgetSessionId) {
        this.user = user;
        this.referenceId = referenceId;
        this.widgetSessionId = widgetSessionId;
    }

    public User getUser() {
        return this.user;
    }

    public String getReferenceId() {
        return this.referenceId;
    }

    public String getWidgetSessionId() {
        return this.widgetSessionId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthData)) return false;
        final AuthData other = (AuthData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$referenceId = this.getReferenceId();
        final Object other$referenceId = other.getReferenceId();
        if (this$referenceId == null ? other$referenceId != null : !this$referenceId.equals(other$referenceId))
            return false;
        final Object this$widgetSessionId = this.getWidgetSessionId();
        final Object other$widgetSessionId = other.getWidgetSessionId();
        if (this$widgetSessionId == null ? other$widgetSessionId != null : !this$widgetSessionId.equals(other$widgetSessionId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AuthData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $referenceId = this.getReferenceId();
        result = result * PRIME + ($referenceId == null ? 43 : $referenceId.hashCode());
        final Object $widgetSessionId = this.getWidgetSessionId();
        result = result * PRIME + ($widgetSessionId == null ? 43 : $widgetSessionId.hashCode());
        return result;
    }

    public String toString() {
        return "AuthData(user=" + this.getUser() + ", referenceId=" + this.getReferenceId() + ", widgetSessionId=" + this.getWidgetSessionId() + ")";
    }
}
