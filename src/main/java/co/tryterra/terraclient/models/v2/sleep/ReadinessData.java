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

package co.tryterra.terraclient.models.v2.sleep;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReadinessData {
    private Integer readiness;
    @JsonProperty("recovery_level")
    private Integer recoveryLevel;

    public ReadinessData() {
    }

    public Integer getReadiness() {
        return this.readiness;
    }

    public Integer getRecoveryLevel() {
        return this.recoveryLevel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReadinessData)) return false;
        final ReadinessData other = (ReadinessData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$readiness = this.getReadiness();
        final Object other$readiness = other.getReadiness();
        if (this$readiness == null ? other$readiness != null : !this$readiness.equals(other$readiness)) return false;
        final Object this$recoveryLevel = this.getRecoveryLevel();
        final Object other$recoveryLevel = other.getRecoveryLevel();
        if (this$recoveryLevel == null ? other$recoveryLevel != null : !this$recoveryLevel.equals(other$recoveryLevel))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReadinessData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $readiness = this.getReadiness();
        result = result * PRIME + ($readiness == null ? 43 : $readiness.hashCode());
        final Object $recoveryLevel = this.getRecoveryLevel();
        result = result * PRIME + ($recoveryLevel == null ? 43 : $recoveryLevel.hashCode());
        return result;
    }

    public String toString() {
        return "ReadinessData(readiness=" + this.getReadiness() + ", recoveryLevel=" + this.getRecoveryLevel() + ")";
    }
}
