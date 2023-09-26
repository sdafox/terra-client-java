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

package co.tryterra.terraclient.models.v2.daily;

import co.tryterra.terraclient.models.v2.samples.StressSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StressData {
    @JsonProperty("rest_stress_duration_seconds")
    private Double restStressDurationSeconds;
    @JsonProperty("stress_duration_seconds")
    private Double stressDurationSeconds;
    @JsonProperty("activity_stress_duration_seconds")
    private Double activityStressDurationSeconds;
    @JsonProperty("avg_stress_level")
    private Double avgStressLevel;
    @JsonProperty("low_stress_duration_seconds")
    private Double lowStressDurationSeconds;
    @JsonProperty("medium_stress_duration_seconds")
    private Double mediumStressDurationSeconds;
    @JsonProperty("high_stress_duration_seconds")
    private Double highStressDurationSeconds;
    @JsonProperty("max_stress_level")
    private Double maxStressLevel;
    @JsonProperty("stress_samples")
    private List<StressSample> stressSamples;

    public StressData() {
    }

    public Double getRestStressDurationSeconds() {
        return this.restStressDurationSeconds;
    }

    public Double getStressDurationSeconds() {
        return this.stressDurationSeconds;
    }

    public Double getActivityStressDurationSeconds() {
        return this.activityStressDurationSeconds;
    }

    public Double getAvgStressLevel() {
        return this.avgStressLevel;
    }

    public Double getLowStressDurationSeconds() {
        return this.lowStressDurationSeconds;
    }

    public Double getMediumStressDurationSeconds() {
        return this.mediumStressDurationSeconds;
    }

    public Double getHighStressDurationSeconds() {
        return this.highStressDurationSeconds;
    }

    public Double getMaxStressLevel() {
        return this.maxStressLevel;
    }

    public List<StressSample> getStressSamples() {
        return this.stressSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StressData)) return false;
        final StressData other = (StressData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$restStressDurationSeconds = this.getRestStressDurationSeconds();
        final Object other$restStressDurationSeconds = other.getRestStressDurationSeconds();
        if (this$restStressDurationSeconds == null ? other$restStressDurationSeconds != null : !this$restStressDurationSeconds.equals(other$restStressDurationSeconds))
            return false;
        final Object this$stressDurationSeconds = this.getStressDurationSeconds();
        final Object other$stressDurationSeconds = other.getStressDurationSeconds();
        if (this$stressDurationSeconds == null ? other$stressDurationSeconds != null : !this$stressDurationSeconds.equals(other$stressDurationSeconds))
            return false;
        final Object this$activityStressDurationSeconds = this.getActivityStressDurationSeconds();
        final Object other$activityStressDurationSeconds = other.getActivityStressDurationSeconds();
        if (this$activityStressDurationSeconds == null ? other$activityStressDurationSeconds != null : !this$activityStressDurationSeconds.equals(other$activityStressDurationSeconds))
            return false;
        final Object this$avgStressLevel = this.getAvgStressLevel();
        final Object other$avgStressLevel = other.getAvgStressLevel();
        if (this$avgStressLevel == null ? other$avgStressLevel != null : !this$avgStressLevel.equals(other$avgStressLevel))
            return false;
        final Object this$lowStressDurationSeconds = this.getLowStressDurationSeconds();
        final Object other$lowStressDurationSeconds = other.getLowStressDurationSeconds();
        if (this$lowStressDurationSeconds == null ? other$lowStressDurationSeconds != null : !this$lowStressDurationSeconds.equals(other$lowStressDurationSeconds))
            return false;
        final Object this$mediumStressDurationSeconds = this.getMediumStressDurationSeconds();
        final Object other$mediumStressDurationSeconds = other.getMediumStressDurationSeconds();
        if (this$mediumStressDurationSeconds == null ? other$mediumStressDurationSeconds != null : !this$mediumStressDurationSeconds.equals(other$mediumStressDurationSeconds))
            return false;
        final Object this$highStressDurationSeconds = this.getHighStressDurationSeconds();
        final Object other$highStressDurationSeconds = other.getHighStressDurationSeconds();
        if (this$highStressDurationSeconds == null ? other$highStressDurationSeconds != null : !this$highStressDurationSeconds.equals(other$highStressDurationSeconds))
            return false;
        final Object this$maxStressLevel = this.getMaxStressLevel();
        final Object other$maxStressLevel = other.getMaxStressLevel();
        if (this$maxStressLevel == null ? other$maxStressLevel != null : !this$maxStressLevel.equals(other$maxStressLevel))
            return false;
        final Object this$stressSamples = this.getStressSamples();
        final Object other$stressSamples = other.getStressSamples();
        if (this$stressSamples == null ? other$stressSamples != null : !this$stressSamples.equals(other$stressSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StressData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $restStressDurationSeconds = this.getRestStressDurationSeconds();
        result = result * PRIME + ($restStressDurationSeconds == null ? 43 : $restStressDurationSeconds.hashCode());
        final Object $stressDurationSeconds = this.getStressDurationSeconds();
        result = result * PRIME + ($stressDurationSeconds == null ? 43 : $stressDurationSeconds.hashCode());
        final Object $activityStressDurationSeconds = this.getActivityStressDurationSeconds();
        result = result * PRIME + ($activityStressDurationSeconds == null ? 43 : $activityStressDurationSeconds.hashCode());
        final Object $avgStressLevel = this.getAvgStressLevel();
        result = result * PRIME + ($avgStressLevel == null ? 43 : $avgStressLevel.hashCode());
        final Object $lowStressDurationSeconds = this.getLowStressDurationSeconds();
        result = result * PRIME + ($lowStressDurationSeconds == null ? 43 : $lowStressDurationSeconds.hashCode());
        final Object $mediumStressDurationSeconds = this.getMediumStressDurationSeconds();
        result = result * PRIME + ($mediumStressDurationSeconds == null ? 43 : $mediumStressDurationSeconds.hashCode());
        final Object $highStressDurationSeconds = this.getHighStressDurationSeconds();
        result = result * PRIME + ($highStressDurationSeconds == null ? 43 : $highStressDurationSeconds.hashCode());
        final Object $maxStressLevel = this.getMaxStressLevel();
        result = result * PRIME + ($maxStressLevel == null ? 43 : $maxStressLevel.hashCode());
        final Object $stressSamples = this.getStressSamples();
        result = result * PRIME + ($stressSamples == null ? 43 : $stressSamples.hashCode());
        return result;
    }

    public String toString() {
        return "StressData(restStressDurationSeconds=" + this.getRestStressDurationSeconds() + ", stressDurationSeconds=" + this.getStressDurationSeconds() + ", activityStressDurationSeconds=" + this.getActivityStressDurationSeconds() + ", avgStressLevel=" + this.getAvgStressLevel() + ", lowStressDurationSeconds=" + this.getLowStressDurationSeconds() + ", mediumStressDurationSeconds=" + this.getMediumStressDurationSeconds() + ", highStressDurationSeconds=" + this.getHighStressDurationSeconds() + ", maxStressLevel=" + this.getMaxStressLevel() + ", stressSamples=" + this.getStressSamples() + ")";
    }
}
