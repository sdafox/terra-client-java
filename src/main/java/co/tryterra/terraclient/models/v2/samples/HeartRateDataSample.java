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

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeartRateDataSample {
    private String timestamp;
    private Double bpm;

    public HeartRateDataSample() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Double getBpm() {
        return this.bpm;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HeartRateDataSample)) return false;
        final HeartRateDataSample other = (HeartRateDataSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$bpm = this.getBpm();
        final Object other$bpm = other.getBpm();
        if (this$bpm == null ? other$bpm != null : !this$bpm.equals(other$bpm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HeartRateDataSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $bpm = this.getBpm();
        result = result * PRIME + ($bpm == null ? 43 : $bpm.hashCode());
        return result;
    }

    public String toString() {
        return "HeartRateDataSample(timestamp=" + this.getTimestamp() + ", bpm=" + this.getBpm() + ")";
    }
}
