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

package co.tryterra.terraclient.models.v2.common;

import co.tryterra.terraclient.models.v2.samples.HeartRateDataSample;
import co.tryterra.terraclient.models.v2.samples.HeartRateVariabilityDataSampleSdnn;
import co.tryterra.terraclient.models.v2.samples.HeartRateVariablilitySampleRmssd;
import co.tryterra.terraclient.models.v2.samples.HeartRateZoneData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeartRateData {
    public HeartRateData() {
    }

    public Summary getSummary() {
        return this.summary;
    }

    public Detailed getDetailed() {
        return this.detailed;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HeartRateData)) return false;
        final HeartRateData other = (HeartRateData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$summary = this.getSummary();
        final Object other$summary = other.getSummary();
        if (this$summary == null ? other$summary != null : !this$summary.equals(other$summary)) return false;
        final Object this$detailed = this.getDetailed();
        final Object other$detailed = other.getDetailed();
        if (this$detailed == null ? other$detailed != null : !this$detailed.equals(other$detailed)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HeartRateData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $summary = this.getSummary();
        result = result * PRIME + ($summary == null ? 43 : $summary.hashCode());
        final Object $detailed = this.getDetailed();
        result = result * PRIME + ($detailed == null ? 43 : $detailed.hashCode());
        return result;
    }

    public String toString() {
        return "HeartRateData(summary=" + this.getSummary() + ", detailed=" + this.getDetailed() + ")";
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Summary {
        @JsonProperty("max_hr_bpm")
        public Integer maxHrBpm;
        @JsonProperty("resting_hr_bpm")
        public Integer restingHrBpm;
        @JsonProperty("avg_hrv_rmssd")
        public Double avgHrvRmssd;
        @JsonProperty("min_hr_bpm")
        public Integer minHrBpm;
        @JsonProperty("user_max_hr_bpm")
        public Integer userMaxHrBpm;
        @JsonProperty("avg_hrv_sdnn")
        public Double avgHrvSdnn;
        @JsonProperty("avg_hr_bpm")
        public Integer avgHrBpm;
        @JsonProperty("hr_zone_data")
        public List<HeartRateZoneData> hrZoneData;

        public Summary() {
        }

        public Integer getMaxHrBpm() {
            return this.maxHrBpm;
        }

        public Integer getRestingHrBpm() {
            return this.restingHrBpm;
        }

        public Double getAvgHrvRmssd() {
            return this.avgHrvRmssd;
        }

        public Integer getMinHrBpm() {
            return this.minHrBpm;
        }

        public Integer getUserMaxHrBpm() {
            return this.userMaxHrBpm;
        }

        public Double getAvgHrvSdnn() {
            return this.avgHrvSdnn;
        }

        public Integer getAvgHrBpm() {
            return this.avgHrBpm;
        }

        public List<HeartRateZoneData> getHrZoneData() {
            return this.hrZoneData;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Summary)) return false;
            final Summary other = (Summary) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$maxHrBpm = this.getMaxHrBpm();
            final Object other$maxHrBpm = other.getMaxHrBpm();
            if (this$maxHrBpm == null ? other$maxHrBpm != null : !this$maxHrBpm.equals(other$maxHrBpm)) return false;
            final Object this$restingHrBpm = this.getRestingHrBpm();
            final Object other$restingHrBpm = other.getRestingHrBpm();
            if (this$restingHrBpm == null ? other$restingHrBpm != null : !this$restingHrBpm.equals(other$restingHrBpm))
                return false;
            final Object this$avgHrvRmssd = this.getAvgHrvRmssd();
            final Object other$avgHrvRmssd = other.getAvgHrvRmssd();
            if (this$avgHrvRmssd == null ? other$avgHrvRmssd != null : !this$avgHrvRmssd.equals(other$avgHrvRmssd))
                return false;
            final Object this$minHrBpm = this.getMinHrBpm();
            final Object other$minHrBpm = other.getMinHrBpm();
            if (this$minHrBpm == null ? other$minHrBpm != null : !this$minHrBpm.equals(other$minHrBpm)) return false;
            final Object this$userMaxHrBpm = this.getUserMaxHrBpm();
            final Object other$userMaxHrBpm = other.getUserMaxHrBpm();
            if (this$userMaxHrBpm == null ? other$userMaxHrBpm != null : !this$userMaxHrBpm.equals(other$userMaxHrBpm))
                return false;
            final Object this$avgHrvSdnn = this.getAvgHrvSdnn();
            final Object other$avgHrvSdnn = other.getAvgHrvSdnn();
            if (this$avgHrvSdnn == null ? other$avgHrvSdnn != null : !this$avgHrvSdnn.equals(other$avgHrvSdnn))
                return false;
            final Object this$avgHrBpm = this.getAvgHrBpm();
            final Object other$avgHrBpm = other.getAvgHrBpm();
            if (this$avgHrBpm == null ? other$avgHrBpm != null : !this$avgHrBpm.equals(other$avgHrBpm)) return false;
            final Object this$hrZoneData = this.getHrZoneData();
            final Object other$hrZoneData = other.getHrZoneData();
            if (this$hrZoneData == null ? other$hrZoneData != null : !this$hrZoneData.equals(other$hrZoneData))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Summary;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $maxHrBpm = this.getMaxHrBpm();
            result = result * PRIME + ($maxHrBpm == null ? 43 : $maxHrBpm.hashCode());
            final Object $restingHrBpm = this.getRestingHrBpm();
            result = result * PRIME + ($restingHrBpm == null ? 43 : $restingHrBpm.hashCode());
            final Object $avgHrvRmssd = this.getAvgHrvRmssd();
            result = result * PRIME + ($avgHrvRmssd == null ? 43 : $avgHrvRmssd.hashCode());
            final Object $minHrBpm = this.getMinHrBpm();
            result = result * PRIME + ($minHrBpm == null ? 43 : $minHrBpm.hashCode());
            final Object $userMaxHrBpm = this.getUserMaxHrBpm();
            result = result * PRIME + ($userMaxHrBpm == null ? 43 : $userMaxHrBpm.hashCode());
            final Object $avgHrvSdnn = this.getAvgHrvSdnn();
            result = result * PRIME + ($avgHrvSdnn == null ? 43 : $avgHrvSdnn.hashCode());
            final Object $avgHrBpm = this.getAvgHrBpm();
            result = result * PRIME + ($avgHrBpm == null ? 43 : $avgHrBpm.hashCode());
            final Object $hrZoneData = this.getHrZoneData();
            result = result * PRIME + ($hrZoneData == null ? 43 : $hrZoneData.hashCode());
            return result;
        }

        public String toString() {
            return "HeartRateData.Summary(maxHrBpm=" + this.getMaxHrBpm() + ", restingHrBpm=" + this.getRestingHrBpm() + ", avgHrvRmssd=" + this.getAvgHrvRmssd() + ", minHrBpm=" + this.getMinHrBpm() + ", userMaxHrBpm=" + this.getUserMaxHrBpm() + ", avgHrvSdnn=" + this.getAvgHrvSdnn() + ", avgHrBpm=" + this.getAvgHrBpm() + ", hrZoneData=" + this.getHrZoneData() + ")";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Detailed {
        @JsonProperty("hr_samples")
        private List<HeartRateDataSample> hrSamples;
        @JsonProperty("hrv_samples_sdnn")
        private List<HeartRateVariabilityDataSampleSdnn> hrvSamplesSdnn;
        @JsonProperty("hrv_samples_rmssd")
        private List<HeartRateVariablilitySampleRmssd> hrvSamplesRmssd;

        public Detailed() {
        }

        public List<HeartRateDataSample> getHrSamples() {
            return this.hrSamples;
        }

        public List<HeartRateVariabilityDataSampleSdnn> getHrvSamplesSdnn() {
            return this.hrvSamplesSdnn;
        }

        public List<HeartRateVariablilitySampleRmssd> getHrvSamplesRmssd() {
            return this.hrvSamplesRmssd;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Detailed)) return false;
            final Detailed other = (Detailed) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$hrSamples = this.getHrSamples();
            final Object other$hrSamples = other.getHrSamples();
            if (this$hrSamples == null ? other$hrSamples != null : !this$hrSamples.equals(other$hrSamples))
                return false;
            final Object this$hrvSamplesSdnn = this.getHrvSamplesSdnn();
            final Object other$hrvSamplesSdnn = other.getHrvSamplesSdnn();
            if (this$hrvSamplesSdnn == null ? other$hrvSamplesSdnn != null : !this$hrvSamplesSdnn.equals(other$hrvSamplesSdnn))
                return false;
            final Object this$hrvSamplesRmssd = this.getHrvSamplesRmssd();
            final Object other$hrvSamplesRmssd = other.getHrvSamplesRmssd();
            if (this$hrvSamplesRmssd == null ? other$hrvSamplesRmssd != null : !this$hrvSamplesRmssd.equals(other$hrvSamplesRmssd))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Detailed;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $hrSamples = this.getHrSamples();
            result = result * PRIME + ($hrSamples == null ? 43 : $hrSamples.hashCode());
            final Object $hrvSamplesSdnn = this.getHrvSamplesSdnn();
            result = result * PRIME + ($hrvSamplesSdnn == null ? 43 : $hrvSamplesSdnn.hashCode());
            final Object $hrvSamplesRmssd = this.getHrvSamplesRmssd();
            result = result * PRIME + ($hrvSamplesRmssd == null ? 43 : $hrvSamplesRmssd.hashCode());
            return result;
        }

        public String toString() {
            return "HeartRateData.Detailed(hrSamples=" + this.getHrSamples() + ", hrvSamplesSdnn=" + this.getHrvSamplesSdnn() + ", hrvSamplesRmssd=" + this.getHrvSamplesRmssd() + ")";
        }
    }

    private Summary summary;
    private Detailed detailed;
}
