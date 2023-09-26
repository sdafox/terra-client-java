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
public class LapSample {
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;
    @JsonProperty("distance_meters")
    private Double distanceMeters;
    private Double calories;
    @JsonProperty("total_strokes")
    private Double totalStrokes;
    @JsonProperty("stroke_type")
    private Integer strokeType;
    @JsonProperty("avg_speed_meters_per_second")
    private Double avgSpeedMetersPerSecond;

    public LapSample() {
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public Double getDistanceMeters() {
        return this.distanceMeters;
    }

    public Double getCalories() {
        return this.calories;
    }

    public Double getTotalStrokes() {
        return this.totalStrokes;
    }

    public Integer getStrokeType() {
        return this.strokeType;
    }

    public Double getAvgSpeedMetersPerSecond() {
        return this.avgSpeedMetersPerSecond;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LapSample)) return false;
        final LapSample other = (LapSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        final Object this$distanceMeters = this.getDistanceMeters();
        final Object other$distanceMeters = other.getDistanceMeters();
        if (this$distanceMeters == null ? other$distanceMeters != null : !this$distanceMeters.equals(other$distanceMeters))
            return false;
        final Object this$calories = this.getCalories();
        final Object other$calories = other.getCalories();
        if (this$calories == null ? other$calories != null : !this$calories.equals(other$calories)) return false;
        final Object this$totalStrokes = this.getTotalStrokes();
        final Object other$totalStrokes = other.getTotalStrokes();
        if (this$totalStrokes == null ? other$totalStrokes != null : !this$totalStrokes.equals(other$totalStrokes))
            return false;
        final Object this$strokeType = this.getStrokeType();
        final Object other$strokeType = other.getStrokeType();
        if (this$strokeType == null ? other$strokeType != null : !this$strokeType.equals(other$strokeType))
            return false;
        final Object this$avgSpeedMetersPerSecond = this.getAvgSpeedMetersPerSecond();
        final Object other$avgSpeedMetersPerSecond = other.getAvgSpeedMetersPerSecond();
        if (this$avgSpeedMetersPerSecond == null ? other$avgSpeedMetersPerSecond != null : !this$avgSpeedMetersPerSecond.equals(other$avgSpeedMetersPerSecond))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LapSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $distanceMeters = this.getDistanceMeters();
        result = result * PRIME + ($distanceMeters == null ? 43 : $distanceMeters.hashCode());
        final Object $calories = this.getCalories();
        result = result * PRIME + ($calories == null ? 43 : $calories.hashCode());
        final Object $totalStrokes = this.getTotalStrokes();
        result = result * PRIME + ($totalStrokes == null ? 43 : $totalStrokes.hashCode());
        final Object $strokeType = this.getStrokeType();
        result = result * PRIME + ($strokeType == null ? 43 : $strokeType.hashCode());
        final Object $avgSpeedMetersPerSecond = this.getAvgSpeedMetersPerSecond();
        result = result * PRIME + ($avgSpeedMetersPerSecond == null ? 43 : $avgSpeedMetersPerSecond.hashCode());
        return result;
    }

    public String toString() {
        return "LapSample(startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", distanceMeters=" + this.getDistanceMeters() + ", calories=" + this.getCalories() + ", totalStrokes=" + this.getTotalStrokes() + ", strokeType=" + this.getStrokeType() + ", avgSpeedMetersPerSecond=" + this.getAvgSpeedMetersPerSecond() + ")";
    }
}
