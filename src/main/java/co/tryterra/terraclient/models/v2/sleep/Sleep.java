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

import co.tryterra.terraclient.models.v2.common.HeartRateData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sleep {
    private Metadata metadata;
    @JsonProperty("heart_rate_data")
    private HeartRateData heartRateData;
    @JsonProperty("sleep_durations_data")
    private SleepDurationsData sleepDurationsData;
    @JsonProperty("temperature_data")
    private TemperatureData temperatureData;
    @JsonProperty("readiness_data")
    private ReadinessData readinessData;
    @JsonProperty("respiration_data")
    private RespirationData respirationData;

    public Sleep() {
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public HeartRateData getHeartRateData() {
        return this.heartRateData;
    }

    public SleepDurationsData getSleepDurationsData() {
        return this.sleepDurationsData;
    }

    public TemperatureData getTemperatureData() {
        return this.temperatureData;
    }

    public ReadinessData getReadinessData() {
        return this.readinessData;
    }

    public RespirationData getRespirationData() {
        return this.respirationData;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Sleep)) return false;
        final Sleep other = (Sleep) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$metadata = this.getMetadata();
        final Object other$metadata = other.getMetadata();
        if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
        final Object this$heartRateData = this.getHeartRateData();
        final Object other$heartRateData = other.getHeartRateData();
        if (this$heartRateData == null ? other$heartRateData != null : !this$heartRateData.equals(other$heartRateData))
            return false;
        final Object this$sleepDurationsData = this.getSleepDurationsData();
        final Object other$sleepDurationsData = other.getSleepDurationsData();
        if (this$sleepDurationsData == null ? other$sleepDurationsData != null : !this$sleepDurationsData.equals(other$sleepDurationsData))
            return false;
        final Object this$temperatureData = this.getTemperatureData();
        final Object other$temperatureData = other.getTemperatureData();
        if (this$temperatureData == null ? other$temperatureData != null : !this$temperatureData.equals(other$temperatureData))
            return false;
        final Object this$readinessData = this.getReadinessData();
        final Object other$readinessData = other.getReadinessData();
        if (this$readinessData == null ? other$readinessData != null : !this$readinessData.equals(other$readinessData))
            return false;
        final Object this$respirationData = this.getRespirationData();
        final Object other$respirationData = other.getRespirationData();
        if (this$respirationData == null ? other$respirationData != null : !this$respirationData.equals(other$respirationData))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Sleep;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $metadata = this.getMetadata();
        result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
        final Object $heartRateData = this.getHeartRateData();
        result = result * PRIME + ($heartRateData == null ? 43 : $heartRateData.hashCode());
        final Object $sleepDurationsData = this.getSleepDurationsData();
        result = result * PRIME + ($sleepDurationsData == null ? 43 : $sleepDurationsData.hashCode());
        final Object $temperatureData = this.getTemperatureData();
        result = result * PRIME + ($temperatureData == null ? 43 : $temperatureData.hashCode());
        final Object $readinessData = this.getReadinessData();
        result = result * PRIME + ($readinessData == null ? 43 : $readinessData.hashCode());
        final Object $respirationData = this.getRespirationData();
        result = result * PRIME + ($respirationData == null ? 43 : $respirationData.hashCode());
        return result;
    }

    public String toString() {
        return "Sleep(metadata=" + this.getMetadata() + ", heartRateData=" + this.getHeartRateData() + ", sleepDurationsData=" + this.getSleepDurationsData() + ", temperatureData=" + this.getTemperatureData() + ", readinessData=" + this.getReadinessData() + ", respirationData=" + this.getRespirationData() + ")";
    }
}
