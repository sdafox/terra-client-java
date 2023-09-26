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
public class CalorieSample {
    private String timestamp;
    private Double calories;
    @JsonProperty("timer_duration_seconds")
    private Double timerDurationSeconds;

    public CalorieSample() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Double getCalories() {
        return this.calories;
    }

    public Double getTimerDurationSeconds() {
        return this.timerDurationSeconds;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CalorieSample)) return false;
        final CalorieSample other = (CalorieSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$calories = this.getCalories();
        final Object other$calories = other.getCalories();
        if (this$calories == null ? other$calories != null : !this$calories.equals(other$calories)) return false;
        final Object this$timerDurationSeconds = this.getTimerDurationSeconds();
        final Object other$timerDurationSeconds = other.getTimerDurationSeconds();
        if (this$timerDurationSeconds == null ? other$timerDurationSeconds != null : !this$timerDurationSeconds.equals(other$timerDurationSeconds))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CalorieSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $calories = this.getCalories();
        result = result * PRIME + ($calories == null ? 43 : $calories.hashCode());
        final Object $timerDurationSeconds = this.getTimerDurationSeconds();
        result = result * PRIME + ($timerDurationSeconds == null ? 43 : $timerDurationSeconds.hashCode());
        return result;
    }

    public String toString() {
        return "CalorieSample(timestamp=" + this.getTimestamp() + ", calories=" + this.getCalories() + ", timerDurationSeconds=" + this.getTimerDurationSeconds() + ")";
    }
}
