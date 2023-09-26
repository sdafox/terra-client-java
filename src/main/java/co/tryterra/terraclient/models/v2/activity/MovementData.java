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

import co.tryterra.terraclient.models.v2.samples.CadenceSample;
import co.tryterra.terraclient.models.v2.samples.SpeedSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovementData {
    @JsonProperty("normalized_speed_meters_per_second")
    private Double normalizedSpeedMetersPerSecond;
    @JsonProperty("max_cadence_rpm")
    private Double maxCadenceRpm;
    @JsonProperty("avg_speed_meters_per_second")
    private Double avgSpeedMetersPerSecond;
    @JsonProperty("avg_pace_minutes_per_kilometer")
    private Double avgPaceMinutesPerKilometer;
    @JsonProperty("max_velocity_meters_per_second")
    private Double maxVelocityMetersPerSecond;
    @JsonProperty("max_pace_minutes_per_kilometer")
    private Double maxPaceMinutesPerKilometer;
    @JsonProperty("max_torque_newton_meters")
    private Double maxTorqueNewtonMeters;
    @JsonProperty("avg_cadence_rpm")
    private Double avgCadenceRpm;
    @JsonProperty("avg_velocity_meters_per_second")
    private Double avgVelocityMetersPerSecond;
    @JsonProperty("avg_torque_newton_meters")
    private Double avgTorqueNewtonMeters;
    @JsonProperty("cadence_samples")
    private List<CadenceSample> cadenceSamples;
    @JsonProperty("speed_samples")
    private List<SpeedSample> speedSamples;
    @JsonProperty("max_speed_meters_per_second")
    private Double maxSpeedMetersPerSecond;

    public MovementData() {
    }

    public Double getNormalizedSpeedMetersPerSecond() {
        return this.normalizedSpeedMetersPerSecond;
    }

    public Double getMaxCadenceRpm() {
        return this.maxCadenceRpm;
    }

    public Double getAvgSpeedMetersPerSecond() {
        return this.avgSpeedMetersPerSecond;
    }

    public Double getAvgPaceMinutesPerKilometer() {
        return this.avgPaceMinutesPerKilometer;
    }

    public Double getMaxVelocityMetersPerSecond() {
        return this.maxVelocityMetersPerSecond;
    }

    public Double getMaxPaceMinutesPerKilometer() {
        return this.maxPaceMinutesPerKilometer;
    }

    public Double getMaxTorqueNewtonMeters() {
        return this.maxTorqueNewtonMeters;
    }

    public Double getAvgCadenceRpm() {
        return this.avgCadenceRpm;
    }

    public Double getAvgVelocityMetersPerSecond() {
        return this.avgVelocityMetersPerSecond;
    }

    public Double getAvgTorqueNewtonMeters() {
        return this.avgTorqueNewtonMeters;
    }

    public List<CadenceSample> getCadenceSamples() {
        return this.cadenceSamples;
    }

    public List<SpeedSample> getSpeedSamples() {
        return this.speedSamples;
    }

    public Double getMaxSpeedMetersPerSecond() {
        return this.maxSpeedMetersPerSecond;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MovementData)) return false;
        final MovementData other = (MovementData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$normalizedSpeedMetersPerSecond = this.getNormalizedSpeedMetersPerSecond();
        final Object other$normalizedSpeedMetersPerSecond = other.getNormalizedSpeedMetersPerSecond();
        if (this$normalizedSpeedMetersPerSecond == null ? other$normalizedSpeedMetersPerSecond != null : !this$normalizedSpeedMetersPerSecond.equals(other$normalizedSpeedMetersPerSecond))
            return false;
        final Object this$maxCadenceRpm = this.getMaxCadenceRpm();
        final Object other$maxCadenceRpm = other.getMaxCadenceRpm();
        if (this$maxCadenceRpm == null ? other$maxCadenceRpm != null : !this$maxCadenceRpm.equals(other$maxCadenceRpm))
            return false;
        final Object this$avgSpeedMetersPerSecond = this.getAvgSpeedMetersPerSecond();
        final Object other$avgSpeedMetersPerSecond = other.getAvgSpeedMetersPerSecond();
        if (this$avgSpeedMetersPerSecond == null ? other$avgSpeedMetersPerSecond != null : !this$avgSpeedMetersPerSecond.equals(other$avgSpeedMetersPerSecond))
            return false;
        final Object this$avgPaceMinutesPerKilometer = this.getAvgPaceMinutesPerKilometer();
        final Object other$avgPaceMinutesPerKilometer = other.getAvgPaceMinutesPerKilometer();
        if (this$avgPaceMinutesPerKilometer == null ? other$avgPaceMinutesPerKilometer != null : !this$avgPaceMinutesPerKilometer.equals(other$avgPaceMinutesPerKilometer))
            return false;
        final Object this$maxVelocityMetersPerSecond = this.getMaxVelocityMetersPerSecond();
        final Object other$maxVelocityMetersPerSecond = other.getMaxVelocityMetersPerSecond();
        if (this$maxVelocityMetersPerSecond == null ? other$maxVelocityMetersPerSecond != null : !this$maxVelocityMetersPerSecond.equals(other$maxVelocityMetersPerSecond))
            return false;
        final Object this$maxPaceMinutesPerKilometer = this.getMaxPaceMinutesPerKilometer();
        final Object other$maxPaceMinutesPerKilometer = other.getMaxPaceMinutesPerKilometer();
        if (this$maxPaceMinutesPerKilometer == null ? other$maxPaceMinutesPerKilometer != null : !this$maxPaceMinutesPerKilometer.equals(other$maxPaceMinutesPerKilometer))
            return false;
        final Object this$maxTorqueNewtonMeters = this.getMaxTorqueNewtonMeters();
        final Object other$maxTorqueNewtonMeters = other.getMaxTorqueNewtonMeters();
        if (this$maxTorqueNewtonMeters == null ? other$maxTorqueNewtonMeters != null : !this$maxTorqueNewtonMeters.equals(other$maxTorqueNewtonMeters))
            return false;
        final Object this$avgCadenceRpm = this.getAvgCadenceRpm();
        final Object other$avgCadenceRpm = other.getAvgCadenceRpm();
        if (this$avgCadenceRpm == null ? other$avgCadenceRpm != null : !this$avgCadenceRpm.equals(other$avgCadenceRpm))
            return false;
        final Object this$avgVelocityMetersPerSecond = this.getAvgVelocityMetersPerSecond();
        final Object other$avgVelocityMetersPerSecond = other.getAvgVelocityMetersPerSecond();
        if (this$avgVelocityMetersPerSecond == null ? other$avgVelocityMetersPerSecond != null : !this$avgVelocityMetersPerSecond.equals(other$avgVelocityMetersPerSecond))
            return false;
        final Object this$avgTorqueNewtonMeters = this.getAvgTorqueNewtonMeters();
        final Object other$avgTorqueNewtonMeters = other.getAvgTorqueNewtonMeters();
        if (this$avgTorqueNewtonMeters == null ? other$avgTorqueNewtonMeters != null : !this$avgTorqueNewtonMeters.equals(other$avgTorqueNewtonMeters))
            return false;
        final Object this$cadenceSamples = this.getCadenceSamples();
        final Object other$cadenceSamples = other.getCadenceSamples();
        if (this$cadenceSamples == null ? other$cadenceSamples != null : !this$cadenceSamples.equals(other$cadenceSamples))
            return false;
        final Object this$speedSamples = this.getSpeedSamples();
        final Object other$speedSamples = other.getSpeedSamples();
        if (this$speedSamples == null ? other$speedSamples != null : !this$speedSamples.equals(other$speedSamples))
            return false;
        final Object this$maxSpeedMetersPerSecond = this.getMaxSpeedMetersPerSecond();
        final Object other$maxSpeedMetersPerSecond = other.getMaxSpeedMetersPerSecond();
        if (this$maxSpeedMetersPerSecond == null ? other$maxSpeedMetersPerSecond != null : !this$maxSpeedMetersPerSecond.equals(other$maxSpeedMetersPerSecond))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MovementData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $normalizedSpeedMetersPerSecond = this.getNormalizedSpeedMetersPerSecond();
        result = result * PRIME + ($normalizedSpeedMetersPerSecond == null ? 43 : $normalizedSpeedMetersPerSecond.hashCode());
        final Object $maxCadenceRpm = this.getMaxCadenceRpm();
        result = result * PRIME + ($maxCadenceRpm == null ? 43 : $maxCadenceRpm.hashCode());
        final Object $avgSpeedMetersPerSecond = this.getAvgSpeedMetersPerSecond();
        result = result * PRIME + ($avgSpeedMetersPerSecond == null ? 43 : $avgSpeedMetersPerSecond.hashCode());
        final Object $avgPaceMinutesPerKilometer = this.getAvgPaceMinutesPerKilometer();
        result = result * PRIME + ($avgPaceMinutesPerKilometer == null ? 43 : $avgPaceMinutesPerKilometer.hashCode());
        final Object $maxVelocityMetersPerSecond = this.getMaxVelocityMetersPerSecond();
        result = result * PRIME + ($maxVelocityMetersPerSecond == null ? 43 : $maxVelocityMetersPerSecond.hashCode());
        final Object $maxPaceMinutesPerKilometer = this.getMaxPaceMinutesPerKilometer();
        result = result * PRIME + ($maxPaceMinutesPerKilometer == null ? 43 : $maxPaceMinutesPerKilometer.hashCode());
        final Object $maxTorqueNewtonMeters = this.getMaxTorqueNewtonMeters();
        result = result * PRIME + ($maxTorqueNewtonMeters == null ? 43 : $maxTorqueNewtonMeters.hashCode());
        final Object $avgCadenceRpm = this.getAvgCadenceRpm();
        result = result * PRIME + ($avgCadenceRpm == null ? 43 : $avgCadenceRpm.hashCode());
        final Object $avgVelocityMetersPerSecond = this.getAvgVelocityMetersPerSecond();
        result = result * PRIME + ($avgVelocityMetersPerSecond == null ? 43 : $avgVelocityMetersPerSecond.hashCode());
        final Object $avgTorqueNewtonMeters = this.getAvgTorqueNewtonMeters();
        result = result * PRIME + ($avgTorqueNewtonMeters == null ? 43 : $avgTorqueNewtonMeters.hashCode());
        final Object $cadenceSamples = this.getCadenceSamples();
        result = result * PRIME + ($cadenceSamples == null ? 43 : $cadenceSamples.hashCode());
        final Object $speedSamples = this.getSpeedSamples();
        result = result * PRIME + ($speedSamples == null ? 43 : $speedSamples.hashCode());
        final Object $maxSpeedMetersPerSecond = this.getMaxSpeedMetersPerSecond();
        result = result * PRIME + ($maxSpeedMetersPerSecond == null ? 43 : $maxSpeedMetersPerSecond.hashCode());
        return result;
    }

    public String toString() {
        return "MovementData(normalizedSpeedMetersPerSecond=" + this.getNormalizedSpeedMetersPerSecond() + ", maxCadenceRpm=" + this.getMaxCadenceRpm() + ", avgSpeedMetersPerSecond=" + this.getAvgSpeedMetersPerSecond() + ", avgPaceMinutesPerKilometer=" + this.getAvgPaceMinutesPerKilometer() + ", maxVelocityMetersPerSecond=" + this.getMaxVelocityMetersPerSecond() + ", maxPaceMinutesPerKilometer=" + this.getMaxPaceMinutesPerKilometer() + ", maxTorqueNewtonMeters=" + this.getMaxTorqueNewtonMeters() + ", avgCadenceRpm=" + this.getAvgCadenceRpm() + ", avgVelocityMetersPerSecond=" + this.getAvgVelocityMetersPerSecond() + ", avgTorqueNewtonMeters=" + this.getAvgTorqueNewtonMeters() + ", cadenceSamples=" + this.getCadenceSamples() + ", speedSamples=" + this.getSpeedSamples() + ", maxSpeedMetersPerSecond=" + this.getMaxSpeedMetersPerSecond() + ")";
    }
}
