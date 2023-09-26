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

import co.tryterra.terraclient.models.v2.samples.HydrationLevelSample;
import co.tryterra.terraclient.models.v2.samples.HydrationMeasurementSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HydrationData {
    @JsonProperty("day_total_water_consumption_ml")
    private Integer dayTotalWaterConsumptionMl;
    @JsonProperty("hydration_amount_samples")
    private List<HydrationLevelSample> hydrationAmountSamples;
    @JsonProperty("hydration_level_samples")
    private List<HydrationMeasurementSample> hydrationLevelSamples;

    public HydrationData() {
    }

    public Integer getDayTotalWaterConsumptionMl() {
        return this.dayTotalWaterConsumptionMl;
    }

    public List<HydrationLevelSample> getHydrationAmountSamples() {
        return this.hydrationAmountSamples;
    }

    public List<HydrationMeasurementSample> getHydrationLevelSamples() {
        return this.hydrationLevelSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HydrationData)) return false;
        final HydrationData other = (HydrationData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$dayTotalWaterConsumptionMl = this.getDayTotalWaterConsumptionMl();
        final Object other$dayTotalWaterConsumptionMl = other.getDayTotalWaterConsumptionMl();
        if (this$dayTotalWaterConsumptionMl == null ? other$dayTotalWaterConsumptionMl != null : !this$dayTotalWaterConsumptionMl.equals(other$dayTotalWaterConsumptionMl))
            return false;
        final Object this$hydrationAmountSamples = this.getHydrationAmountSamples();
        final Object other$hydrationAmountSamples = other.getHydrationAmountSamples();
        if (this$hydrationAmountSamples == null ? other$hydrationAmountSamples != null : !this$hydrationAmountSamples.equals(other$hydrationAmountSamples))
            return false;
        final Object this$hydrationLevelSamples = this.getHydrationLevelSamples();
        final Object other$hydrationLevelSamples = other.getHydrationLevelSamples();
        if (this$hydrationLevelSamples == null ? other$hydrationLevelSamples != null : !this$hydrationLevelSamples.equals(other$hydrationLevelSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HydrationData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $dayTotalWaterConsumptionMl = this.getDayTotalWaterConsumptionMl();
        result = result * PRIME + ($dayTotalWaterConsumptionMl == null ? 43 : $dayTotalWaterConsumptionMl.hashCode());
        final Object $hydrationAmountSamples = this.getHydrationAmountSamples();
        result = result * PRIME + ($hydrationAmountSamples == null ? 43 : $hydrationAmountSamples.hashCode());
        final Object $hydrationLevelSamples = this.getHydrationLevelSamples();
        result = result * PRIME + ($hydrationLevelSamples == null ? 43 : $hydrationLevelSamples.hashCode());
        return result;
    }

    public String toString() {
        return "HydrationData(dayTotalWaterConsumptionMl=" + this.getDayTotalWaterConsumptionMl() + ", hydrationAmountSamples=" + this.getHydrationAmountSamples() + ", hydrationLevelSamples=" + this.getHydrationLevelSamples() + ")";
    }
}
