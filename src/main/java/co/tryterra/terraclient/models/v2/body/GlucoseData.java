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

package co.tryterra.terraclient.models.v2.body;

import co.tryterra.terraclient.models.v2.samples.GlucoseDataSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GlucoseData {
    @JsonProperty("day_avg_blood_glucose_mg_per_dL")
    private Double dayAvgBloodGlucoseMgPerDl;
    @JsonProperty("blood_glucose_samples")
    private List<GlucoseDataSample> bloodGlucoseSamples;
    @JsonProperty("detailed_blood_glucose_samples")
    private List<GlucoseDataSample> detailedBloodGlucoseSamples;

    public GlucoseData() {
    }

    public Double getDayAvgBloodGlucoseMgPerDl() {
        return this.dayAvgBloodGlucoseMgPerDl;
    }

    public List<GlucoseDataSample> getBloodGlucoseSamples() {
        return this.bloodGlucoseSamples;
    }

    public List<GlucoseDataSample> getDetailedBloodGlucoseSamples() {
        return this.detailedBloodGlucoseSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GlucoseData)) return false;
        final GlucoseData other = (GlucoseData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$dayAvgBloodGlucoseMgPerDl = this.getDayAvgBloodGlucoseMgPerDl();
        final Object other$dayAvgBloodGlucoseMgPerDl = other.getDayAvgBloodGlucoseMgPerDl();
        if (this$dayAvgBloodGlucoseMgPerDl == null ? other$dayAvgBloodGlucoseMgPerDl != null : !this$dayAvgBloodGlucoseMgPerDl.equals(other$dayAvgBloodGlucoseMgPerDl))
            return false;
        final Object this$bloodGlucoseSamples = this.getBloodGlucoseSamples();
        final Object other$bloodGlucoseSamples = other.getBloodGlucoseSamples();
        if (this$bloodGlucoseSamples == null ? other$bloodGlucoseSamples != null : !this$bloodGlucoseSamples.equals(other$bloodGlucoseSamples))
            return false;
        final Object this$detailedBloodGlucoseSamples = this.getDetailedBloodGlucoseSamples();
        final Object other$detailedBloodGlucoseSamples = other.getDetailedBloodGlucoseSamples();
        if (this$detailedBloodGlucoseSamples == null ? other$detailedBloodGlucoseSamples != null : !this$detailedBloodGlucoseSamples.equals(other$detailedBloodGlucoseSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GlucoseData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $dayAvgBloodGlucoseMgPerDl = this.getDayAvgBloodGlucoseMgPerDl();
        result = result * PRIME + ($dayAvgBloodGlucoseMgPerDl == null ? 43 : $dayAvgBloodGlucoseMgPerDl.hashCode());
        final Object $bloodGlucoseSamples = this.getBloodGlucoseSamples();
        result = result * PRIME + ($bloodGlucoseSamples == null ? 43 : $bloodGlucoseSamples.hashCode());
        final Object $detailedBloodGlucoseSamples = this.getDetailedBloodGlucoseSamples();
        result = result * PRIME + ($detailedBloodGlucoseSamples == null ? 43 : $detailedBloodGlucoseSamples.hashCode());
        return result;
    }

    public String toString() {
        return "GlucoseData(dayAvgBloodGlucoseMgPerDl=" + this.getDayAvgBloodGlucoseMgPerDl() + ", bloodGlucoseSamples=" + this.getBloodGlucoseSamples() + ", detailedBloodGlucoseSamples=" + this.getDetailedBloodGlucoseSamples() + ")";
    }
}
