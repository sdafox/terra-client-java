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

import co.tryterra.terraclient.models.v2.samples.MetSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MetData {
    @JsonProperty("num_low_intensity_minutes")
    private Double numLowIntensityMinutes;
    @JsonProperty("num_high_intensity_minutes")
    private Double numHighIntensityMinutes;
    @JsonProperty("num_inactive_minutes")
    private Double numInactiveMinutes;
    @JsonProperty("num_moderate_intensity_minutes")
    private Double numModerateIntensityMinutes;
    @JsonProperty("avg_level")
    private Double avgLevel;
    @JsonProperty("MET_samples")
    private List<MetSample> metSamples;

    public MetData() {
    }

    public Double getNumLowIntensityMinutes() {
        return this.numLowIntensityMinutes;
    }

    public Double getNumHighIntensityMinutes() {
        return this.numHighIntensityMinutes;
    }

    public Double getNumInactiveMinutes() {
        return this.numInactiveMinutes;
    }

    public Double getNumModerateIntensityMinutes() {
        return this.numModerateIntensityMinutes;
    }

    public Double getAvgLevel() {
        return this.avgLevel;
    }

    public List<MetSample> getMetSamples() {
        return this.metSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MetData)) return false;
        final MetData other = (MetData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$numLowIntensityMinutes = this.getNumLowIntensityMinutes();
        final Object other$numLowIntensityMinutes = other.getNumLowIntensityMinutes();
        if (this$numLowIntensityMinutes == null ? other$numLowIntensityMinutes != null : !this$numLowIntensityMinutes.equals(other$numLowIntensityMinutes))
            return false;
        final Object this$numHighIntensityMinutes = this.getNumHighIntensityMinutes();
        final Object other$numHighIntensityMinutes = other.getNumHighIntensityMinutes();
        if (this$numHighIntensityMinutes == null ? other$numHighIntensityMinutes != null : !this$numHighIntensityMinutes.equals(other$numHighIntensityMinutes))
            return false;
        final Object this$numInactiveMinutes = this.getNumInactiveMinutes();
        final Object other$numInactiveMinutes = other.getNumInactiveMinutes();
        if (this$numInactiveMinutes == null ? other$numInactiveMinutes != null : !this$numInactiveMinutes.equals(other$numInactiveMinutes))
            return false;
        final Object this$numModerateIntensityMinutes = this.getNumModerateIntensityMinutes();
        final Object other$numModerateIntensityMinutes = other.getNumModerateIntensityMinutes();
        if (this$numModerateIntensityMinutes == null ? other$numModerateIntensityMinutes != null : !this$numModerateIntensityMinutes.equals(other$numModerateIntensityMinutes))
            return false;
        final Object this$avgLevel = this.getAvgLevel();
        final Object other$avgLevel = other.getAvgLevel();
        if (this$avgLevel == null ? other$avgLevel != null : !this$avgLevel.equals(other$avgLevel)) return false;
        final Object this$metSamples = this.getMetSamples();
        final Object other$metSamples = other.getMetSamples();
        if (this$metSamples == null ? other$metSamples != null : !this$metSamples.equals(other$metSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MetData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $numLowIntensityMinutes = this.getNumLowIntensityMinutes();
        result = result * PRIME + ($numLowIntensityMinutes == null ? 43 : $numLowIntensityMinutes.hashCode());
        final Object $numHighIntensityMinutes = this.getNumHighIntensityMinutes();
        result = result * PRIME + ($numHighIntensityMinutes == null ? 43 : $numHighIntensityMinutes.hashCode());
        final Object $numInactiveMinutes = this.getNumInactiveMinutes();
        result = result * PRIME + ($numInactiveMinutes == null ? 43 : $numInactiveMinutes.hashCode());
        final Object $numModerateIntensityMinutes = this.getNumModerateIntensityMinutes();
        result = result * PRIME + ($numModerateIntensityMinutes == null ? 43 : $numModerateIntensityMinutes.hashCode());
        final Object $avgLevel = this.getAvgLevel();
        result = result * PRIME + ($avgLevel == null ? 43 : $avgLevel.hashCode());
        final Object $metSamples = this.getMetSamples();
        result = result * PRIME + ($metSamples == null ? 43 : $metSamples.hashCode());
        return result;
    }

    public String toString() {
        return "MetData(numLowIntensityMinutes=" + this.getNumLowIntensityMinutes() + ", numHighIntensityMinutes=" + this.getNumHighIntensityMinutes() + ", numInactiveMinutes=" + this.getNumInactiveMinutes() + ", numModerateIntensityMinutes=" + this.getNumModerateIntensityMinutes() + ", avgLevel=" + this.getAvgLevel() + ", metSamples=" + this.getMetSamples() + ")";
    }
}
