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

import co.tryterra.terraclient.models.v2.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Activity {
    @JsonProperty("active_durations_data")
    private ActiveDurationsData activeDurationsData;
    @JsonProperty("calories_data")
    private CaloriesData caloriesData;
    @JsonProperty("device_data")
    private DeviceData deviceData;
    @JsonProperty("distance_data")
    private DistanceData distanceData;
    @JsonProperty("energy_data")
    private EnergyData energyData;
    @JsonProperty("heart_rate_data")
    private HeartRateData heartRateData;
    @JsonProperty("lap_data")
    private LapData lapData;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("MET_data")
    private MetData metData;
    @JsonProperty("movement_data")
    private MovementData movementData;
    @JsonProperty("oxygen_data")
    private OxygenData oxygenData;
    @JsonProperty("polyline_map_data")
    private PolylineMapData polylineMapData;
    @JsonProperty("position_data")
    private PositionData positionData;
    @JsonProperty("power_data")
    private PowerData powerData;
    @JsonProperty("strain_data")
    private StrainData strainData;
    @JsonProperty("TSS_data")
    private TssData tssData;
    @JsonProperty("work_data")
    private WorkData workData;

    public Activity() {
    }

    public ActiveDurationsData getActiveDurationsData() {
        return this.activeDurationsData;
    }

    public CaloriesData getCaloriesData() {
        return this.caloriesData;
    }

    public DeviceData getDeviceData() {
        return this.deviceData;
    }

    public DistanceData getDistanceData() {
        return this.distanceData;
    }

    public EnergyData getEnergyData() {
        return this.energyData;
    }

    public HeartRateData getHeartRateData() {
        return this.heartRateData;
    }

    public LapData getLapData() {
        return this.lapData;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public MetData getMetData() {
        return this.metData;
    }

    public MovementData getMovementData() {
        return this.movementData;
    }

    public OxygenData getOxygenData() {
        return this.oxygenData;
    }

    public PolylineMapData getPolylineMapData() {
        return this.polylineMapData;
    }

    public PositionData getPositionData() {
        return this.positionData;
    }

    public PowerData getPowerData() {
        return this.powerData;
    }

    public StrainData getStrainData() {
        return this.strainData;
    }

    public TssData getTssData() {
        return this.tssData;
    }

    public WorkData getWorkData() {
        return this.workData;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Activity)) return false;
        final Activity other = (Activity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$activeDurationsData = this.getActiveDurationsData();
        final Object other$activeDurationsData = other.getActiveDurationsData();
        if (this$activeDurationsData == null ? other$activeDurationsData != null : !this$activeDurationsData.equals(other$activeDurationsData))
            return false;
        final Object this$caloriesData = this.getCaloriesData();
        final Object other$caloriesData = other.getCaloriesData();
        if (this$caloriesData == null ? other$caloriesData != null : !this$caloriesData.equals(other$caloriesData))
            return false;
        final Object this$deviceData = this.getDeviceData();
        final Object other$deviceData = other.getDeviceData();
        if (this$deviceData == null ? other$deviceData != null : !this$deviceData.equals(other$deviceData))
            return false;
        final Object this$distanceData = this.getDistanceData();
        final Object other$distanceData = other.getDistanceData();
        if (this$distanceData == null ? other$distanceData != null : !this$distanceData.equals(other$distanceData))
            return false;
        final Object this$energyData = this.getEnergyData();
        final Object other$energyData = other.getEnergyData();
        if (this$energyData == null ? other$energyData != null : !this$energyData.equals(other$energyData))
            return false;
        final Object this$heartRateData = this.getHeartRateData();
        final Object other$heartRateData = other.getHeartRateData();
        if (this$heartRateData == null ? other$heartRateData != null : !this$heartRateData.equals(other$heartRateData))
            return false;
        final Object this$lapData = this.getLapData();
        final Object other$lapData = other.getLapData();
        if (this$lapData == null ? other$lapData != null : !this$lapData.equals(other$lapData)) return false;
        final Object this$metadata = this.getMetadata();
        final Object other$metadata = other.getMetadata();
        if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
        final Object this$metData = this.getMetData();
        final Object other$metData = other.getMetData();
        if (this$metData == null ? other$metData != null : !this$metData.equals(other$metData)) return false;
        final Object this$movementData = this.getMovementData();
        final Object other$movementData = other.getMovementData();
        if (this$movementData == null ? other$movementData != null : !this$movementData.equals(other$movementData))
            return false;
        final Object this$oxygenData = this.getOxygenData();
        final Object other$oxygenData = other.getOxygenData();
        if (this$oxygenData == null ? other$oxygenData != null : !this$oxygenData.equals(other$oxygenData))
            return false;
        final Object this$polylineMapData = this.getPolylineMapData();
        final Object other$polylineMapData = other.getPolylineMapData();
        if (this$polylineMapData == null ? other$polylineMapData != null : !this$polylineMapData.equals(other$polylineMapData))
            return false;
        final Object this$positionData = this.getPositionData();
        final Object other$positionData = other.getPositionData();
        if (this$positionData == null ? other$positionData != null : !this$positionData.equals(other$positionData))
            return false;
        final Object this$powerData = this.getPowerData();
        final Object other$powerData = other.getPowerData();
        if (this$powerData == null ? other$powerData != null : !this$powerData.equals(other$powerData)) return false;
        final Object this$strainData = this.getStrainData();
        final Object other$strainData = other.getStrainData();
        if (this$strainData == null ? other$strainData != null : !this$strainData.equals(other$strainData))
            return false;
        final Object this$tssData = this.getTssData();
        final Object other$tssData = other.getTssData();
        if (this$tssData == null ? other$tssData != null : !this$tssData.equals(other$tssData)) return false;
        final Object this$workData = this.getWorkData();
        final Object other$workData = other.getWorkData();
        if (this$workData == null ? other$workData != null : !this$workData.equals(other$workData)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Activity;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $activeDurationsData = this.getActiveDurationsData();
        result = result * PRIME + ($activeDurationsData == null ? 43 : $activeDurationsData.hashCode());
        final Object $caloriesData = this.getCaloriesData();
        result = result * PRIME + ($caloriesData == null ? 43 : $caloriesData.hashCode());
        final Object $deviceData = this.getDeviceData();
        result = result * PRIME + ($deviceData == null ? 43 : $deviceData.hashCode());
        final Object $distanceData = this.getDistanceData();
        result = result * PRIME + ($distanceData == null ? 43 : $distanceData.hashCode());
        final Object $energyData = this.getEnergyData();
        result = result * PRIME + ($energyData == null ? 43 : $energyData.hashCode());
        final Object $heartRateData = this.getHeartRateData();
        result = result * PRIME + ($heartRateData == null ? 43 : $heartRateData.hashCode());
        final Object $lapData = this.getLapData();
        result = result * PRIME + ($lapData == null ? 43 : $lapData.hashCode());
        final Object $metadata = this.getMetadata();
        result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
        final Object $metData = this.getMetData();
        result = result * PRIME + ($metData == null ? 43 : $metData.hashCode());
        final Object $movementData = this.getMovementData();
        result = result * PRIME + ($movementData == null ? 43 : $movementData.hashCode());
        final Object $oxygenData = this.getOxygenData();
        result = result * PRIME + ($oxygenData == null ? 43 : $oxygenData.hashCode());
        final Object $polylineMapData = this.getPolylineMapData();
        result = result * PRIME + ($polylineMapData == null ? 43 : $polylineMapData.hashCode());
        final Object $positionData = this.getPositionData();
        result = result * PRIME + ($positionData == null ? 43 : $positionData.hashCode());
        final Object $powerData = this.getPowerData();
        result = result * PRIME + ($powerData == null ? 43 : $powerData.hashCode());
        final Object $strainData = this.getStrainData();
        result = result * PRIME + ($strainData == null ? 43 : $strainData.hashCode());
        final Object $tssData = this.getTssData();
        result = result * PRIME + ($tssData == null ? 43 : $tssData.hashCode());
        final Object $workData = this.getWorkData();
        result = result * PRIME + ($workData == null ? 43 : $workData.hashCode());
        return result;
    }

    public String toString() {
        return "Activity(activeDurationsData=" + this.getActiveDurationsData() + ", caloriesData=" + this.getCaloriesData() + ", deviceData=" + this.getDeviceData() + ", distanceData=" + this.getDistanceData() + ", energyData=" + this.getEnergyData() + ", heartRateData=" + this.getHeartRateData() + ", lapData=" + this.getLapData() + ", metadata=" + this.getMetadata() + ", metData=" + this.getMetData() + ", movementData=" + this.getMovementData() + ", oxygenData=" + this.getOxygenData() + ", polylineMapData=" + this.getPolylineMapData() + ", positionData=" + this.getPositionData() + ", powerData=" + this.getPowerData() + ", strainData=" + this.getStrainData() + ", tssData=" + this.getTssData() + ", workData=" + this.getWorkData() + ")";
    }
}
