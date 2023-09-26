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

package co.tryterra.terraclient.models.v2.body;

import co.tryterra.terraclient.models.v2.common.HeartRateData;
import co.tryterra.terraclient.models.v2.samples.AfibClassificationSample;
import co.tryterra.terraclient.models.v2.samples.ECGReading;
import co.tryterra.terraclient.models.v2.samples.PulseVelocitySample;
import co.tryterra.terraclient.models.v2.samples.RRIntervalSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeartData {
    @JsonProperty("heart_rate_data")
    private HeartRateData heartRateData;
    @JsonProperty("afib_classification_samples")
    private List<AfibClassificationSample> afibClassificationSamples;
    @JsonProperty("pulse_wave_velocity_samples")
    private List<PulseVelocitySample> pulseWaveVelocitySamples;
    @JsonProperty("rr_interval_samples")
    private List<RRIntervalSample> rrIntervalSamples; 
    @JsonProperty("ecg_signal")
    private List<ECGReading> ecgSignal;

    public HeartData() {
    }

    public HeartRateData getHeartRateData() {
        return this.heartRateData;
    }

    public List<AfibClassificationSample> getAfibClassificationSamples() {
        return this.afibClassificationSamples;
    }

    public List<PulseVelocitySample> getPulseWaveVelocitySamples() {
        return this.pulseWaveVelocitySamples;
    }

    public List<RRIntervalSample> getRrIntervalSamples() {
        return this.rrIntervalSamples;
    }

    public List<ECGReading> getEcgSignal() {
        return this.ecgSignal;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HeartData)) return false;
        final HeartData other = (HeartData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$heartRateData = this.getHeartRateData();
        final Object other$heartRateData = other.getHeartRateData();
        if (this$heartRateData == null ? other$heartRateData != null : !this$heartRateData.equals(other$heartRateData))
            return false;
        final Object this$afibClassificationSamples = this.getAfibClassificationSamples();
        final Object other$afibClassificationSamples = other.getAfibClassificationSamples();
        if (this$afibClassificationSamples == null ? other$afibClassificationSamples != null : !this$afibClassificationSamples.equals(other$afibClassificationSamples))
            return false;
        final Object this$pulseWaveVelocitySamples = this.getPulseWaveVelocitySamples();
        final Object other$pulseWaveVelocitySamples = other.getPulseWaveVelocitySamples();
        if (this$pulseWaveVelocitySamples == null ? other$pulseWaveVelocitySamples != null : !this$pulseWaveVelocitySamples.equals(other$pulseWaveVelocitySamples))
            return false;
        final Object this$rrIntervalSamples = this.getRrIntervalSamples();
        final Object other$rrIntervalSamples = other.getRrIntervalSamples();
        if (this$rrIntervalSamples == null ? other$rrIntervalSamples != null : !this$rrIntervalSamples.equals(other$rrIntervalSamples))
            return false;
        final Object this$ecgSignal = this.getEcgSignal();
        final Object other$ecgSignal = other.getEcgSignal();
        if (this$ecgSignal == null ? other$ecgSignal != null : !this$ecgSignal.equals(other$ecgSignal)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HeartData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $heartRateData = this.getHeartRateData();
        result = result * PRIME + ($heartRateData == null ? 43 : $heartRateData.hashCode());
        final Object $afibClassificationSamples = this.getAfibClassificationSamples();
        result = result * PRIME + ($afibClassificationSamples == null ? 43 : $afibClassificationSamples.hashCode());
        final Object $pulseWaveVelocitySamples = this.getPulseWaveVelocitySamples();
        result = result * PRIME + ($pulseWaveVelocitySamples == null ? 43 : $pulseWaveVelocitySamples.hashCode());
        final Object $rrIntervalSamples = this.getRrIntervalSamples();
        result = result * PRIME + ($rrIntervalSamples == null ? 43 : $rrIntervalSamples.hashCode());
        final Object $ecgSignal = this.getEcgSignal();
        result = result * PRIME + ($ecgSignal == null ? 43 : $ecgSignal.hashCode());
        return result;
    }

    public String toString() {
        return "HeartData(heartRateData=" + this.getHeartRateData() + ", afibClassificationSamples=" + this.getAfibClassificationSamples() + ", pulseWaveVelocitySamples=" + this.getPulseWaveVelocitySamples() + ", rrIntervalSamples=" + this.getRrIntervalSamples() + ", ecgSignal=" + this.getEcgSignal() + ")";
    }
}
