
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
public class RRIntervalSample {
    private String timestamp;
    @JsonProperty("rr_interval_ms")
    private Integer RRInterval;
    @JsonProperty("hr_bpm")
    private Integer HrBpm;

    public RRIntervalSample() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Integer getRRInterval() {
        return this.RRInterval;
    }

    public Integer getHrBpm() {
        return this.HrBpm;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RRIntervalSample)) return false;
        final RRIntervalSample other = (RRIntervalSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$RRInterval = this.getRRInterval();
        final Object other$RRInterval = other.getRRInterval();
        if (this$RRInterval == null ? other$RRInterval != null : !this$RRInterval.equals(other$RRInterval))
            return false;
        final Object this$HrBpm = this.getHrBpm();
        final Object other$HrBpm = other.getHrBpm();
        if (this$HrBpm == null ? other$HrBpm != null : !this$HrBpm.equals(other$HrBpm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RRIntervalSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $RRInterval = this.getRRInterval();
        result = result * PRIME + ($RRInterval == null ? 43 : $RRInterval.hashCode());
        final Object $HrBpm = this.getHrBpm();
        result = result * PRIME + ($HrBpm == null ? 43 : $HrBpm.hashCode());
        return result;
    }

    public String toString() {
        return "RRIntervalSample(timestamp=" + this.getTimestamp() + ", RRInterval=" + this.getRRInterval() + ", HrBpm=" + this.getHrBpm() + ")";
    }
}
