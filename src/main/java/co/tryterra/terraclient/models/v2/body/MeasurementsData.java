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

import co.tryterra.terraclient.models.v2.samples.MeasurementDataSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MeasurementsData {
    private List<MeasurementDataSample> measurements;

    public MeasurementsData() {
    }

    public List<MeasurementDataSample> getMeasurements() {
        return this.measurements;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MeasurementsData)) return false;
        final MeasurementsData other = (MeasurementsData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$measurements = this.getMeasurements();
        final Object other$measurements = other.getMeasurements();
        if (this$measurements == null ? other$measurements != null : !this$measurements.equals(other$measurements))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MeasurementsData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $measurements = this.getMeasurements();
        result = result * PRIME + ($measurements == null ? 43 : $measurements.hashCode());
        return result;
    }

    public String toString() {
        return "MeasurementsData(measurements=" + this.getMeasurements() + ")";
    }
}
