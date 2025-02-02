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

@JsonIgnoreProperties(ignoreUnknown = true)
public class TemperatureData {
    private Double delta;

    public TemperatureData() {
    }

    public Double getDelta() {
        return this.delta;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TemperatureData)) return false;
        final TemperatureData other = (TemperatureData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$delta = this.getDelta();
        final Object other$delta = other.getDelta();
        if (this$delta == null ? other$delta != null : !this$delta.equals(other$delta)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TemperatureData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $delta = this.getDelta();
        result = result * PRIME + ($delta == null ? 43 : $delta.hashCode());
        return result;
    }

    public String toString() {
        return "TemperatureData(delta=" + this.getDelta() + ")";
    }
}
