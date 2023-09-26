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
public class PulseVelocitySample {
    private String timestamp;
    @JsonProperty("pulse_wave_velocity_meters_per_second")
    private double pulseWaveVelocityMetersPerSecond;

    public PulseVelocitySample() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public double getPulseWaveVelocityMetersPerSecond() {
        return this.pulseWaveVelocityMetersPerSecond;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PulseVelocitySample)) return false;
        final PulseVelocitySample other = (PulseVelocitySample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        if (Double.compare(this.getPulseWaveVelocityMetersPerSecond(), other.getPulseWaveVelocityMetersPerSecond()) != 0)
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PulseVelocitySample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final long $pulseWaveVelocityMetersPerSecond = Double.doubleToLongBits(this.getPulseWaveVelocityMetersPerSecond());
        result = result * PRIME + (int) ($pulseWaveVelocityMetersPerSecond >>> 32 ^ $pulseWaveVelocityMetersPerSecond);
        return result;
    }

    public String toString() {
        return "PulseVelocitySample(timestamp=" + this.getTimestamp() + ", pulseWaveVelocityMetersPerSecond=" + this.getPulseWaveVelocityMetersPerSecond() + ")";
    }
}
