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

import co.tryterra.terraclient.models.v2.samples.PowerSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PowerData {
    @JsonProperty("max_watts")
    private Double maxWatts;
    @JsonProperty("avg_watts")
    private Double avgWatts;
    @JsonProperty("power_samples")
    private List<PowerSample> powerSamples;

    public PowerData() {
    }

    public Double getMaxWatts() {
        return this.maxWatts;
    }

    public Double getAvgWatts() {
        return this.avgWatts;
    }

    public List<PowerSample> getPowerSamples() {
        return this.powerSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PowerData)) return false;
        final PowerData other = (PowerData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$maxWatts = this.getMaxWatts();
        final Object other$maxWatts = other.getMaxWatts();
        if (this$maxWatts == null ? other$maxWatts != null : !this$maxWatts.equals(other$maxWatts)) return false;
        final Object this$avgWatts = this.getAvgWatts();
        final Object other$avgWatts = other.getAvgWatts();
        if (this$avgWatts == null ? other$avgWatts != null : !this$avgWatts.equals(other$avgWatts)) return false;
        final Object this$powerSamples = this.getPowerSamples();
        final Object other$powerSamples = other.getPowerSamples();
        if (this$powerSamples == null ? other$powerSamples != null : !this$powerSamples.equals(other$powerSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PowerData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $maxWatts = this.getMaxWatts();
        result = result * PRIME + ($maxWatts == null ? 43 : $maxWatts.hashCode());
        final Object $avgWatts = this.getAvgWatts();
        result = result * PRIME + ($avgWatts == null ? 43 : $avgWatts.hashCode());
        final Object $powerSamples = this.getPowerSamples();
        result = result * PRIME + ($powerSamples == null ? 43 : $powerSamples.hashCode());
        return result;
    }

    public String toString() {
        return "PowerData(maxWatts=" + this.getMaxWatts() + ", avgWatts=" + this.getAvgWatts() + ", powerSamples=" + this.getPowerSamples() + ")";
    }
}
