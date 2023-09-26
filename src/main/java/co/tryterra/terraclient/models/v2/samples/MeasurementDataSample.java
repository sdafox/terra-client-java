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
public class MeasurementDataSample {
    @JsonProperty("measurement_time")
    private String measurementTime;
    @JsonProperty("BMI")
    private Double bmi;
    @JsonProperty("BMR")
    private Double bmr;
    @JsonProperty("RMR")
    private Double rmr;
    @JsonProperty("estimated_fitness_age")
    private Integer estimatedFitnessAge;
    @JsonProperty("skin_fold_mm")
    private Double skinFoldMm;
    @JsonProperty("bodyfat_percentage")
    private Double bodyfatPercentage;
    @JsonProperty("weight_kg")
    private Double weightKg;
    @JsonProperty("height_cm")
    private Double heightCm;
    @JsonProperty("bone_mass_g")
    private Double boneMassG;
    @JsonProperty("muscle_mass_g")
    private Double muscleMassG;
    @JsonProperty("lean_mass_g")
    private Double leanMassG;
    @JsonProperty("water_percentage")
    private Double waterPercentage;
    @JsonProperty("insulin_units")
    private Double insulinUnits;
    @JsonProperty("insulin_type")
    private String insulinType;
    @JsonProperty("urine_color")
    private String urineColor;

    public MeasurementDataSample() {
    }

    public String getMeasurementTime() {
        return this.measurementTime;
    }

    public Double getBmi() {
        return this.bmi;
    }

    public Double getBmr() {
        return this.bmr;
    }

    public Double getRmr() {
        return this.rmr;
    }

    public Integer getEstimatedFitnessAge() {
        return this.estimatedFitnessAge;
    }

    public Double getSkinFoldMm() {
        return this.skinFoldMm;
    }

    public Double getBodyfatPercentage() {
        return this.bodyfatPercentage;
    }

    public Double getWeightKg() {
        return this.weightKg;
    }

    public Double getHeightCm() {
        return this.heightCm;
    }

    public Double getBoneMassG() {
        return this.boneMassG;
    }

    public Double getMuscleMassG() {
        return this.muscleMassG;
    }

    public Double getLeanMassG() {
        return this.leanMassG;
    }

    public Double getWaterPercentage() {
        return this.waterPercentage;
    }

    public Double getInsulinUnits() {
        return this.insulinUnits;
    }

    public String getInsulinType() {
        return this.insulinType;
    }

    public String getUrineColor() {
        return this.urineColor;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MeasurementDataSample)) return false;
        final MeasurementDataSample other = (MeasurementDataSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$measurementTime = this.getMeasurementTime();
        final Object other$measurementTime = other.getMeasurementTime();
        if (this$measurementTime == null ? other$measurementTime != null : !this$measurementTime.equals(other$measurementTime))
            return false;
        final Object this$bmi = this.getBmi();
        final Object other$bmi = other.getBmi();
        if (this$bmi == null ? other$bmi != null : !this$bmi.equals(other$bmi)) return false;
        final Object this$bmr = this.getBmr();
        final Object other$bmr = other.getBmr();
        if (this$bmr == null ? other$bmr != null : !this$bmr.equals(other$bmr)) return false;
        final Object this$rmr = this.getRmr();
        final Object other$rmr = other.getRmr();
        if (this$rmr == null ? other$rmr != null : !this$rmr.equals(other$rmr)) return false;
        final Object this$estimatedFitnessAge = this.getEstimatedFitnessAge();
        final Object other$estimatedFitnessAge = other.getEstimatedFitnessAge();
        if (this$estimatedFitnessAge == null ? other$estimatedFitnessAge != null : !this$estimatedFitnessAge.equals(other$estimatedFitnessAge))
            return false;
        final Object this$skinFoldMm = this.getSkinFoldMm();
        final Object other$skinFoldMm = other.getSkinFoldMm();
        if (this$skinFoldMm == null ? other$skinFoldMm != null : !this$skinFoldMm.equals(other$skinFoldMm))
            return false;
        final Object this$bodyfatPercentage = this.getBodyfatPercentage();
        final Object other$bodyfatPercentage = other.getBodyfatPercentage();
        if (this$bodyfatPercentage == null ? other$bodyfatPercentage != null : !this$bodyfatPercentage.equals(other$bodyfatPercentage))
            return false;
        final Object this$weightKg = this.getWeightKg();
        final Object other$weightKg = other.getWeightKg();
        if (this$weightKg == null ? other$weightKg != null : !this$weightKg.equals(other$weightKg)) return false;
        final Object this$heightCm = this.getHeightCm();
        final Object other$heightCm = other.getHeightCm();
        if (this$heightCm == null ? other$heightCm != null : !this$heightCm.equals(other$heightCm)) return false;
        final Object this$boneMassG = this.getBoneMassG();
        final Object other$boneMassG = other.getBoneMassG();
        if (this$boneMassG == null ? other$boneMassG != null : !this$boneMassG.equals(other$boneMassG)) return false;
        final Object this$muscleMassG = this.getMuscleMassG();
        final Object other$muscleMassG = other.getMuscleMassG();
        if (this$muscleMassG == null ? other$muscleMassG != null : !this$muscleMassG.equals(other$muscleMassG))
            return false;
        final Object this$leanMassG = this.getLeanMassG();
        final Object other$leanMassG = other.getLeanMassG();
        if (this$leanMassG == null ? other$leanMassG != null : !this$leanMassG.equals(other$leanMassG)) return false;
        final Object this$waterPercentage = this.getWaterPercentage();
        final Object other$waterPercentage = other.getWaterPercentage();
        if (this$waterPercentage == null ? other$waterPercentage != null : !this$waterPercentage.equals(other$waterPercentage))
            return false;
        final Object this$insulinUnits = this.getInsulinUnits();
        final Object other$insulinUnits = other.getInsulinUnits();
        if (this$insulinUnits == null ? other$insulinUnits != null : !this$insulinUnits.equals(other$insulinUnits))
            return false;
        final Object this$insulinType = this.getInsulinType();
        final Object other$insulinType = other.getInsulinType();
        if (this$insulinType == null ? other$insulinType != null : !this$insulinType.equals(other$insulinType))
            return false;
        final Object this$urineColor = this.getUrineColor();
        final Object other$urineColor = other.getUrineColor();
        if (this$urineColor == null ? other$urineColor != null : !this$urineColor.equals(other$urineColor))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MeasurementDataSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $measurementTime = this.getMeasurementTime();
        result = result * PRIME + ($measurementTime == null ? 43 : $measurementTime.hashCode());
        final Object $bmi = this.getBmi();
        result = result * PRIME + ($bmi == null ? 43 : $bmi.hashCode());
        final Object $bmr = this.getBmr();
        result = result * PRIME + ($bmr == null ? 43 : $bmr.hashCode());
        final Object $rmr = this.getRmr();
        result = result * PRIME + ($rmr == null ? 43 : $rmr.hashCode());
        final Object $estimatedFitnessAge = this.getEstimatedFitnessAge();
        result = result * PRIME + ($estimatedFitnessAge == null ? 43 : $estimatedFitnessAge.hashCode());
        final Object $skinFoldMm = this.getSkinFoldMm();
        result = result * PRIME + ($skinFoldMm == null ? 43 : $skinFoldMm.hashCode());
        final Object $bodyfatPercentage = this.getBodyfatPercentage();
        result = result * PRIME + ($bodyfatPercentage == null ? 43 : $bodyfatPercentage.hashCode());
        final Object $weightKg = this.getWeightKg();
        result = result * PRIME + ($weightKg == null ? 43 : $weightKg.hashCode());
        final Object $heightCm = this.getHeightCm();
        result = result * PRIME + ($heightCm == null ? 43 : $heightCm.hashCode());
        final Object $boneMassG = this.getBoneMassG();
        result = result * PRIME + ($boneMassG == null ? 43 : $boneMassG.hashCode());
        final Object $muscleMassG = this.getMuscleMassG();
        result = result * PRIME + ($muscleMassG == null ? 43 : $muscleMassG.hashCode());
        final Object $leanMassG = this.getLeanMassG();
        result = result * PRIME + ($leanMassG == null ? 43 : $leanMassG.hashCode());
        final Object $waterPercentage = this.getWaterPercentage();
        result = result * PRIME + ($waterPercentage == null ? 43 : $waterPercentage.hashCode());
        final Object $insulinUnits = this.getInsulinUnits();
        result = result * PRIME + ($insulinUnits == null ? 43 : $insulinUnits.hashCode());
        final Object $insulinType = this.getInsulinType();
        result = result * PRIME + ($insulinType == null ? 43 : $insulinType.hashCode());
        final Object $urineColor = this.getUrineColor();
        result = result * PRIME + ($urineColor == null ? 43 : $urineColor.hashCode());
        return result;
    }

    public String toString() {
        return "MeasurementDataSample(measurementTime=" + this.getMeasurementTime() + ", bmi=" + this.getBmi() + ", bmr=" + this.getBmr() + ", rmr=" + this.getRmr() + ", estimatedFitnessAge=" + this.getEstimatedFitnessAge() + ", skinFoldMm=" + this.getSkinFoldMm() + ", bodyfatPercentage=" + this.getBodyfatPercentage() + ", weightKg=" + this.getWeightKg() + ", heightCm=" + this.getHeightCm() + ", boneMassG=" + this.getBoneMassG() + ", muscleMassG=" + this.getMuscleMassG() + ", leanMassG=" + this.getLeanMassG() + ", waterPercentage=" + this.getWaterPercentage() + ", insulinUnits=" + this.getInsulinUnits() + ", insulinType=" + this.getInsulinType() + ", urineColor=" + this.getUrineColor() + ")";
    }
}
