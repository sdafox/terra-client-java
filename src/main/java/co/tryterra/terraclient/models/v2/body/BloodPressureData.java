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

package co.tryterra.terraclient.models.v2.body;

import co.tryterra.terraclient.models.v2.samples.BloodPressureSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BloodPressureData {
    @JsonProperty("blood_pressure_samples")
    private List<BloodPressureSample> bloodPressureSamples;

    public BloodPressureData() {
    }

    public List<BloodPressureSample> getBloodPressureSamples() {
        return this.bloodPressureSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BloodPressureData)) return false;
        final BloodPressureData other = (BloodPressureData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$bloodPressureSamples = this.getBloodPressureSamples();
        final Object other$bloodPressureSamples = other.getBloodPressureSamples();
        if (this$bloodPressureSamples == null ? other$bloodPressureSamples != null : !this$bloodPressureSamples.equals(other$bloodPressureSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BloodPressureData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $bloodPressureSamples = this.getBloodPressureSamples();
        result = result * PRIME + ($bloodPressureSamples == null ? 43 : $bloodPressureSamples.hashCode());
        return result;
    }

    public String toString() {
        return "BloodPressureData(bloodPressureSamples=" + this.getBloodPressureSamples() + ")";
    }
}
