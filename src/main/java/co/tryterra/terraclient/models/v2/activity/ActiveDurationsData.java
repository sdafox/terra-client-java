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

package co.tryterra.terraclient.models.v2.activity;

import co.tryterra.terraclient.models.v2.samples.ActivityLevelSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActiveDurationsData {
    @JsonProperty("activity_seconds")
    private Double activitySeconds;
    @JsonProperty("rest_seconds")
    private Double restSeconds;
    @JsonProperty("low_intensity_seconds")
    private Double lowIntensitySeconds;
    @JsonProperty("vigorous_intensity_seconds")
    private Double vigorousIntensitySeconds;
    @JsonProperty("inactivity_seconds")
    private Double inactivitySeconds;
    @JsonProperty("moderate_intensity_seconds")
    private Double moderateIntensitySeconds;
    @JsonProperty("num_continuous_inactive_periods")
    private Integer numContinuousInactivePeriods;
    @JsonProperty("activity_levels_samples")
    private List<ActivityLevelSample> activityLevelsSamples;
    @JsonProperty("standing_seconds")
    private Double standingSeconds;
    @JsonProperty("standing_hours_count")
    private Double standingHoursCount;

    public ActiveDurationsData() {
    }

    public Double getActivitySeconds() {
        return this.activitySeconds;
    }

    public Double getRestSeconds() {
        return this.restSeconds;
    }

    public Double getLowIntensitySeconds() {
        return this.lowIntensitySeconds;
    }

    public Double getVigorousIntensitySeconds() {
        return this.vigorousIntensitySeconds;
    }

    public Double getInactivitySeconds() {
        return this.inactivitySeconds;
    }

    public Double getModerateIntensitySeconds() {
        return this.moderateIntensitySeconds;
    }

    public Integer getNumContinuousInactivePeriods() {
        return this.numContinuousInactivePeriods;
    }

    public List<ActivityLevelSample> getActivityLevelsSamples() {
        return this.activityLevelsSamples;
    }

    public Double getStandingSeconds() {
        return this.standingSeconds;
    }

    public Double getStandingHoursCount() {
        return this.standingHoursCount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ActiveDurationsData)) return false;
        final ActiveDurationsData other = (ActiveDurationsData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$activitySeconds = this.getActivitySeconds();
        final Object other$activitySeconds = other.getActivitySeconds();
        if (this$activitySeconds == null ? other$activitySeconds != null : !this$activitySeconds.equals(other$activitySeconds))
            return false;
        final Object this$restSeconds = this.getRestSeconds();
        final Object other$restSeconds = other.getRestSeconds();
        if (this$restSeconds == null ? other$restSeconds != null : !this$restSeconds.equals(other$restSeconds))
            return false;
        final Object this$lowIntensitySeconds = this.getLowIntensitySeconds();
        final Object other$lowIntensitySeconds = other.getLowIntensitySeconds();
        if (this$lowIntensitySeconds == null ? other$lowIntensitySeconds != null : !this$lowIntensitySeconds.equals(other$lowIntensitySeconds))
            return false;
        final Object this$vigorousIntensitySeconds = this.getVigorousIntensitySeconds();
        final Object other$vigorousIntensitySeconds = other.getVigorousIntensitySeconds();
        if (this$vigorousIntensitySeconds == null ? other$vigorousIntensitySeconds != null : !this$vigorousIntensitySeconds.equals(other$vigorousIntensitySeconds))
            return false;
        final Object this$inactivitySeconds = this.getInactivitySeconds();
        final Object other$inactivitySeconds = other.getInactivitySeconds();
        if (this$inactivitySeconds == null ? other$inactivitySeconds != null : !this$inactivitySeconds.equals(other$inactivitySeconds))
            return false;
        final Object this$moderateIntensitySeconds = this.getModerateIntensitySeconds();
        final Object other$moderateIntensitySeconds = other.getModerateIntensitySeconds();
        if (this$moderateIntensitySeconds == null ? other$moderateIntensitySeconds != null : !this$moderateIntensitySeconds.equals(other$moderateIntensitySeconds))
            return false;
        final Object this$numContinuousInactivePeriods = this.getNumContinuousInactivePeriods();
        final Object other$numContinuousInactivePeriods = other.getNumContinuousInactivePeriods();
        if (this$numContinuousInactivePeriods == null ? other$numContinuousInactivePeriods != null : !this$numContinuousInactivePeriods.equals(other$numContinuousInactivePeriods))
            return false;
        final Object this$activityLevelsSamples = this.getActivityLevelsSamples();
        final Object other$activityLevelsSamples = other.getActivityLevelsSamples();
        if (this$activityLevelsSamples == null ? other$activityLevelsSamples != null : !this$activityLevelsSamples.equals(other$activityLevelsSamples))
            return false;
        final Object this$standingSeconds = this.getStandingSeconds();
        final Object other$standingSeconds = other.getStandingSeconds();
        if (this$standingSeconds == null ? other$standingSeconds != null : !this$standingSeconds.equals(other$standingSeconds))
            return false;
        final Object this$standingHoursCount = this.getStandingHoursCount();
        final Object other$standingHoursCount = other.getStandingHoursCount();
        if (this$standingHoursCount == null ? other$standingHoursCount != null : !this$standingHoursCount.equals(other$standingHoursCount))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ActiveDurationsData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $activitySeconds = this.getActivitySeconds();
        result = result * PRIME + ($activitySeconds == null ? 43 : $activitySeconds.hashCode());
        final Object $restSeconds = this.getRestSeconds();
        result = result * PRIME + ($restSeconds == null ? 43 : $restSeconds.hashCode());
        final Object $lowIntensitySeconds = this.getLowIntensitySeconds();
        result = result * PRIME + ($lowIntensitySeconds == null ? 43 : $lowIntensitySeconds.hashCode());
        final Object $vigorousIntensitySeconds = this.getVigorousIntensitySeconds();
        result = result * PRIME + ($vigorousIntensitySeconds == null ? 43 : $vigorousIntensitySeconds.hashCode());
        final Object $inactivitySeconds = this.getInactivitySeconds();
        result = result * PRIME + ($inactivitySeconds == null ? 43 : $inactivitySeconds.hashCode());
        final Object $moderateIntensitySeconds = this.getModerateIntensitySeconds();
        result = result * PRIME + ($moderateIntensitySeconds == null ? 43 : $moderateIntensitySeconds.hashCode());
        final Object $numContinuousInactivePeriods = this.getNumContinuousInactivePeriods();
        result = result * PRIME + ($numContinuousInactivePeriods == null ? 43 : $numContinuousInactivePeriods.hashCode());
        final Object $activityLevelsSamples = this.getActivityLevelsSamples();
        result = result * PRIME + ($activityLevelsSamples == null ? 43 : $activityLevelsSamples.hashCode());
        final Object $standingSeconds = this.getStandingSeconds();
        result = result * PRIME + ($standingSeconds == null ? 43 : $standingSeconds.hashCode());
        final Object $standingHoursCount = this.getStandingHoursCount();
        result = result * PRIME + ($standingHoursCount == null ? 43 : $standingHoursCount.hashCode());
        return result;
    }

    public String toString() {
        return "ActiveDurationsData(activitySeconds=" + this.getActivitySeconds() + ", restSeconds=" + this.getRestSeconds() + ", lowIntensitySeconds=" + this.getLowIntensitySeconds() + ", vigorousIntensitySeconds=" + this.getVigorousIntensitySeconds() + ", inactivitySeconds=" + this.getInactivitySeconds() + ", moderateIntensitySeconds=" + this.getModerateIntensitySeconds() + ", numContinuousInactivePeriods=" + this.getNumContinuousInactivePeriods() + ", activityLevelsSamples=" + this.getActivityLevelsSamples() + ", standingSeconds=" + this.getStandingSeconds() + ", standingHoursCount=" + this.getStandingHoursCount() + ")";
    }
}
