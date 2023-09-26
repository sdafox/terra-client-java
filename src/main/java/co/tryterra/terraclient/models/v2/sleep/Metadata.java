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

package co.tryterra.terraclient.models.v2.sleep;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;
    @JsonProperty("upload_type")
    private int uploadType;

    public Metadata() {
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public int getUploadType() {
        return this.uploadType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Metadata)) return false;
        final Metadata other = (Metadata) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        if (this.getUploadType() != other.getUploadType()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Metadata;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        result = result * PRIME + this.getUploadType();
        return result;
    }

    public String toString() {
        return "Metadata(startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", uploadType=" + this.getUploadType() + ")";
    }
}
