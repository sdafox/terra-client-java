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

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ECGReading {
    private String timestamp;
    @JsonProperty("avg_hr_bpm")
    private Double avgHrBpm;
    @JsonProperty("afib_classification")
    private Integer afibClassification;
    @JsonProperty("raw_signal")
    private List<RawECGSample> rawSignal;

    public ECGReading() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Double getAvgHrBpm() {
        return this.avgHrBpm;
    }

    public Integer getAfibClassification() {
        return this.afibClassification;
    }

    public List<RawECGSample> getRawSignal() {
        return this.rawSignal;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ECGReading)) return false;
        final ECGReading other = (ECGReading) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$avgHrBpm = this.getAvgHrBpm();
        final Object other$avgHrBpm = other.getAvgHrBpm();
        if (this$avgHrBpm == null ? other$avgHrBpm != null : !this$avgHrBpm.equals(other$avgHrBpm)) return false;
        final Object this$afibClassification = this.getAfibClassification();
        final Object other$afibClassification = other.getAfibClassification();
        if (this$afibClassification == null ? other$afibClassification != null : !this$afibClassification.equals(other$afibClassification))
            return false;
        final Object this$rawSignal = this.getRawSignal();
        final Object other$rawSignal = other.getRawSignal();
        if (this$rawSignal == null ? other$rawSignal != null : !this$rawSignal.equals(other$rawSignal)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ECGReading;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $avgHrBpm = this.getAvgHrBpm();
        result = result * PRIME + ($avgHrBpm == null ? 43 : $avgHrBpm.hashCode());
        final Object $afibClassification = this.getAfibClassification();
        result = result * PRIME + ($afibClassification == null ? 43 : $afibClassification.hashCode());
        final Object $rawSignal = this.getRawSignal();
        result = result * PRIME + ($rawSignal == null ? 43 : $rawSignal.hashCode());
        return result;
    }

    public String toString() {
        return "ECGReading(timestamp=" + this.getTimestamp() + ", avgHrBpm=" + this.getAvgHrBpm() + ", afibClassification=" + this.getAfibClassification() + ", rawSignal=" + this.getRawSignal() + ")";
    }
}
