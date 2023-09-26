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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnergyData {
    @JsonProperty("energy_kilojoules")
    private Double energyKilojoules;
    @JsonProperty("energy_planned_kilojoules")
    private Double energyPlannedKilojoules;

    public EnergyData() {
    }

    public Double getEnergyKilojoules() {
        return this.energyKilojoules;
    }

    public Double getEnergyPlannedKilojoules() {
        return this.energyPlannedKilojoules;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EnergyData)) return false;
        final EnergyData other = (EnergyData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$energyKilojoules = this.getEnergyKilojoules();
        final Object other$energyKilojoules = other.getEnergyKilojoules();
        if (this$energyKilojoules == null ? other$energyKilojoules != null : !this$energyKilojoules.equals(other$energyKilojoules))
            return false;
        final Object this$energyPlannedKilojoules = this.getEnergyPlannedKilojoules();
        final Object other$energyPlannedKilojoules = other.getEnergyPlannedKilojoules();
        if (this$energyPlannedKilojoules == null ? other$energyPlannedKilojoules != null : !this$energyPlannedKilojoules.equals(other$energyPlannedKilojoules))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EnergyData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $energyKilojoules = this.getEnergyKilojoules();
        result = result * PRIME + ($energyKilojoules == null ? 43 : $energyKilojoules.hashCode());
        final Object $energyPlannedKilojoules = this.getEnergyPlannedKilojoules();
        result = result * PRIME + ($energyPlannedKilojoules == null ? 43 : $energyPlannedKilojoules.hashCode());
        return result;
    }

    public String toString() {
        return "EnergyData(energyKilojoules=" + this.getEnergyKilojoules() + ", energyPlannedKilojoules=" + this.getEnergyPlannedKilojoules() + ")";
    }
}
