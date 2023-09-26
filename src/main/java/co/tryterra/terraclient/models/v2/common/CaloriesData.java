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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CaloriesData {
    @JsonProperty("net_intake_calories")
    private Double netIntakeCalories;
    @JsonProperty("BMR_calories")
    private Double bmrCalories;
    @JsonProperty("total_burned_calories")
    private Double totalBurnedCalories;
    @JsonProperty("net_activity_calories")
    private Double netActivityCalories;

    public CaloriesData() {
    }

    public Double getNetIntakeCalories() {
        return this.netIntakeCalories;
    }

    public Double getBmrCalories() {
        return this.bmrCalories;
    }

    public Double getTotalBurnedCalories() {
        return this.totalBurnedCalories;
    }

    public Double getNetActivityCalories() {
        return this.netActivityCalories;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CaloriesData)) return false;
        final CaloriesData other = (CaloriesData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$netIntakeCalories = this.getNetIntakeCalories();
        final Object other$netIntakeCalories = other.getNetIntakeCalories();
        if (this$netIntakeCalories == null ? other$netIntakeCalories != null : !this$netIntakeCalories.equals(other$netIntakeCalories))
            return false;
        final Object this$bmrCalories = this.getBmrCalories();
        final Object other$bmrCalories = other.getBmrCalories();
        if (this$bmrCalories == null ? other$bmrCalories != null : !this$bmrCalories.equals(other$bmrCalories))
            return false;
        final Object this$totalBurnedCalories = this.getTotalBurnedCalories();
        final Object other$totalBurnedCalories = other.getTotalBurnedCalories();
        if (this$totalBurnedCalories == null ? other$totalBurnedCalories != null : !this$totalBurnedCalories.equals(other$totalBurnedCalories))
            return false;
        final Object this$netActivityCalories = this.getNetActivityCalories();
        final Object other$netActivityCalories = other.getNetActivityCalories();
        if (this$netActivityCalories == null ? other$netActivityCalories != null : !this$netActivityCalories.equals(other$netActivityCalories))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CaloriesData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $netIntakeCalories = this.getNetIntakeCalories();
        result = result * PRIME + ($netIntakeCalories == null ? 43 : $netIntakeCalories.hashCode());
        final Object $bmrCalories = this.getBmrCalories();
        result = result * PRIME + ($bmrCalories == null ? 43 : $bmrCalories.hashCode());
        final Object $totalBurnedCalories = this.getTotalBurnedCalories();
        result = result * PRIME + ($totalBurnedCalories == null ? 43 : $totalBurnedCalories.hashCode());
        final Object $netActivityCalories = this.getNetActivityCalories();
        result = result * PRIME + ($netActivityCalories == null ? 43 : $netActivityCalories.hashCode());
        return result;
    }

    public String toString() {
        return "CaloriesData(netIntakeCalories=" + this.getNetIntakeCalories() + ", bmrCalories=" + this.getBmrCalories() + ", totalBurnedCalories=" + this.getTotalBurnedCalories() + ", netActivityCalories=" + this.getNetActivityCalories() + ")";
    }
}
