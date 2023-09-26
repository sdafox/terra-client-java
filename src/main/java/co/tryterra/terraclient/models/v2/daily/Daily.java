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

package co.tryterra.terraclient.models.v2.daily;

import co.tryterra.terraclient.models.v2.activity.ActiveDurationsData;
import co.tryterra.terraclient.models.v2.common.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {
    private Metadata metadata;
    @JsonProperty("oxygen_data")
    private OxygenData oxygenData;
    @JsonProperty("tag_data")
    private TagData tagData;
    @JsonProperty("device_data")
    private DeviceData deviceData;
    @JsonProperty("distance_data")
    private DailyDistanceData distanceData;
    @JsonProperty("MET_data")
    private MetData metData;
    @JsonProperty("scores")
    private ScoresData scores;
    @JsonProperty("calories_data")
    private CaloriesData caloriesData;
    @JsonProperty("heart_rate_data")
    private HeartRateData heartRateData;
    @JsonProperty("active_durations_data")
    private ActiveDurationsData activeDurationsData;
    @JsonProperty("stress_data")
    private StressData stressData;

    public Daily() {
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public OxygenData getOxygenData() {
        return this.oxygenData;
    }

    public TagData getTagData() {
        return this.tagData;
    }

    public DeviceData getDeviceData() {
        return this.deviceData;
    }

    public DailyDistanceData getDistanceData() {
        return this.distanceData;
    }

    public MetData getMetData() {
        return this.metData;
    }

    public ScoresData getScores() {
        return this.scores;
    }

    public CaloriesData getCaloriesData() {
        return this.caloriesData;
    }

    public HeartRateData getHeartRateData() {
        return this.heartRateData;
    }

    public ActiveDurationsData getActiveDurationsData() {
        return this.activeDurationsData;
    }

    public StressData getStressData() {
        return this.stressData;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Daily)) return false;
        final Daily other = (Daily) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$metadata = this.getMetadata();
        final Object other$metadata = other.getMetadata();
        if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
        final Object this$oxygenData = this.getOxygenData();
        final Object other$oxygenData = other.getOxygenData();
        if (this$oxygenData == null ? other$oxygenData != null : !this$oxygenData.equals(other$oxygenData))
            return false;
        final Object this$tagData = this.getTagData();
        final Object other$tagData = other.getTagData();
        if (this$tagData == null ? other$tagData != null : !this$tagData.equals(other$tagData)) return false;
        final Object this$deviceData = this.getDeviceData();
        final Object other$deviceData = other.getDeviceData();
        if (this$deviceData == null ? other$deviceData != null : !this$deviceData.equals(other$deviceData))
            return false;
        final Object this$distanceData = this.getDistanceData();
        final Object other$distanceData = other.getDistanceData();
        if (this$distanceData == null ? other$distanceData != null : !this$distanceData.equals(other$distanceData))
            return false;
        final Object this$metData = this.getMetData();
        final Object other$metData = other.getMetData();
        if (this$metData == null ? other$metData != null : !this$metData.equals(other$metData)) return false;
        final Object this$scores = this.getScores();
        final Object other$scores = other.getScores();
        if (this$scores == null ? other$scores != null : !this$scores.equals(other$scores)) return false;
        final Object this$caloriesData = this.getCaloriesData();
        final Object other$caloriesData = other.getCaloriesData();
        if (this$caloriesData == null ? other$caloriesData != null : !this$caloriesData.equals(other$caloriesData))
            return false;
        final Object this$heartRateData = this.getHeartRateData();
        final Object other$heartRateData = other.getHeartRateData();
        if (this$heartRateData == null ? other$heartRateData != null : !this$heartRateData.equals(other$heartRateData))
            return false;
        final Object this$activeDurationsData = this.getActiveDurationsData();
        final Object other$activeDurationsData = other.getActiveDurationsData();
        if (this$activeDurationsData == null ? other$activeDurationsData != null : !this$activeDurationsData.equals(other$activeDurationsData))
            return false;
        final Object this$stressData = this.getStressData();
        final Object other$stressData = other.getStressData();
        if (this$stressData == null ? other$stressData != null : !this$stressData.equals(other$stressData))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Daily;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $metadata = this.getMetadata();
        result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
        final Object $oxygenData = this.getOxygenData();
        result = result * PRIME + ($oxygenData == null ? 43 : $oxygenData.hashCode());
        final Object $tagData = this.getTagData();
        result = result * PRIME + ($tagData == null ? 43 : $tagData.hashCode());
        final Object $deviceData = this.getDeviceData();
        result = result * PRIME + ($deviceData == null ? 43 : $deviceData.hashCode());
        final Object $distanceData = this.getDistanceData();
        result = result * PRIME + ($distanceData == null ? 43 : $distanceData.hashCode());
        final Object $metData = this.getMetData();
        result = result * PRIME + ($metData == null ? 43 : $metData.hashCode());
        final Object $scores = this.getScores();
        result = result * PRIME + ($scores == null ? 43 : $scores.hashCode());
        final Object $caloriesData = this.getCaloriesData();
        result = result * PRIME + ($caloriesData == null ? 43 : $caloriesData.hashCode());
        final Object $heartRateData = this.getHeartRateData();
        result = result * PRIME + ($heartRateData == null ? 43 : $heartRateData.hashCode());
        final Object $activeDurationsData = this.getActiveDurationsData();
        result = result * PRIME + ($activeDurationsData == null ? 43 : $activeDurationsData.hashCode());
        final Object $stressData = this.getStressData();
        result = result * PRIME + ($stressData == null ? 43 : $stressData.hashCode());
        return result;
    }

    public String toString() {
        return "Daily(metadata=" + this.getMetadata() + ", oxygenData=" + this.getOxygenData() + ", tagData=" + this.getTagData() + ", deviceData=" + this.getDeviceData() + ", distanceData=" + this.getDistanceData() + ", metData=" + this.getMetData() + ", scores=" + this.getScores() + ", caloriesData=" + this.getCaloriesData() + ", heartRateData=" + this.getHeartRateData() + ", activeDurationsData=" + this.getActiveDurationsData() + ", stressData=" + this.getStressData() + ")";
    }
}
