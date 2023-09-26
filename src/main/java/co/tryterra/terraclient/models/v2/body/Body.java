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

import co.tryterra.terraclient.models.v2.common.DeviceData;
import co.tryterra.terraclient.models.v2.common.Metadata;
import co.tryterra.terraclient.models.v2.common.OxygenData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
    @JsonProperty("blood_pressure_data")
    private BloodPressureData bloodPressureData;
    @JsonProperty("device_data")
    private DeviceData deviceData;
    @JsonProperty("glucose_data")
    private GlucoseData glucoseData;
    @JsonProperty("heart_data")
    private HeartData heartData;
    @JsonProperty("hydration_data")
    private HydrationData hydrationData;
    @JsonProperty("measurements_data")
    private MeasurementsData measurementsData;
    private Metadata metadata;
    @JsonProperty("oxygen_data")
    private OxygenData oxygenData;
    @JsonProperty("temperature_data")
    private TemperatureData temperatureData;

    public Body() {
    }

    public BloodPressureData getBloodPressureData() {
        return this.bloodPressureData;
    }

    public DeviceData getDeviceData() {
        return this.deviceData;
    }

    public GlucoseData getGlucoseData() {
        return this.glucoseData;
    }

    public HeartData getHeartData() {
        return this.heartData;
    }

    public HydrationData getHydrationData() {
        return this.hydrationData;
    }

    public MeasurementsData getMeasurementsData() {
        return this.measurementsData;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public OxygenData getOxygenData() {
        return this.oxygenData;
    }

    public TemperatureData getTemperatureData() {
        return this.temperatureData;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Body)) return false;
        final Body other = (Body) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$bloodPressureData = this.getBloodPressureData();
        final Object other$bloodPressureData = other.getBloodPressureData();
        if (this$bloodPressureData == null ? other$bloodPressureData != null : !this$bloodPressureData.equals(other$bloodPressureData))
            return false;
        final Object this$deviceData = this.getDeviceData();
        final Object other$deviceData = other.getDeviceData();
        if (this$deviceData == null ? other$deviceData != null : !this$deviceData.equals(other$deviceData))
            return false;
        final Object this$glucoseData = this.getGlucoseData();
        final Object other$glucoseData = other.getGlucoseData();
        if (this$glucoseData == null ? other$glucoseData != null : !this$glucoseData.equals(other$glucoseData))
            return false;
        final Object this$heartData = this.getHeartData();
        final Object other$heartData = other.getHeartData();
        if (this$heartData == null ? other$heartData != null : !this$heartData.equals(other$heartData)) return false;
        final Object this$hydrationData = this.getHydrationData();
        final Object other$hydrationData = other.getHydrationData();
        if (this$hydrationData == null ? other$hydrationData != null : !this$hydrationData.equals(other$hydrationData))
            return false;
        final Object this$measurementsData = this.getMeasurementsData();
        final Object other$measurementsData = other.getMeasurementsData();
        if (this$measurementsData == null ? other$measurementsData != null : !this$measurementsData.equals(other$measurementsData))
            return false;
        final Object this$metadata = this.getMetadata();
        final Object other$metadata = other.getMetadata();
        if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
        final Object this$oxygenData = this.getOxygenData();
        final Object other$oxygenData = other.getOxygenData();
        if (this$oxygenData == null ? other$oxygenData != null : !this$oxygenData.equals(other$oxygenData))
            return false;
        final Object this$temperatureData = this.getTemperatureData();
        final Object other$temperatureData = other.getTemperatureData();
        if (this$temperatureData == null ? other$temperatureData != null : !this$temperatureData.equals(other$temperatureData))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Body;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $bloodPressureData = this.getBloodPressureData();
        result = result * PRIME + ($bloodPressureData == null ? 43 : $bloodPressureData.hashCode());
        final Object $deviceData = this.getDeviceData();
        result = result * PRIME + ($deviceData == null ? 43 : $deviceData.hashCode());
        final Object $glucoseData = this.getGlucoseData();
        result = result * PRIME + ($glucoseData == null ? 43 : $glucoseData.hashCode());
        final Object $heartData = this.getHeartData();
        result = result * PRIME + ($heartData == null ? 43 : $heartData.hashCode());
        final Object $hydrationData = this.getHydrationData();
        result = result * PRIME + ($hydrationData == null ? 43 : $hydrationData.hashCode());
        final Object $measurementsData = this.getMeasurementsData();
        result = result * PRIME + ($measurementsData == null ? 43 : $measurementsData.hashCode());
        final Object $metadata = this.getMetadata();
        result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
        final Object $oxygenData = this.getOxygenData();
        result = result * PRIME + ($oxygenData == null ? 43 : $oxygenData.hashCode());
        final Object $temperatureData = this.getTemperatureData();
        result = result * PRIME + ($temperatureData == null ? 43 : $temperatureData.hashCode());
        return result;
    }

    public String toString() {
        return "Body(bloodPressureData=" + this.getBloodPressureData() + ", deviceData=" + this.getDeviceData() + ", glucoseData=" + this.getGlucoseData() + ", heartData=" + this.getHeartData() + ", hydrationData=" + this.getHydrationData() + ", measurementsData=" + this.getMeasurementsData() + ", metadata=" + this.getMetadata() + ", oxygenData=" + this.getOxygenData() + ", temperatureData=" + this.getTemperatureData() + ")";
    }
}
