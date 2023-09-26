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
public class HeartRateZoneData {
    private Integer zone;
    @JsonProperty("start_percentage")
    private Double startPercentage;
    @JsonProperty("end_percentage")
    private Double endPercentage;
    private String name;
    @JsonProperty("duration_seconds")
    private Double durationSeconds;

    public HeartRateZoneData() {
    }

    public Integer getZone() {
        return this.zone;
    }

    public Double getStartPercentage() {
        return this.startPercentage;
    }

    public Double getEndPercentage() {
        return this.endPercentage;
    }

    public String getName() {
        return this.name;
    }

    public Double getDurationSeconds() {
        return this.durationSeconds;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HeartRateZoneData)) return false;
        final HeartRateZoneData other = (HeartRateZoneData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$zone = this.getZone();
        final Object other$zone = other.getZone();
        if (this$zone == null ? other$zone != null : !this$zone.equals(other$zone)) return false;
        final Object this$startPercentage = this.getStartPercentage();
        final Object other$startPercentage = other.getStartPercentage();
        if (this$startPercentage == null ? other$startPercentage != null : !this$startPercentage.equals(other$startPercentage))
            return false;
        final Object this$endPercentage = this.getEndPercentage();
        final Object other$endPercentage = other.getEndPercentage();
        if (this$endPercentage == null ? other$endPercentage != null : !this$endPercentage.equals(other$endPercentage))
            return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$durationSeconds = this.getDurationSeconds();
        final Object other$durationSeconds = other.getDurationSeconds();
        if (this$durationSeconds == null ? other$durationSeconds != null : !this$durationSeconds.equals(other$durationSeconds))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HeartRateZoneData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $zone = this.getZone();
        result = result * PRIME + ($zone == null ? 43 : $zone.hashCode());
        final Object $startPercentage = this.getStartPercentage();
        result = result * PRIME + ($startPercentage == null ? 43 : $startPercentage.hashCode());
        final Object $endPercentage = this.getEndPercentage();
        result = result * PRIME + ($endPercentage == null ? 43 : $endPercentage.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $durationSeconds = this.getDurationSeconds();
        result = result * PRIME + ($durationSeconds == null ? 43 : $durationSeconds.hashCode());
        return result;
    }

    public String toString() {
        return "HeartRateZoneData(zone=" + this.getZone() + ", startPercentage=" + this.getStartPercentage() + ", endPercentage=" + this.getEndPercentage() + ", name=" + this.getName() + ", durationSeconds=" + this.getDurationSeconds() + ")";
    }
}
