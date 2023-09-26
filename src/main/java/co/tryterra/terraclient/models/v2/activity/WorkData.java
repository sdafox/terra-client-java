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

package co.tryterra.terraclient.models.v2.activity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkData {
    @JsonProperty("work_kilojoules")
    private Double workKilojoules;

    public WorkData() {
    }

    public Double getWorkKilojoules() {
        return this.workKilojoules;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WorkData)) return false;
        final WorkData other = (WorkData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$workKilojoules = this.getWorkKilojoules();
        final Object other$workKilojoules = other.getWorkKilojoules();
        if (this$workKilojoules == null ? other$workKilojoules != null : !this$workKilojoules.equals(other$workKilojoules))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WorkData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $workKilojoules = this.getWorkKilojoules();
        result = result * PRIME + ($workKilojoules == null ? 43 : $workKilojoules.hashCode());
        return result;
    }

    public String toString() {
        return "WorkData(workKilojoules=" + this.getWorkKilojoules() + ")";
    }
}
