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

package co.tryterra.terraclient.models.v2.menstruation;

import co.tryterra.terraclient.models.v2.samples.MenstruationFlowSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MenstruationData {
    @JsonProperty("period_length_days")
    private Integer periodLengthDays;
    @JsonProperty("current_phase")
    private Integer currentPhase;
    @JsonProperty("length_of_current_phase_days")
    private Integer lengthOfCurrentPhaseDays;
    @JsonProperty("days_until_next_phase")
    private Integer daysUntilNextPhase;
    @JsonProperty("period_start_date")
    private String periodStartDate;
    @JsonProperty("predicted_cycle_length_days")
    private Integer predictedCycleLengthDays;
    @JsonProperty("day_in_cycle")
    private Integer dayInCycle;
    @JsonProperty("last_updated_time")
    private String lastUpdatedTime;
    @JsonProperty("cycle_length_days")
    private Integer cycleLengthDays;
    @JsonProperty("is_predicted_cycle")
    private String isPredictedCycle;
    @JsonProperty("menstruation_flow")
    private List<MenstruationFlowSample> menstruationFlow;

    public MenstruationData() {
    }

    public Integer getPeriodLengthDays() {
        return this.periodLengthDays;
    }

    public Integer getCurrentPhase() {
        return this.currentPhase;
    }

    public Integer getLengthOfCurrentPhaseDays() {
        return this.lengthOfCurrentPhaseDays;
    }

    public Integer getDaysUntilNextPhase() {
        return this.daysUntilNextPhase;
    }

    public String getPeriodStartDate() {
        return this.periodStartDate;
    }

    public Integer getPredictedCycleLengthDays() {
        return this.predictedCycleLengthDays;
    }

    public Integer getDayInCycle() {
        return this.dayInCycle;
    }

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    public Integer getCycleLengthDays() {
        return this.cycleLengthDays;
    }

    public String getIsPredictedCycle() {
        return this.isPredictedCycle;
    }

    public List<MenstruationFlowSample> getMenstruationFlow() {
        return this.menstruationFlow;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MenstruationData)) return false;
        final MenstruationData other = (MenstruationData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$periodLengthDays = this.getPeriodLengthDays();
        final Object other$periodLengthDays = other.getPeriodLengthDays();
        if (this$periodLengthDays == null ? other$periodLengthDays != null : !this$periodLengthDays.equals(other$periodLengthDays))
            return false;
        final Object this$currentPhase = this.getCurrentPhase();
        final Object other$currentPhase = other.getCurrentPhase();
        if (this$currentPhase == null ? other$currentPhase != null : !this$currentPhase.equals(other$currentPhase))
            return false;
        final Object this$lengthOfCurrentPhaseDays = this.getLengthOfCurrentPhaseDays();
        final Object other$lengthOfCurrentPhaseDays = other.getLengthOfCurrentPhaseDays();
        if (this$lengthOfCurrentPhaseDays == null ? other$lengthOfCurrentPhaseDays != null : !this$lengthOfCurrentPhaseDays.equals(other$lengthOfCurrentPhaseDays))
            return false;
        final Object this$daysUntilNextPhase = this.getDaysUntilNextPhase();
        final Object other$daysUntilNextPhase = other.getDaysUntilNextPhase();
        if (this$daysUntilNextPhase == null ? other$daysUntilNextPhase != null : !this$daysUntilNextPhase.equals(other$daysUntilNextPhase))
            return false;
        final Object this$periodStartDate = this.getPeriodStartDate();
        final Object other$periodStartDate = other.getPeriodStartDate();
        if (this$periodStartDate == null ? other$periodStartDate != null : !this$periodStartDate.equals(other$periodStartDate))
            return false;
        final Object this$predictedCycleLengthDays = this.getPredictedCycleLengthDays();
        final Object other$predictedCycleLengthDays = other.getPredictedCycleLengthDays();
        if (this$predictedCycleLengthDays == null ? other$predictedCycleLengthDays != null : !this$predictedCycleLengthDays.equals(other$predictedCycleLengthDays))
            return false;
        final Object this$dayInCycle = this.getDayInCycle();
        final Object other$dayInCycle = other.getDayInCycle();
        if (this$dayInCycle == null ? other$dayInCycle != null : !this$dayInCycle.equals(other$dayInCycle))
            return false;
        final Object this$lastUpdatedTime = this.getLastUpdatedTime();
        final Object other$lastUpdatedTime = other.getLastUpdatedTime();
        if (this$lastUpdatedTime == null ? other$lastUpdatedTime != null : !this$lastUpdatedTime.equals(other$lastUpdatedTime))
            return false;
        final Object this$cycleLengthDays = this.getCycleLengthDays();
        final Object other$cycleLengthDays = other.getCycleLengthDays();
        if (this$cycleLengthDays == null ? other$cycleLengthDays != null : !this$cycleLengthDays.equals(other$cycleLengthDays))
            return false;
        final Object this$isPredictedCycle = this.getIsPredictedCycle();
        final Object other$isPredictedCycle = other.getIsPredictedCycle();
        if (this$isPredictedCycle == null ? other$isPredictedCycle != null : !this$isPredictedCycle.equals(other$isPredictedCycle))
            return false;
        final Object this$menstruationFlow = this.getMenstruationFlow();
        final Object other$menstruationFlow = other.getMenstruationFlow();
        if (this$menstruationFlow == null ? other$menstruationFlow != null : !this$menstruationFlow.equals(other$menstruationFlow))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenstruationData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $periodLengthDays = this.getPeriodLengthDays();
        result = result * PRIME + ($periodLengthDays == null ? 43 : $periodLengthDays.hashCode());
        final Object $currentPhase = this.getCurrentPhase();
        result = result * PRIME + ($currentPhase == null ? 43 : $currentPhase.hashCode());
        final Object $lengthOfCurrentPhaseDays = this.getLengthOfCurrentPhaseDays();
        result = result * PRIME + ($lengthOfCurrentPhaseDays == null ? 43 : $lengthOfCurrentPhaseDays.hashCode());
        final Object $daysUntilNextPhase = this.getDaysUntilNextPhase();
        result = result * PRIME + ($daysUntilNextPhase == null ? 43 : $daysUntilNextPhase.hashCode());
        final Object $periodStartDate = this.getPeriodStartDate();
        result = result * PRIME + ($periodStartDate == null ? 43 : $periodStartDate.hashCode());
        final Object $predictedCycleLengthDays = this.getPredictedCycleLengthDays();
        result = result * PRIME + ($predictedCycleLengthDays == null ? 43 : $predictedCycleLengthDays.hashCode());
        final Object $dayInCycle = this.getDayInCycle();
        result = result * PRIME + ($dayInCycle == null ? 43 : $dayInCycle.hashCode());
        final Object $lastUpdatedTime = this.getLastUpdatedTime();
        result = result * PRIME + ($lastUpdatedTime == null ? 43 : $lastUpdatedTime.hashCode());
        final Object $cycleLengthDays = this.getCycleLengthDays();
        result = result * PRIME + ($cycleLengthDays == null ? 43 : $cycleLengthDays.hashCode());
        final Object $isPredictedCycle = this.getIsPredictedCycle();
        result = result * PRIME + ($isPredictedCycle == null ? 43 : $isPredictedCycle.hashCode());
        final Object $menstruationFlow = this.getMenstruationFlow();
        result = result * PRIME + ($menstruationFlow == null ? 43 : $menstruationFlow.hashCode());
        return result;
    }

    public String toString() {
        return "MenstruationData(periodLengthDays=" + this.getPeriodLengthDays() + ", currentPhase=" + this.getCurrentPhase() + ", lengthOfCurrentPhaseDays=" + this.getLengthOfCurrentPhaseDays() + ", daysUntilNextPhase=" + this.getDaysUntilNextPhase() + ", periodStartDate=" + this.getPeriodStartDate() + ", predictedCycleLengthDays=" + this.getPredictedCycleLengthDays() + ", dayInCycle=" + this.getDayInCycle() + ", lastUpdatedTime=" + this.getLastUpdatedTime() + ", cycleLengthDays=" + this.getCycleLengthDays() + ", isPredictedCycle=" + this.getIsPredictedCycle() + ", menstruationFlow=" + this.getMenstruationFlow() + ")";
    }
}
