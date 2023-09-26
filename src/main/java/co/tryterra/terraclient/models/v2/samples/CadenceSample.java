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
public class CadenceSample {
    private String timestamp;
    @JsonProperty("cadence_rpm")
    private double cadenceRpm;
    @JsonProperty("timer_duration_seconds")
    private Double timerDurationSeconds;

    public CadenceSample() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public double getCadenceRpm() {
        return this.cadenceRpm;
    }

    public Double getTimerDurationSeconds() {
        return this.timerDurationSeconds;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CadenceSample)) return false;
        final CadenceSample other = (CadenceSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        if (Double.compare(this.getCadenceRpm(), other.getCadenceRpm()) != 0) return false;
        final Object this$timerDurationSeconds = this.getTimerDurationSeconds();
        final Object other$timerDurationSeconds = other.getTimerDurationSeconds();
        if (this$timerDurationSeconds == null ? other$timerDurationSeconds != null : !this$timerDurationSeconds.equals(other$timerDurationSeconds))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CadenceSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final long $cadenceRpm = Double.doubleToLongBits(this.getCadenceRpm());
        result = result * PRIME + (int) ($cadenceRpm >>> 32 ^ $cadenceRpm);
        final Object $timerDurationSeconds = this.getTimerDurationSeconds();
        result = result * PRIME + ($timerDurationSeconds == null ? 43 : $timerDurationSeconds.hashCode());
        return result;
    }

    public String toString() {
        return "CadenceSample(timestamp=" + this.getTimestamp() + ", cadenceRpm=" + this.getCadenceRpm() + ", timerDurationSeconds=" + this.getTimerDurationSeconds() + ")";
    }
}
