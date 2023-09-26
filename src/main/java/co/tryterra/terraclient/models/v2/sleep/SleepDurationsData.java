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

package co.tryterra.terraclient.models.v2.sleep;

import co.tryterra.terraclient.models.v2.samples.SleepHypnogramSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SleepDurationsData {
    public SleepDurationsData() {
    }

    public Double getSleepEfficiency() {
        return this.sleepEfficiency;
    }

    public Other getOther() {
        return this.other;
    }

    public Awake getAwake() {
        return this.awake;
    }

    public Asleep getAsleep() {
        return this.asleep;
    }

    public List<SleepHypnogramSample> getHypnogramSamples() {
        return this.hypnogramSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SleepDurationsData)) return false;
        final SleepDurationsData other = (SleepDurationsData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sleepEfficiency = this.getSleepEfficiency();
        final Object other$sleepEfficiency = other.getSleepEfficiency();
        if (this$sleepEfficiency == null ? other$sleepEfficiency != null : !this$sleepEfficiency.equals(other$sleepEfficiency))
            return false;
        final Object this$other = this.getOther();
        final Object other$other = other.getOther();
        if (this$other == null ? other$other != null : !this$other.equals(other$other)) return false;
        final Object this$awake = this.getAwake();
        final Object other$awake = other.getAwake();
        if (this$awake == null ? other$awake != null : !this$awake.equals(other$awake)) return false;
        final Object this$asleep = this.getAsleep();
        final Object other$asleep = other.getAsleep();
        if (this$asleep == null ? other$asleep != null : !this$asleep.equals(other$asleep)) return false;
        final Object this$hypnogramSamples = this.getHypnogramSamples();
        final Object other$hypnogramSamples = other.getHypnogramSamples();
        if (this$hypnogramSamples == null ? other$hypnogramSamples != null : !this$hypnogramSamples.equals(other$hypnogramSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SleepDurationsData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $sleepEfficiency = this.getSleepEfficiency();
        result = result * PRIME + ($sleepEfficiency == null ? 43 : $sleepEfficiency.hashCode());
        final Object $other = this.getOther();
        result = result * PRIME + ($other == null ? 43 : $other.hashCode());
        final Object $awake = this.getAwake();
        result = result * PRIME + ($awake == null ? 43 : $awake.hashCode());
        final Object $asleep = this.getAsleep();
        result = result * PRIME + ($asleep == null ? 43 : $asleep.hashCode());
        final Object $hypnogramSamples = this.getHypnogramSamples();
        result = result * PRIME + ($hypnogramSamples == null ? 43 : $hypnogramSamples.hashCode());
        return result;
    }

    public String toString() {
        return "SleepDurationsData(sleepEfficiency=" + this.getSleepEfficiency() + ", other=" + this.getOther() + ", awake=" + this.getAwake() + ", asleep=" + this.getAsleep() + ", hypnogramSamples=" + this.getHypnogramSamples() + ")";
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Other {
        @JsonProperty("duration_in_bed_seconds")
        private Integer durationInBedSeconds;
        @JsonProperty("duration_unmeasureable_sleep_seconds")
        private Integer durationUnmeasureableSleepSeconds;

        public Other() {
        }

        public Integer getDurationInBedSeconds() {
            return this.durationInBedSeconds;
        }

        public Integer getDurationUnmeasureableSleepSeconds() {
            return this.durationUnmeasureableSleepSeconds;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Other)) return false;
            final Other other = (Other) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$durationInBedSeconds = this.getDurationInBedSeconds();
            final Object other$durationInBedSeconds = other.getDurationInBedSeconds();
            if (this$durationInBedSeconds == null ? other$durationInBedSeconds != null : !this$durationInBedSeconds.equals(other$durationInBedSeconds))
                return false;
            final Object this$durationUnmeasureableSleepSeconds = this.getDurationUnmeasureableSleepSeconds();
            final Object other$durationUnmeasureableSleepSeconds = other.getDurationUnmeasureableSleepSeconds();
            if (this$durationUnmeasureableSleepSeconds == null ? other$durationUnmeasureableSleepSeconds != null : !this$durationUnmeasureableSleepSeconds.equals(other$durationUnmeasureableSleepSeconds))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Other;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $durationInBedSeconds = this.getDurationInBedSeconds();
            result = result * PRIME + ($durationInBedSeconds == null ? 43 : $durationInBedSeconds.hashCode());
            final Object $durationUnmeasureableSleepSeconds = this.getDurationUnmeasureableSleepSeconds();
            result = result * PRIME + ($durationUnmeasureableSleepSeconds == null ? 43 : $durationUnmeasureableSleepSeconds.hashCode());
            return result;
        }

        public String toString() {
            return "SleepDurationsData.Other(durationInBedSeconds=" + this.getDurationInBedSeconds() + ", durationUnmeasureableSleepSeconds=" + this.getDurationUnmeasureableSleepSeconds() + ")";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Awake {
        @JsonProperty("duration_short_interruption_seconds")
        private Double durationShortInterruptionSeconds;
        @JsonProperty("duration_awake_state_seconds")
        private Double durationAwakeStateSeconds;
        @JsonProperty("duration_long_interruption_seconds")
        private Double durationLongInterruptionSeconds;
        @JsonProperty("num_wakeup_events")
        private Integer numWakeupEvents;
        @JsonProperty("wake_up_latency_seconds")
        private Double wakeUpLatencySeconds;
        @JsonProperty("num_out_of_bed_events")
        private Integer numOutOfBedEvents;
        @JsonProperty("sleep_latency_seconds")
        private Double sleepLatencySeconds;

        public Awake() {
        }

        public Double getDurationShortInterruptionSeconds() {
            return this.durationShortInterruptionSeconds;
        }

        public Double getDurationAwakeStateSeconds() {
            return this.durationAwakeStateSeconds;
        }

        public Double getDurationLongInterruptionSeconds() {
            return this.durationLongInterruptionSeconds;
        }

        public Integer getNumWakeupEvents() {
            return this.numWakeupEvents;
        }

        public Double getWakeUpLatencySeconds() {
            return this.wakeUpLatencySeconds;
        }

        public Integer getNumOutOfBedEvents() {
            return this.numOutOfBedEvents;
        }

        public Double getSleepLatencySeconds() {
            return this.sleepLatencySeconds;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Awake)) return false;
            final Awake other = (Awake) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$durationShortInterruptionSeconds = this.getDurationShortInterruptionSeconds();
            final Object other$durationShortInterruptionSeconds = other.getDurationShortInterruptionSeconds();
            if (this$durationShortInterruptionSeconds == null ? other$durationShortInterruptionSeconds != null : !this$durationShortInterruptionSeconds.equals(other$durationShortInterruptionSeconds))
                return false;
            final Object this$durationAwakeStateSeconds = this.getDurationAwakeStateSeconds();
            final Object other$durationAwakeStateSeconds = other.getDurationAwakeStateSeconds();
            if (this$durationAwakeStateSeconds == null ? other$durationAwakeStateSeconds != null : !this$durationAwakeStateSeconds.equals(other$durationAwakeStateSeconds))
                return false;
            final Object this$durationLongInterruptionSeconds = this.getDurationLongInterruptionSeconds();
            final Object other$durationLongInterruptionSeconds = other.getDurationLongInterruptionSeconds();
            if (this$durationLongInterruptionSeconds == null ? other$durationLongInterruptionSeconds != null : !this$durationLongInterruptionSeconds.equals(other$durationLongInterruptionSeconds))
                return false;
            final Object this$numWakeupEvents = this.getNumWakeupEvents();
            final Object other$numWakeupEvents = other.getNumWakeupEvents();
            if (this$numWakeupEvents == null ? other$numWakeupEvents != null : !this$numWakeupEvents.equals(other$numWakeupEvents))
                return false;
            final Object this$wakeUpLatencySeconds = this.getWakeUpLatencySeconds();
            final Object other$wakeUpLatencySeconds = other.getWakeUpLatencySeconds();
            if (this$wakeUpLatencySeconds == null ? other$wakeUpLatencySeconds != null : !this$wakeUpLatencySeconds.equals(other$wakeUpLatencySeconds))
                return false;
            final Object this$numOutOfBedEvents = this.getNumOutOfBedEvents();
            final Object other$numOutOfBedEvents = other.getNumOutOfBedEvents();
            if (this$numOutOfBedEvents == null ? other$numOutOfBedEvents != null : !this$numOutOfBedEvents.equals(other$numOutOfBedEvents))
                return false;
            final Object this$sleepLatencySeconds = this.getSleepLatencySeconds();
            final Object other$sleepLatencySeconds = other.getSleepLatencySeconds();
            if (this$sleepLatencySeconds == null ? other$sleepLatencySeconds != null : !this$sleepLatencySeconds.equals(other$sleepLatencySeconds))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Awake;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $durationShortInterruptionSeconds = this.getDurationShortInterruptionSeconds();
            result = result * PRIME + ($durationShortInterruptionSeconds == null ? 43 : $durationShortInterruptionSeconds.hashCode());
            final Object $durationAwakeStateSeconds = this.getDurationAwakeStateSeconds();
            result = result * PRIME + ($durationAwakeStateSeconds == null ? 43 : $durationAwakeStateSeconds.hashCode());
            final Object $durationLongInterruptionSeconds = this.getDurationLongInterruptionSeconds();
            result = result * PRIME + ($durationLongInterruptionSeconds == null ? 43 : $durationLongInterruptionSeconds.hashCode());
            final Object $numWakeupEvents = this.getNumWakeupEvents();
            result = result * PRIME + ($numWakeupEvents == null ? 43 : $numWakeupEvents.hashCode());
            final Object $wakeUpLatencySeconds = this.getWakeUpLatencySeconds();
            result = result * PRIME + ($wakeUpLatencySeconds == null ? 43 : $wakeUpLatencySeconds.hashCode());
            final Object $numOutOfBedEvents = this.getNumOutOfBedEvents();
            result = result * PRIME + ($numOutOfBedEvents == null ? 43 : $numOutOfBedEvents.hashCode());
            final Object $sleepLatencySeconds = this.getSleepLatencySeconds();
            result = result * PRIME + ($sleepLatencySeconds == null ? 43 : $sleepLatencySeconds.hashCode());
            return result;
        }

        public String toString() {
            return "SleepDurationsData.Awake(durationShortInterruptionSeconds=" + this.getDurationShortInterruptionSeconds() + ", durationAwakeStateSeconds=" + this.getDurationAwakeStateSeconds() + ", durationLongInterruptionSeconds=" + this.getDurationLongInterruptionSeconds() + ", numWakeupEvents=" + this.getNumWakeupEvents() + ", wakeUpLatencySeconds=" + this.getWakeUpLatencySeconds() + ", numOutOfBedEvents=" + this.getNumOutOfBedEvents() + ", sleepLatencySeconds=" + this.getSleepLatencySeconds() + ")";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Asleep {
        @JsonProperty("duration_light_sleep_state_seconds")
        private Double durationLightSleepStateSeconds;
        @JsonProperty("duration_asleep_state_seconds")
        private Double durationAsleepStateSeconds;
        @JsonProperty("num_REM_events")
        private Integer numRemEvents;
        @JsonProperty("duration_REM_sleep_state_seconds")
        private Double durationRemSleepStateSeconds;
        @JsonProperty("duration_deep_sleep_state_seconds")
        private Double durationDeepSleepStateSeconds;

        public Asleep() {
        }

        public Double getDurationLightSleepStateSeconds() {
            return this.durationLightSleepStateSeconds;
        }

        public Double getDurationAsleepStateSeconds() {
            return this.durationAsleepStateSeconds;
        }

        public Integer getNumRemEvents() {
            return this.numRemEvents;
        }

        public Double getDurationRemSleepStateSeconds() {
            return this.durationRemSleepStateSeconds;
        }

        public Double getDurationDeepSleepStateSeconds() {
            return this.durationDeepSleepStateSeconds;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Asleep)) return false;
            final Asleep other = (Asleep) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$durationLightSleepStateSeconds = this.getDurationLightSleepStateSeconds();
            final Object other$durationLightSleepStateSeconds = other.getDurationLightSleepStateSeconds();
            if (this$durationLightSleepStateSeconds == null ? other$durationLightSleepStateSeconds != null : !this$durationLightSleepStateSeconds.equals(other$durationLightSleepStateSeconds))
                return false;
            final Object this$durationAsleepStateSeconds = this.getDurationAsleepStateSeconds();
            final Object other$durationAsleepStateSeconds = other.getDurationAsleepStateSeconds();
            if (this$durationAsleepStateSeconds == null ? other$durationAsleepStateSeconds != null : !this$durationAsleepStateSeconds.equals(other$durationAsleepStateSeconds))
                return false;
            final Object this$numRemEvents = this.getNumRemEvents();
            final Object other$numRemEvents = other.getNumRemEvents();
            if (this$numRemEvents == null ? other$numRemEvents != null : !this$numRemEvents.equals(other$numRemEvents))
                return false;
            final Object this$durationRemSleepStateSeconds = this.getDurationRemSleepStateSeconds();
            final Object other$durationRemSleepStateSeconds = other.getDurationRemSleepStateSeconds();
            if (this$durationRemSleepStateSeconds == null ? other$durationRemSleepStateSeconds != null : !this$durationRemSleepStateSeconds.equals(other$durationRemSleepStateSeconds))
                return false;
            final Object this$durationDeepSleepStateSeconds = this.getDurationDeepSleepStateSeconds();
            final Object other$durationDeepSleepStateSeconds = other.getDurationDeepSleepStateSeconds();
            if (this$durationDeepSleepStateSeconds == null ? other$durationDeepSleepStateSeconds != null : !this$durationDeepSleepStateSeconds.equals(other$durationDeepSleepStateSeconds))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Asleep;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $durationLightSleepStateSeconds = this.getDurationLightSleepStateSeconds();
            result = result * PRIME + ($durationLightSleepStateSeconds == null ? 43 : $durationLightSleepStateSeconds.hashCode());
            final Object $durationAsleepStateSeconds = this.getDurationAsleepStateSeconds();
            result = result * PRIME + ($durationAsleepStateSeconds == null ? 43 : $durationAsleepStateSeconds.hashCode());
            final Object $numRemEvents = this.getNumRemEvents();
            result = result * PRIME + ($numRemEvents == null ? 43 : $numRemEvents.hashCode());
            final Object $durationRemSleepStateSeconds = this.getDurationRemSleepStateSeconds();
            result = result * PRIME + ($durationRemSleepStateSeconds == null ? 43 : $durationRemSleepStateSeconds.hashCode());
            final Object $durationDeepSleepStateSeconds = this.getDurationDeepSleepStateSeconds();
            result = result * PRIME + ($durationDeepSleepStateSeconds == null ? 43 : $durationDeepSleepStateSeconds.hashCode());
            return result;
        }

        public String toString() {
            return "SleepDurationsData.Asleep(durationLightSleepStateSeconds=" + this.getDurationLightSleepStateSeconds() + ", durationAsleepStateSeconds=" + this.getDurationAsleepStateSeconds() + ", numRemEvents=" + this.getNumRemEvents() + ", durationRemSleepStateSeconds=" + this.getDurationRemSleepStateSeconds() + ", durationDeepSleepStateSeconds=" + this.getDurationDeepSleepStateSeconds() + ")";
        }
    }

    @JsonProperty("sleep_efficiency")
    private Double sleepEfficiency;
    private Other other;
    private Awake awake;
    private Asleep asleep;
    @JsonProperty("hypnogram_samples")
    private List<SleepHypnogramSample> hypnogramSamples;
}
