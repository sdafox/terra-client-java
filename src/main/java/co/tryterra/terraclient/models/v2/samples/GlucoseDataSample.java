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

package co.tryterra.terraclient.models.v2.samples;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GlucoseDataSample {
    private String timestamp;
    @JsonProperty("blood_glucose_mg_per_dL")
    private Double bloodGlucoseMgPerDl;
    @JsonProperty("glucose_level_flag")
    private Integer glucoseLevelFlag;
    @JsonProperty("trend_arrow")
    private Integer trendArrow;

    public GlucoseDataSample() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Double getBloodGlucoseMgPerDl() {
        return this.bloodGlucoseMgPerDl;
    }

    public Integer getGlucoseLevelFlag() {
        return this.glucoseLevelFlag;
    }

    public Integer getTrendArrow() {
        return this.trendArrow;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GlucoseDataSample)) return false;
        final GlucoseDataSample other = (GlucoseDataSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$bloodGlucoseMgPerDl = this.getBloodGlucoseMgPerDl();
        final Object other$bloodGlucoseMgPerDl = other.getBloodGlucoseMgPerDl();
        if (this$bloodGlucoseMgPerDl == null ? other$bloodGlucoseMgPerDl != null : !this$bloodGlucoseMgPerDl.equals(other$bloodGlucoseMgPerDl))
            return false;
        final Object this$glucoseLevelFlag = this.getGlucoseLevelFlag();
        final Object other$glucoseLevelFlag = other.getGlucoseLevelFlag();
        if (this$glucoseLevelFlag == null ? other$glucoseLevelFlag != null : !this$glucoseLevelFlag.equals(other$glucoseLevelFlag))
            return false;
        final Object this$trendArrow = this.getTrendArrow();
        final Object other$trendArrow = other.getTrendArrow();
        if (this$trendArrow == null ? other$trendArrow != null : !this$trendArrow.equals(other$trendArrow))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GlucoseDataSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $bloodGlucoseMgPerDl = this.getBloodGlucoseMgPerDl();
        result = result * PRIME + ($bloodGlucoseMgPerDl == null ? 43 : $bloodGlucoseMgPerDl.hashCode());
        final Object $glucoseLevelFlag = this.getGlucoseLevelFlag();
        result = result * PRIME + ($glucoseLevelFlag == null ? 43 : $glucoseLevelFlag.hashCode());
        final Object $trendArrow = this.getTrendArrow();
        result = result * PRIME + ($trendArrow == null ? 43 : $trendArrow.hashCode());
        return result;
    }

    public String toString() {
        return "GlucoseDataSample(timestamp=" + this.getTimestamp() + ", bloodGlucoseMgPerDl=" + this.getBloodGlucoseMgPerDl() + ", glucoseLevelFlag=" + this.getGlucoseLevelFlag() + ", trendArrow=" + this.getTrendArrow() + ")";
    }
}
