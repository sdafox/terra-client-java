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

import co.tryterra.terraclient.models.v2.samples.BreathSample;
import co.tryterra.terraclient.models.v2.samples.OxygenSaturationSample;
import co.tryterra.terraclient.models.v2.samples.SnoringSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RespirationData {
    public RespirationData() {
    }

    public BreathsData getBreathsData() {
        return this.breathsData;
    }

    public SnoringData getSnoringData() {
        return this.snoringData;
    }

    public OxygenSaturationData getOxygenSaturationData() {
        return this.oxygenSaturationData;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RespirationData)) return false;
        final RespirationData other = (RespirationData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$breathsData = this.getBreathsData();
        final Object other$breathsData = other.getBreathsData();
        if (this$breathsData == null ? other$breathsData != null : !this$breathsData.equals(other$breathsData))
            return false;
        final Object this$snoringData = this.getSnoringData();
        final Object other$snoringData = other.getSnoringData();
        if (this$snoringData == null ? other$snoringData != null : !this$snoringData.equals(other$snoringData))
            return false;
        final Object this$oxygenSaturationData = this.getOxygenSaturationData();
        final Object other$oxygenSaturationData = other.getOxygenSaturationData();
        if (this$oxygenSaturationData == null ? other$oxygenSaturationData != null : !this$oxygenSaturationData.equals(other$oxygenSaturationData))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RespirationData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $breathsData = this.getBreathsData();
        result = result * PRIME + ($breathsData == null ? 43 : $breathsData.hashCode());
        final Object $snoringData = this.getSnoringData();
        result = result * PRIME + ($snoringData == null ? 43 : $snoringData.hashCode());
        final Object $oxygenSaturationData = this.getOxygenSaturationData();
        result = result * PRIME + ($oxygenSaturationData == null ? 43 : $oxygenSaturationData.hashCode());
        return result;
    }

    public String toString() {
        return "RespirationData(breathsData=" + this.getBreathsData() + ", snoringData=" + this.getSnoringData() + ", oxygenSaturationData=" + this.getOxygenSaturationData() + ")";
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BreathsData {
        @JsonProperty("min_breaths_per_min")
        private Double minBreathsPerMin;
        @JsonProperty("avg_breaths_per_min")
        private Double avgBreathsPerMin;
        @JsonProperty("max_breaths_per_min")
        private Double maxBreathsPerMin;
        @JsonProperty("on_demand_reading")
        private Boolean onDemandReading;
        @JsonProperty("start_time")
        private String startTime;
        @JsonProperty("end_time")
        private String endTime;
        private List<BreathSample> samples;

        public BreathsData() {
        }

        public Double getMinBreathsPerMin() {
            return this.minBreathsPerMin;
        }

        public Double getAvgBreathsPerMin() {
            return this.avgBreathsPerMin;
        }

        public Double getMaxBreathsPerMin() {
            return this.maxBreathsPerMin;
        }

        public Boolean getOnDemandReading() {
            return this.onDemandReading;
        }

        public String getStartTime() {
            return this.startTime;
        }

        public String getEndTime() {
            return this.endTime;
        }

        public List<BreathSample> getSamples() {
            return this.samples;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof BreathsData)) return false;
            final BreathsData other = (BreathsData) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$minBreathsPerMin = this.getMinBreathsPerMin();
            final Object other$minBreathsPerMin = other.getMinBreathsPerMin();
            if (this$minBreathsPerMin == null ? other$minBreathsPerMin != null : !this$minBreathsPerMin.equals(other$minBreathsPerMin))
                return false;
            final Object this$avgBreathsPerMin = this.getAvgBreathsPerMin();
            final Object other$avgBreathsPerMin = other.getAvgBreathsPerMin();
            if (this$avgBreathsPerMin == null ? other$avgBreathsPerMin != null : !this$avgBreathsPerMin.equals(other$avgBreathsPerMin))
                return false;
            final Object this$maxBreathsPerMin = this.getMaxBreathsPerMin();
            final Object other$maxBreathsPerMin = other.getMaxBreathsPerMin();
            if (this$maxBreathsPerMin == null ? other$maxBreathsPerMin != null : !this$maxBreathsPerMin.equals(other$maxBreathsPerMin))
                return false;
            final Object this$onDemandReading = this.getOnDemandReading();
            final Object other$onDemandReading = other.getOnDemandReading();
            if (this$onDemandReading == null ? other$onDemandReading != null : !this$onDemandReading.equals(other$onDemandReading))
                return false;
            final Object this$startTime = this.getStartTime();
            final Object other$startTime = other.getStartTime();
            if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime))
                return false;
            final Object this$endTime = this.getEndTime();
            final Object other$endTime = other.getEndTime();
            if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
            final Object this$samples = this.getSamples();
            final Object other$samples = other.getSamples();
            if (this$samples == null ? other$samples != null : !this$samples.equals(other$samples)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof BreathsData;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $minBreathsPerMin = this.getMinBreathsPerMin();
            result = result * PRIME + ($minBreathsPerMin == null ? 43 : $minBreathsPerMin.hashCode());
            final Object $avgBreathsPerMin = this.getAvgBreathsPerMin();
            result = result * PRIME + ($avgBreathsPerMin == null ? 43 : $avgBreathsPerMin.hashCode());
            final Object $maxBreathsPerMin = this.getMaxBreathsPerMin();
            result = result * PRIME + ($maxBreathsPerMin == null ? 43 : $maxBreathsPerMin.hashCode());
            final Object $onDemandReading = this.getOnDemandReading();
            result = result * PRIME + ($onDemandReading == null ? 43 : $onDemandReading.hashCode());
            final Object $startTime = this.getStartTime();
            result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
            final Object $endTime = this.getEndTime();
            result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
            final Object $samples = this.getSamples();
            result = result * PRIME + ($samples == null ? 43 : $samples.hashCode());
            return result;
        }

        public String toString() {
            return "RespirationData.BreathsData(minBreathsPerMin=" + this.getMinBreathsPerMin() + ", avgBreathsPerMin=" + this.getAvgBreathsPerMin() + ", maxBreathsPerMin=" + this.getMaxBreathsPerMin() + ", onDemandReading=" + this.getOnDemandReading() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", samples=" + this.getSamples() + ")";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SnoringData {
        @JsonProperty("num_snoring_events")
        private Integer numSnoringEvents;
        @JsonProperty("total_snoring_duration_seconds")
        private Integer totalSnoringDurationSeconds;
        @JsonProperty("start_time")
        private String startTime;
        @JsonProperty("end_time")
        private String endTime;
        private List<SnoringSample> samples;

        public SnoringData() {
        }

        public Integer getNumSnoringEvents() {
            return this.numSnoringEvents;
        }

        public Integer getTotalSnoringDurationSeconds() {
            return this.totalSnoringDurationSeconds;
        }

        public String getStartTime() {
            return this.startTime;
        }

        public String getEndTime() {
            return this.endTime;
        }

        public List<SnoringSample> getSamples() {
            return this.samples;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof SnoringData)) return false;
            final SnoringData other = (SnoringData) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$numSnoringEvents = this.getNumSnoringEvents();
            final Object other$numSnoringEvents = other.getNumSnoringEvents();
            if (this$numSnoringEvents == null ? other$numSnoringEvents != null : !this$numSnoringEvents.equals(other$numSnoringEvents))
                return false;
            final Object this$totalSnoringDurationSeconds = this.getTotalSnoringDurationSeconds();
            final Object other$totalSnoringDurationSeconds = other.getTotalSnoringDurationSeconds();
            if (this$totalSnoringDurationSeconds == null ? other$totalSnoringDurationSeconds != null : !this$totalSnoringDurationSeconds.equals(other$totalSnoringDurationSeconds))
                return false;
            final Object this$startTime = this.getStartTime();
            final Object other$startTime = other.getStartTime();
            if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime))
                return false;
            final Object this$endTime = this.getEndTime();
            final Object other$endTime = other.getEndTime();
            if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
            final Object this$samples = this.getSamples();
            final Object other$samples = other.getSamples();
            if (this$samples == null ? other$samples != null : !this$samples.equals(other$samples)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof SnoringData;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $numSnoringEvents = this.getNumSnoringEvents();
            result = result * PRIME + ($numSnoringEvents == null ? 43 : $numSnoringEvents.hashCode());
            final Object $totalSnoringDurationSeconds = this.getTotalSnoringDurationSeconds();
            result = result * PRIME + ($totalSnoringDurationSeconds == null ? 43 : $totalSnoringDurationSeconds.hashCode());
            final Object $startTime = this.getStartTime();
            result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
            final Object $endTime = this.getEndTime();
            result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
            final Object $samples = this.getSamples();
            result = result * PRIME + ($samples == null ? 43 : $samples.hashCode());
            return result;
        }

        public String toString() {
            return "RespirationData.SnoringData(numSnoringEvents=" + this.getNumSnoringEvents() + ", totalSnoringDurationSeconds=" + this.getTotalSnoringDurationSeconds() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", samples=" + this.getSamples() + ")";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OxygenSaturationData {
        @JsonProperty("start_time")
        private String startTime;
        @JsonProperty("end_time")
        private String endTime;
        private List<OxygenSaturationSample> samples;

        public OxygenSaturationData() {
        }

        public String getStartTime() {
            return this.startTime;
        }

        public String getEndTime() {
            return this.endTime;
        }

        public List<OxygenSaturationSample> getSamples() {
            return this.samples;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof OxygenSaturationData)) return false;
            final OxygenSaturationData other = (OxygenSaturationData) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$startTime = this.getStartTime();
            final Object other$startTime = other.getStartTime();
            if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime))
                return false;
            final Object this$endTime = this.getEndTime();
            final Object other$endTime = other.getEndTime();
            if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
            final Object this$samples = this.getSamples();
            final Object other$samples = other.getSamples();
            if (this$samples == null ? other$samples != null : !this$samples.equals(other$samples)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof OxygenSaturationData;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $startTime = this.getStartTime();
            result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
            final Object $endTime = this.getEndTime();
            result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
            final Object $samples = this.getSamples();
            result = result * PRIME + ($samples == null ? 43 : $samples.hashCode());
            return result;
        }

        public String toString() {
            return "RespirationData.OxygenSaturationData(startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", samples=" + this.getSamples() + ")";
        }
    }

    @JsonProperty("breaths_data")
    private BreathsData breathsData;
    @JsonProperty("snoring_data")
    private SnoringData snoringData;
    @JsonProperty("oxygen_saturation_data")
    private OxygenSaturationData oxygenSaturationData;
}
