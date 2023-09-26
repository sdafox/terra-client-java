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

import co.tryterra.terraclient.models.v2.samples.TemperatureSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TemperatureData {
    @JsonProperty("body_temperature_samples")
    private List<TemperatureSample> bodyTemperatureSamples;
    @JsonProperty("ambient_temperature_samples")
    private List<TemperatureSample> ambientTemperatureSamples;
    @JsonProperty("skin_temperature_samples")
    private List<TemperatureSample> skinTemperatureSamples;

    public TemperatureData() {
    }

    public List<TemperatureSample> getBodyTemperatureSamples() {
        return this.bodyTemperatureSamples;
    }

    public List<TemperatureSample> getAmbientTemperatureSamples() {
        return this.ambientTemperatureSamples;
    }

    public List<TemperatureSample> getSkinTemperatureSamples() {
        return this.skinTemperatureSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TemperatureData)) return false;
        final TemperatureData other = (TemperatureData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$bodyTemperatureSamples = this.getBodyTemperatureSamples();
        final Object other$bodyTemperatureSamples = other.getBodyTemperatureSamples();
        if (this$bodyTemperatureSamples == null ? other$bodyTemperatureSamples != null : !this$bodyTemperatureSamples.equals(other$bodyTemperatureSamples))
            return false;
        final Object this$ambientTemperatureSamples = this.getAmbientTemperatureSamples();
        final Object other$ambientTemperatureSamples = other.getAmbientTemperatureSamples();
        if (this$ambientTemperatureSamples == null ? other$ambientTemperatureSamples != null : !this$ambientTemperatureSamples.equals(other$ambientTemperatureSamples))
            return false;
        final Object this$skinTemperatureSamples = this.getSkinTemperatureSamples();
        final Object other$skinTemperatureSamples = other.getSkinTemperatureSamples();
        if (this$skinTemperatureSamples == null ? other$skinTemperatureSamples != null : !this$skinTemperatureSamples.equals(other$skinTemperatureSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TemperatureData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $bodyTemperatureSamples = this.getBodyTemperatureSamples();
        result = result * PRIME + ($bodyTemperatureSamples == null ? 43 : $bodyTemperatureSamples.hashCode());
        final Object $ambientTemperatureSamples = this.getAmbientTemperatureSamples();
        result = result * PRIME + ($ambientTemperatureSamples == null ? 43 : $ambientTemperatureSamples.hashCode());
        final Object $skinTemperatureSamples = this.getSkinTemperatureSamples();
        result = result * PRIME + ($skinTemperatureSamples == null ? 43 : $skinTemperatureSamples.hashCode());
        return result;
    }

    public String toString() {
        return "TemperatureData(bodyTemperatureSamples=" + this.getBodyTemperatureSamples() + ", ambientTemperatureSamples=" + this.getAmbientTemperatureSamples() + ", skinTemperatureSamples=" + this.getSkinTemperatureSamples() + ")";
    }
}
