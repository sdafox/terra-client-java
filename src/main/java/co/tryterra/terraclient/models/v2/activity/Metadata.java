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
public class Metadata {
    private String name;
    @JsonProperty("summary_id")
    private String summaryId;
    private String country;
    private String state;
    @JsonProperty("upload_type")
    private int uploadType;
    @JsonProperty("end_time")
    private String endTime;
    @JsonProperty("start_time")
    private String startTime;
    private int type;
    private String city;

    public Metadata() {
    }

    public String getName() {
        return this.name;
    }

    public String getSummaryId() {
        return this.summaryId;
    }

    public String getCountry() {
        return this.country;
    }

    public String getState() {
        return this.state;
    }

    public int getUploadType() {
        return this.uploadType;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public int getType() {
        return this.type;
    }

    public String getCity() {
        return this.city;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Metadata)) return false;
        final Metadata other = (Metadata) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$summaryId = this.getSummaryId();
        final Object other$summaryId = other.getSummaryId();
        if (this$summaryId == null ? other$summaryId != null : !this$summaryId.equals(other$summaryId)) return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        if (this.getUploadType() != other.getUploadType()) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
        if (this.getType() != other.getType()) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Metadata;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $summaryId = this.getSummaryId();
        result = result * PRIME + ($summaryId == null ? 43 : $summaryId.hashCode());
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        result = result * PRIME + this.getUploadType();
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        result = result * PRIME + this.getType();
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        return result;
    }

    public String toString() {
        return "Metadata(name=" + this.getName() + ", summaryId=" + this.getSummaryId() + ", country=" + this.getCountry() + ", state=" + this.getState() + ", uploadType=" + this.getUploadType() + ", endTime=" + this.getEndTime() + ", startTime=" + this.getStartTime() + ", type=" + this.getType() + ", city=" + this.getCity() + ")";
    }
}
