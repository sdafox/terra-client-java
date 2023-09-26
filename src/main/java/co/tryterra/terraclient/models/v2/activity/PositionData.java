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

import co.tryterra.terraclient.models.v2.samples.PositionSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionData {
    @JsonProperty("centre_pos_lat_lng_deg")
    private List<Double> centrePosLatLngDeg;
    @JsonProperty("start_pos_lat_lng_deg")
    private List<Double> startPosLatLngDeg;
    @JsonProperty("end_pos_lat_lng_deg")
    private List<Double> endPosLatLngDeg;
    @JsonProperty("position_samples")
    private List<PositionSample> positionSamples;

    public PositionData() {
    }

    public List<Double> getCentrePosLatLngDeg() {
        return this.centrePosLatLngDeg;
    }

    public List<Double> getStartPosLatLngDeg() {
        return this.startPosLatLngDeg;
    }

    public List<Double> getEndPosLatLngDeg() {
        return this.endPosLatLngDeg;
    }

    public List<PositionSample> getPositionSamples() {
        return this.positionSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PositionData)) return false;
        final PositionData other = (PositionData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$centrePosLatLngDeg = this.getCentrePosLatLngDeg();
        final Object other$centrePosLatLngDeg = other.getCentrePosLatLngDeg();
        if (this$centrePosLatLngDeg == null ? other$centrePosLatLngDeg != null : !this$centrePosLatLngDeg.equals(other$centrePosLatLngDeg))
            return false;
        final Object this$startPosLatLngDeg = this.getStartPosLatLngDeg();
        final Object other$startPosLatLngDeg = other.getStartPosLatLngDeg();
        if (this$startPosLatLngDeg == null ? other$startPosLatLngDeg != null : !this$startPosLatLngDeg.equals(other$startPosLatLngDeg))
            return false;
        final Object this$endPosLatLngDeg = this.getEndPosLatLngDeg();
        final Object other$endPosLatLngDeg = other.getEndPosLatLngDeg();
        if (this$endPosLatLngDeg == null ? other$endPosLatLngDeg != null : !this$endPosLatLngDeg.equals(other$endPosLatLngDeg))
            return false;
        final Object this$positionSamples = this.getPositionSamples();
        final Object other$positionSamples = other.getPositionSamples();
        if (this$positionSamples == null ? other$positionSamples != null : !this$positionSamples.equals(other$positionSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PositionData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $centrePosLatLngDeg = this.getCentrePosLatLngDeg();
        result = result * PRIME + ($centrePosLatLngDeg == null ? 43 : $centrePosLatLngDeg.hashCode());
        final Object $startPosLatLngDeg = this.getStartPosLatLngDeg();
        result = result * PRIME + ($startPosLatLngDeg == null ? 43 : $startPosLatLngDeg.hashCode());
        final Object $endPosLatLngDeg = this.getEndPosLatLngDeg();
        result = result * PRIME + ($endPosLatLngDeg == null ? 43 : $endPosLatLngDeg.hashCode());
        final Object $positionSamples = this.getPositionSamples();
        result = result * PRIME + ($positionSamples == null ? 43 : $positionSamples.hashCode());
        return result;
    }

    public String toString() {
        return "PositionData(centrePosLatLngDeg=" + this.getCentrePosLatLngDeg() + ", startPosLatLngDeg=" + this.getStartPosLatLngDeg() + ", endPosLatLngDeg=" + this.getEndPosLatLngDeg() + ", positionSamples=" + this.getPositionSamples() + ")";
    }
}
