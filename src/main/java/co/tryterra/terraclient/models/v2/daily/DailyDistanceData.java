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

import co.tryterra.terraclient.models.v2.samples.DistanceSample;
import co.tryterra.terraclient.models.v2.samples.ElevationSample;
import co.tryterra.terraclient.models.v2.samples.StepSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyDistanceData {
    public DailyDistanceData() {
    }

    public Integer getFloorsClimbed() {
        return this.floorsClimbed;
    }

    public Integer getSteps() {
        return this.steps;
    }

    public Double getDistanceMeters() {
        return this.distanceMeters;
    }

    public Swimming getSwimming() {
        return this.swimming;
    }

    public Elevation getElevation() {
        return this.elevation;
    }

    public Detailed getDetailed() {
        return this.detailed;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DailyDistanceData)) return false;
        final DailyDistanceData other = (DailyDistanceData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$floorsClimbed = this.getFloorsClimbed();
        final Object other$floorsClimbed = other.getFloorsClimbed();
        if (this$floorsClimbed == null ? other$floorsClimbed != null : !this$floorsClimbed.equals(other$floorsClimbed))
            return false;
        final Object this$steps = this.getSteps();
        final Object other$steps = other.getSteps();
        if (this$steps == null ? other$steps != null : !this$steps.equals(other$steps)) return false;
        final Object this$distanceMeters = this.getDistanceMeters();
        final Object other$distanceMeters = other.getDistanceMeters();
        if (this$distanceMeters == null ? other$distanceMeters != null : !this$distanceMeters.equals(other$distanceMeters))
            return false;
        final Object this$swimming = this.getSwimming();
        final Object other$swimming = other.getSwimming();
        if (this$swimming == null ? other$swimming != null : !this$swimming.equals(other$swimming)) return false;
        final Object this$elevation = this.getElevation();
        final Object other$elevation = other.getElevation();
        if (this$elevation == null ? other$elevation != null : !this$elevation.equals(other$elevation)) return false;
        final Object this$detailed = this.getDetailed();
        final Object other$detailed = other.getDetailed();
        if (this$detailed == null ? other$detailed != null : !this$detailed.equals(other$detailed)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DailyDistanceData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $floorsClimbed = this.getFloorsClimbed();
        result = result * PRIME + ($floorsClimbed == null ? 43 : $floorsClimbed.hashCode());
        final Object $steps = this.getSteps();
        result = result * PRIME + ($steps == null ? 43 : $steps.hashCode());
        final Object $distanceMeters = this.getDistanceMeters();
        result = result * PRIME + ($distanceMeters == null ? 43 : $distanceMeters.hashCode());
        final Object $swimming = this.getSwimming();
        result = result * PRIME + ($swimming == null ? 43 : $swimming.hashCode());
        final Object $elevation = this.getElevation();
        result = result * PRIME + ($elevation == null ? 43 : $elevation.hashCode());
        final Object $detailed = this.getDetailed();
        result = result * PRIME + ($detailed == null ? 43 : $detailed.hashCode());
        return result;
    }

    public String toString() {
        return "DailyDistanceData(floorsClimbed=" + this.getFloorsClimbed() + ", steps=" + this.getSteps() + ", distanceMeters=" + this.getDistanceMeters() + ", swimming=" + this.getSwimming() + ", elevation=" + this.getElevation() + ", detailed=" + this.getDetailed() + ")";
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Swimming {
        @JsonProperty("num_strokes")
        private Integer numStrokes;
        @JsonProperty("num_laps")
        private Integer numLaps;
        @JsonProperty("pool_length_meters")
        private Double poolLengthMeters;

        public Swimming() {
        }

        public Integer getNumStrokes() {
            return this.numStrokes;
        }

        public Integer getNumLaps() {
            return this.numLaps;
        }

        public Double getPoolLengthMeters() {
            return this.poolLengthMeters;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Swimming)) return false;
            final Swimming other = (Swimming) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$numStrokes = this.getNumStrokes();
            final Object other$numStrokes = other.getNumStrokes();
            if (this$numStrokes == null ? other$numStrokes != null : !this$numStrokes.equals(other$numStrokes))
                return false;
            final Object this$numLaps = this.getNumLaps();
            final Object other$numLaps = other.getNumLaps();
            if (this$numLaps == null ? other$numLaps != null : !this$numLaps.equals(other$numLaps)) return false;
            final Object this$poolLengthMeters = this.getPoolLengthMeters();
            final Object other$poolLengthMeters = other.getPoolLengthMeters();
            if (this$poolLengthMeters == null ? other$poolLengthMeters != null : !this$poolLengthMeters.equals(other$poolLengthMeters))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Swimming;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $numStrokes = this.getNumStrokes();
            result = result * PRIME + ($numStrokes == null ? 43 : $numStrokes.hashCode());
            final Object $numLaps = this.getNumLaps();
            result = result * PRIME + ($numLaps == null ? 43 : $numLaps.hashCode());
            final Object $poolLengthMeters = this.getPoolLengthMeters();
            result = result * PRIME + ($poolLengthMeters == null ? 43 : $poolLengthMeters.hashCode());
            return result;
        }

        public String toString() {
            return "DailyDistanceData.Swimming(numStrokes=" + this.getNumStrokes() + ", numLaps=" + this.getNumLaps() + ", poolLengthMeters=" + this.getPoolLengthMeters() + ")";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Elevation {
        @JsonProperty("loss_actual_meters")
        private Double lossActualMeters;
        @JsonProperty("min_meters")
        private Double minMeters;
        @JsonProperty("avg_meters")
        private Double avgMeters;
        @JsonProperty("gain_actual_meters")
        private Double gainActualMeters;
        @JsonProperty("max_meters")
        private Double maxMeters;
        @JsonProperty("gain_planned_meters")
        private Double gainPlannedMeters;

        public Elevation() {
        }

        public Double getLossActualMeters() {
            return this.lossActualMeters;
        }

        public Double getMinMeters() {
            return this.minMeters;
        }

        public Double getAvgMeters() {
            return this.avgMeters;
        }

        public Double getGainActualMeters() {
            return this.gainActualMeters;
        }

        public Double getMaxMeters() {
            return this.maxMeters;
        }

        public Double getGainPlannedMeters() {
            return this.gainPlannedMeters;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Elevation)) return false;
            final Elevation other = (Elevation) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$lossActualMeters = this.getLossActualMeters();
            final Object other$lossActualMeters = other.getLossActualMeters();
            if (this$lossActualMeters == null ? other$lossActualMeters != null : !this$lossActualMeters.equals(other$lossActualMeters))
                return false;
            final Object this$minMeters = this.getMinMeters();
            final Object other$minMeters = other.getMinMeters();
            if (this$minMeters == null ? other$minMeters != null : !this$minMeters.equals(other$minMeters))
                return false;
            final Object this$avgMeters = this.getAvgMeters();
            final Object other$avgMeters = other.getAvgMeters();
            if (this$avgMeters == null ? other$avgMeters != null : !this$avgMeters.equals(other$avgMeters))
                return false;
            final Object this$gainActualMeters = this.getGainActualMeters();
            final Object other$gainActualMeters = other.getGainActualMeters();
            if (this$gainActualMeters == null ? other$gainActualMeters != null : !this$gainActualMeters.equals(other$gainActualMeters))
                return false;
            final Object this$maxMeters = this.getMaxMeters();
            final Object other$maxMeters = other.getMaxMeters();
            if (this$maxMeters == null ? other$maxMeters != null : !this$maxMeters.equals(other$maxMeters))
                return false;
            final Object this$gainPlannedMeters = this.getGainPlannedMeters();
            final Object other$gainPlannedMeters = other.getGainPlannedMeters();
            if (this$gainPlannedMeters == null ? other$gainPlannedMeters != null : !this$gainPlannedMeters.equals(other$gainPlannedMeters))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Elevation;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $lossActualMeters = this.getLossActualMeters();
            result = result * PRIME + ($lossActualMeters == null ? 43 : $lossActualMeters.hashCode());
            final Object $minMeters = this.getMinMeters();
            result = result * PRIME + ($minMeters == null ? 43 : $minMeters.hashCode());
            final Object $avgMeters = this.getAvgMeters();
            result = result * PRIME + ($avgMeters == null ? 43 : $avgMeters.hashCode());
            final Object $gainActualMeters = this.getGainActualMeters();
            result = result * PRIME + ($gainActualMeters == null ? 43 : $gainActualMeters.hashCode());
            final Object $maxMeters = this.getMaxMeters();
            result = result * PRIME + ($maxMeters == null ? 43 : $maxMeters.hashCode());
            final Object $gainPlannedMeters = this.getGainPlannedMeters();
            result = result * PRIME + ($gainPlannedMeters == null ? 43 : $gainPlannedMeters.hashCode());
            return result;
        }

        public String toString() {
            return "DailyDistanceData.Elevation(lossActualMeters=" + this.getLossActualMeters() + ", minMeters=" + this.getMinMeters() + ", avgMeters=" + this.getAvgMeters() + ", gainActualMeters=" + this.getGainActualMeters() + ", maxMeters=" + this.getMaxMeters() + ", gainPlannedMeters=" + this.getGainPlannedMeters() + ")";
        }
    }

    @JsonProperty("floors_climbed")
    private Integer floorsClimbed;
    @JsonProperty("steps")
    private Integer steps;
    @JsonProperty("distance_meters")
    private Double distanceMeters;
    @JsonProperty("swimming")
    private Swimming swimming;
    @JsonProperty("elevation")
    private Elevation elevation;
    

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Detailed {
        @JsonProperty("distance_samples")
        private List<DistanceSample> distanceSamples;
        @JsonProperty("elevation_samples")
        private List<ElevationSample> elevationSamples;
        @JsonProperty("step_samples")
        private List<StepSample> stepSamples;

        public Detailed() {
        }

        public List<DistanceSample> getDistanceSamples() {
            return this.distanceSamples;
        }

        public List<ElevationSample> getElevationSamples() {
            return this.elevationSamples;
        }

        public List<StepSample> getStepSamples() {
            return this.stepSamples;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Detailed)) return false;
            final Detailed other = (Detailed) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$distanceSamples = this.getDistanceSamples();
            final Object other$distanceSamples = other.getDistanceSamples();
            if (this$distanceSamples == null ? other$distanceSamples != null : !this$distanceSamples.equals(other$distanceSamples))
                return false;
            final Object this$elevationSamples = this.getElevationSamples();
            final Object other$elevationSamples = other.getElevationSamples();
            if (this$elevationSamples == null ? other$elevationSamples != null : !this$elevationSamples.equals(other$elevationSamples))
                return false;
            final Object this$stepSamples = this.getStepSamples();
            final Object other$stepSamples = other.getStepSamples();
            if (this$stepSamples == null ? other$stepSamples != null : !this$stepSamples.equals(other$stepSamples))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Detailed;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $distanceSamples = this.getDistanceSamples();
            result = result * PRIME + ($distanceSamples == null ? 43 : $distanceSamples.hashCode());
            final Object $elevationSamples = this.getElevationSamples();
            result = result * PRIME + ($elevationSamples == null ? 43 : $elevationSamples.hashCode());
            final Object $stepSamples = this.getStepSamples();
            result = result * PRIME + ($stepSamples == null ? 43 : $stepSamples.hashCode());
            return result;
        }

        public String toString() {
            return "DailyDistanceData.Detailed(distanceSamples=" + this.getDistanceSamples() + ", elevationSamples=" + this.getElevationSamples() + ", stepSamples=" + this.getStepSamples() + ")";
        }
    }
    @JsonProperty("detailed")
    private Detailed detailed;
}
