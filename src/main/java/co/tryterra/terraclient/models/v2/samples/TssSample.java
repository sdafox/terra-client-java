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
public class TssSample {
    private Double planned;
    private Double actual;
    private String method;
    @JsonProperty("intensity_factor_planned")
    private Double intensityFactorPlanned;
    @JsonProperty("intensity_factor_actual")
    private Double intensityFactorActual;
    @JsonProperty("normalized_power_watts")
    private Double normalizedPowerWatts;

    public TssSample() {
    }

    public Double getPlanned() {
        return this.planned;
    }

    public Double getActual() {
        return this.actual;
    }

    public String getMethod() {
        return this.method;
    }

    public Double getIntensityFactorPlanned() {
        return this.intensityFactorPlanned;
    }

    public Double getIntensityFactorActual() {
        return this.intensityFactorActual;
    }

    public Double getNormalizedPowerWatts() {
        return this.normalizedPowerWatts;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TssSample)) return false;
        final TssSample other = (TssSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$planned = this.getPlanned();
        final Object other$planned = other.getPlanned();
        if (this$planned == null ? other$planned != null : !this$planned.equals(other$planned)) return false;
        final Object this$actual = this.getActual();
        final Object other$actual = other.getActual();
        if (this$actual == null ? other$actual != null : !this$actual.equals(other$actual)) return false;
        final Object this$method = this.getMethod();
        final Object other$method = other.getMethod();
        if (this$method == null ? other$method != null : !this$method.equals(other$method)) return false;
        final Object this$intensityFactorPlanned = this.getIntensityFactorPlanned();
        final Object other$intensityFactorPlanned = other.getIntensityFactorPlanned();
        if (this$intensityFactorPlanned == null ? other$intensityFactorPlanned != null : !this$intensityFactorPlanned.equals(other$intensityFactorPlanned))
            return false;
        final Object this$intensityFactorActual = this.getIntensityFactorActual();
        final Object other$intensityFactorActual = other.getIntensityFactorActual();
        if (this$intensityFactorActual == null ? other$intensityFactorActual != null : !this$intensityFactorActual.equals(other$intensityFactorActual))
            return false;
        final Object this$normalizedPowerWatts = this.getNormalizedPowerWatts();
        final Object other$normalizedPowerWatts = other.getNormalizedPowerWatts();
        if (this$normalizedPowerWatts == null ? other$normalizedPowerWatts != null : !this$normalizedPowerWatts.equals(other$normalizedPowerWatts))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TssSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $planned = this.getPlanned();
        result = result * PRIME + ($planned == null ? 43 : $planned.hashCode());
        final Object $actual = this.getActual();
        result = result * PRIME + ($actual == null ? 43 : $actual.hashCode());
        final Object $method = this.getMethod();
        result = result * PRIME + ($method == null ? 43 : $method.hashCode());
        final Object $intensityFactorPlanned = this.getIntensityFactorPlanned();
        result = result * PRIME + ($intensityFactorPlanned == null ? 43 : $intensityFactorPlanned.hashCode());
        final Object $intensityFactorActual = this.getIntensityFactorActual();
        result = result * PRIME + ($intensityFactorActual == null ? 43 : $intensityFactorActual.hashCode());
        final Object $normalizedPowerWatts = this.getNormalizedPowerWatts();
        result = result * PRIME + ($normalizedPowerWatts == null ? 43 : $normalizedPowerWatts.hashCode());
        return result;
    }

    public String toString() {
        return "TssSample(planned=" + this.getPlanned() + ", actual=" + this.getActual() + ", method=" + this.getMethod() + ", intensityFactorPlanned=" + this.getIntensityFactorPlanned() + ", intensityFactorActual=" + this.getIntensityFactorActual() + ", normalizedPowerWatts=" + this.getNormalizedPowerWatts() + ")";
    }
}
