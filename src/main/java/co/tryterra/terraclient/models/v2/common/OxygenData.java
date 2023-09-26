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

import co.tryterra.terraclient.models.v2.samples.OxygenSaturationSample;
import co.tryterra.terraclient.models.v2.samples.Vo2MaxSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OxygenData {
    @JsonProperty("avg_saturation_percentage")
    private Double avgSaturationPercentage;
    @JsonProperty("vo2max_ml_per_min_per_kg")
    private Double vo2MaxMlPerMinPerKg;
    @JsonProperty("saturation_samples")
    private List<OxygenSaturationSample> saturationSamples;
    @JsonProperty("vo2_samples")
    private List<Vo2MaxSample> vo2Samples;

    public OxygenData() {
    }

    public Double getAvgSaturationPercentage() {
        return this.avgSaturationPercentage;
    }

    public Double getVo2MaxMlPerMinPerKg() {
        return this.vo2MaxMlPerMinPerKg;
    }

    public List<OxygenSaturationSample> getSaturationSamples() {
        return this.saturationSamples;
    }

    public List<Vo2MaxSample> getVo2Samples() {
        return this.vo2Samples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OxygenData)) return false;
        final OxygenData other = (OxygenData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$avgSaturationPercentage = this.getAvgSaturationPercentage();
        final Object other$avgSaturationPercentage = other.getAvgSaturationPercentage();
        if (this$avgSaturationPercentage == null ? other$avgSaturationPercentage != null : !this$avgSaturationPercentage.equals(other$avgSaturationPercentage))
            return false;
        final Object this$vo2MaxMlPerMinPerKg = this.getVo2MaxMlPerMinPerKg();
        final Object other$vo2MaxMlPerMinPerKg = other.getVo2MaxMlPerMinPerKg();
        if (this$vo2MaxMlPerMinPerKg == null ? other$vo2MaxMlPerMinPerKg != null : !this$vo2MaxMlPerMinPerKg.equals(other$vo2MaxMlPerMinPerKg))
            return false;
        final Object this$saturationSamples = this.getSaturationSamples();
        final Object other$saturationSamples = other.getSaturationSamples();
        if (this$saturationSamples == null ? other$saturationSamples != null : !this$saturationSamples.equals(other$saturationSamples))
            return false;
        final Object this$vo2Samples = this.getVo2Samples();
        final Object other$vo2Samples = other.getVo2Samples();
        if (this$vo2Samples == null ? other$vo2Samples != null : !this$vo2Samples.equals(other$vo2Samples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OxygenData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $avgSaturationPercentage = this.getAvgSaturationPercentage();
        result = result * PRIME + ($avgSaturationPercentage == null ? 43 : $avgSaturationPercentage.hashCode());
        final Object $vo2MaxMlPerMinPerKg = this.getVo2MaxMlPerMinPerKg();
        result = result * PRIME + ($vo2MaxMlPerMinPerKg == null ? 43 : $vo2MaxMlPerMinPerKg.hashCode());
        final Object $saturationSamples = this.getSaturationSamples();
        result = result * PRIME + ($saturationSamples == null ? 43 : $saturationSamples.hashCode());
        final Object $vo2Samples = this.getVo2Samples();
        result = result * PRIME + ($vo2Samples == null ? 43 : $vo2Samples.hashCode());
        return result;
    }

    public String toString() {
        return "OxygenData(avgSaturationPercentage=" + this.getAvgSaturationPercentage() + ", vo2MaxMlPerMinPerKg=" + this.getVo2MaxMlPerMinPerKg() + ", saturationSamples=" + this.getSaturationSamples() + ", vo2Samples=" + this.getVo2Samples() + ")";
    }
}
