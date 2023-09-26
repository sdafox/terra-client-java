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

package co.tryterra.terraclient.models.v2.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Micros {
    @JsonProperty("selenium_mg")
    private Double seleniumMg;
    @JsonProperty("niacin_mg")
    private Double niacinMg;
    @JsonProperty("magnesium_mg")
    private Double magnesiumMg;
    @JsonProperty("copper_mg")
    private Double copperMg;
    @JsonProperty("vitamin_B12_mg")
    private Double vitaminB12Mg;
    @JsonProperty("vitamin_B6_mg")
    private Double vitaminB6Mg;
    @JsonProperty("vitamin_C_mg")
    private Double vitaminCMg;
    @JsonProperty("zinc_mg")
    private Double zincMg;
    @JsonProperty("vitamin_E_mg")
    private Double vitaminEMg;
    @JsonProperty("manganese_mg")
    private Double manganeseMg;
    @JsonProperty("vitamin_D_mg")
    private Double vitaminDMg;
    @JsonProperty("iodine_mg")
    private Double iodineMg;
    @JsonProperty("chloride_mg")
    private Double chlorideMg;
    @JsonProperty("folate_mg")
    private Double folateMg;
    @JsonProperty("calcium_mg")
    private Double calciumMg;
    @JsonProperty("molybdenum_mg")
    private Double molybdenumMg;
    @JsonProperty("vitamin_A_mg")
    private Double vitaminAMg;
    @JsonProperty("riboflavin_mg")
    private Double riboflavinMg;
    @JsonProperty("folic_acid_mg")
    private Double folicAcidMg;
    @JsonProperty("iron_mg")
    private Double ironMg;
    @JsonProperty("thiamin_mg")
    private Double thiaminMg;
    @JsonProperty("pantothenic_acid_mg")
    private Double pantothenicAcid_mg;
    @JsonProperty("caffeine_mg")
    private Double caffeineMg;
    @JsonProperty("vitamin_K_mg")
    private Double vitaminKMg;
    @JsonProperty("chromium_mg")
    private Double chromiumMg;
    @JsonProperty("potassium_mg")
    private Double potassiumMg;
    @JsonProperty("biotin_mg")
    private Double biotinMg;
    @JsonProperty("phosphorus_mg")
    private Double phosphorusMg;

    public Micros() {
    }

    public Double getSeleniumMg() {
        return this.seleniumMg;
    }

    public Double getNiacinMg() {
        return this.niacinMg;
    }

    public Double getMagnesiumMg() {
        return this.magnesiumMg;
    }

    public Double getCopperMg() {
        return this.copperMg;
    }

    public Double getVitaminB12Mg() {
        return this.vitaminB12Mg;
    }

    public Double getVitaminB6Mg() {
        return this.vitaminB6Mg;
    }

    public Double getVitaminCMg() {
        return this.vitaminCMg;
    }

    public Double getZincMg() {
        return this.zincMg;
    }

    public Double getVitaminEMg() {
        return this.vitaminEMg;
    }

    public Double getManganeseMg() {
        return this.manganeseMg;
    }

    public Double getVitaminDMg() {
        return this.vitaminDMg;
    }

    public Double getIodineMg() {
        return this.iodineMg;
    }

    public Double getChlorideMg() {
        return this.chlorideMg;
    }

    public Double getFolateMg() {
        return this.folateMg;
    }

    public Double getCalciumMg() {
        return this.calciumMg;
    }

    public Double getMolybdenumMg() {
        return this.molybdenumMg;
    }

    public Double getVitaminAMg() {
        return this.vitaminAMg;
    }

    public Double getRiboflavinMg() {
        return this.riboflavinMg;
    }

    public Double getFolicAcidMg() {
        return this.folicAcidMg;
    }

    public Double getIronMg() {
        return this.ironMg;
    }

    public Double getThiaminMg() {
        return this.thiaminMg;
    }

    public Double getPantothenicAcid_mg() {
        return this.pantothenicAcid_mg;
    }

    public Double getCaffeineMg() {
        return this.caffeineMg;
    }

    public Double getVitaminKMg() {
        return this.vitaminKMg;
    }

    public Double getChromiumMg() {
        return this.chromiumMg;
    }

    public Double getPotassiumMg() {
        return this.potassiumMg;
    }

    public Double getBiotinMg() {
        return this.biotinMg;
    }

    public Double getPhosphorusMg() {
        return this.phosphorusMg;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Micros)) return false;
        final Micros other = (Micros) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$seleniumMg = this.getSeleniumMg();
        final Object other$seleniumMg = other.getSeleniumMg();
        if (this$seleniumMg == null ? other$seleniumMg != null : !this$seleniumMg.equals(other$seleniumMg))
            return false;
        final Object this$niacinMg = this.getNiacinMg();
        final Object other$niacinMg = other.getNiacinMg();
        if (this$niacinMg == null ? other$niacinMg != null : !this$niacinMg.equals(other$niacinMg)) return false;
        final Object this$magnesiumMg = this.getMagnesiumMg();
        final Object other$magnesiumMg = other.getMagnesiumMg();
        if (this$magnesiumMg == null ? other$magnesiumMg != null : !this$magnesiumMg.equals(other$magnesiumMg))
            return false;
        final Object this$copperMg = this.getCopperMg();
        final Object other$copperMg = other.getCopperMg();
        if (this$copperMg == null ? other$copperMg != null : !this$copperMg.equals(other$copperMg)) return false;
        final Object this$vitaminB12Mg = this.getVitaminB12Mg();
        final Object other$vitaminB12Mg = other.getVitaminB12Mg();
        if (this$vitaminB12Mg == null ? other$vitaminB12Mg != null : !this$vitaminB12Mg.equals(other$vitaminB12Mg))
            return false;
        final Object this$vitaminB6Mg = this.getVitaminB6Mg();
        final Object other$vitaminB6Mg = other.getVitaminB6Mg();
        if (this$vitaminB6Mg == null ? other$vitaminB6Mg != null : !this$vitaminB6Mg.equals(other$vitaminB6Mg))
            return false;
        final Object this$vitaminCMg = this.getVitaminCMg();
        final Object other$vitaminCMg = other.getVitaminCMg();
        if (this$vitaminCMg == null ? other$vitaminCMg != null : !this$vitaminCMg.equals(other$vitaminCMg))
            return false;
        final Object this$zincMg = this.getZincMg();
        final Object other$zincMg = other.getZincMg();
        if (this$zincMg == null ? other$zincMg != null : !this$zincMg.equals(other$zincMg)) return false;
        final Object this$vitaminEMg = this.getVitaminEMg();
        final Object other$vitaminEMg = other.getVitaminEMg();
        if (this$vitaminEMg == null ? other$vitaminEMg != null : !this$vitaminEMg.equals(other$vitaminEMg))
            return false;
        final Object this$manganeseMg = this.getManganeseMg();
        final Object other$manganeseMg = other.getManganeseMg();
        if (this$manganeseMg == null ? other$manganeseMg != null : !this$manganeseMg.equals(other$manganeseMg))
            return false;
        final Object this$vitaminDMg = this.getVitaminDMg();
        final Object other$vitaminDMg = other.getVitaminDMg();
        if (this$vitaminDMg == null ? other$vitaminDMg != null : !this$vitaminDMg.equals(other$vitaminDMg))
            return false;
        final Object this$iodineMg = this.getIodineMg();
        final Object other$iodineMg = other.getIodineMg();
        if (this$iodineMg == null ? other$iodineMg != null : !this$iodineMg.equals(other$iodineMg)) return false;
        final Object this$chlorideMg = this.getChlorideMg();
        final Object other$chlorideMg = other.getChlorideMg();
        if (this$chlorideMg == null ? other$chlorideMg != null : !this$chlorideMg.equals(other$chlorideMg))
            return false;
        final Object this$folateMg = this.getFolateMg();
        final Object other$folateMg = other.getFolateMg();
        if (this$folateMg == null ? other$folateMg != null : !this$folateMg.equals(other$folateMg)) return false;
        final Object this$calciumMg = this.getCalciumMg();
        final Object other$calciumMg = other.getCalciumMg();
        if (this$calciumMg == null ? other$calciumMg != null : !this$calciumMg.equals(other$calciumMg)) return false;
        final Object this$molybdenumMg = this.getMolybdenumMg();
        final Object other$molybdenumMg = other.getMolybdenumMg();
        if (this$molybdenumMg == null ? other$molybdenumMg != null : !this$molybdenumMg.equals(other$molybdenumMg))
            return false;
        final Object this$vitaminAMg = this.getVitaminAMg();
        final Object other$vitaminAMg = other.getVitaminAMg();
        if (this$vitaminAMg == null ? other$vitaminAMg != null : !this$vitaminAMg.equals(other$vitaminAMg))
            return false;
        final Object this$riboflavinMg = this.getRiboflavinMg();
        final Object other$riboflavinMg = other.getRiboflavinMg();
        if (this$riboflavinMg == null ? other$riboflavinMg != null : !this$riboflavinMg.equals(other$riboflavinMg))
            return false;
        final Object this$folicAcidMg = this.getFolicAcidMg();
        final Object other$folicAcidMg = other.getFolicAcidMg();
        if (this$folicAcidMg == null ? other$folicAcidMg != null : !this$folicAcidMg.equals(other$folicAcidMg))
            return false;
        final Object this$ironMg = this.getIronMg();
        final Object other$ironMg = other.getIronMg();
        if (this$ironMg == null ? other$ironMg != null : !this$ironMg.equals(other$ironMg)) return false;
        final Object this$thiaminMg = this.getThiaminMg();
        final Object other$thiaminMg = other.getThiaminMg();
        if (this$thiaminMg == null ? other$thiaminMg != null : !this$thiaminMg.equals(other$thiaminMg)) return false;
        final Object this$pantothenicAcid_mg = this.getPantothenicAcid_mg();
        final Object other$pantothenicAcid_mg = other.getPantothenicAcid_mg();
        if (this$pantothenicAcid_mg == null ? other$pantothenicAcid_mg != null : !this$pantothenicAcid_mg.equals(other$pantothenicAcid_mg))
            return false;
        final Object this$caffeineMg = this.getCaffeineMg();
        final Object other$caffeineMg = other.getCaffeineMg();
        if (this$caffeineMg == null ? other$caffeineMg != null : !this$caffeineMg.equals(other$caffeineMg))
            return false;
        final Object this$vitaminKMg = this.getVitaminKMg();
        final Object other$vitaminKMg = other.getVitaminKMg();
        if (this$vitaminKMg == null ? other$vitaminKMg != null : !this$vitaminKMg.equals(other$vitaminKMg))
            return false;
        final Object this$chromiumMg = this.getChromiumMg();
        final Object other$chromiumMg = other.getChromiumMg();
        if (this$chromiumMg == null ? other$chromiumMg != null : !this$chromiumMg.equals(other$chromiumMg))
            return false;
        final Object this$potassiumMg = this.getPotassiumMg();
        final Object other$potassiumMg = other.getPotassiumMg();
        if (this$potassiumMg == null ? other$potassiumMg != null : !this$potassiumMg.equals(other$potassiumMg))
            return false;
        final Object this$biotinMg = this.getBiotinMg();
        final Object other$biotinMg = other.getBiotinMg();
        if (this$biotinMg == null ? other$biotinMg != null : !this$biotinMg.equals(other$biotinMg)) return false;
        final Object this$phosphorusMg = this.getPhosphorusMg();
        final Object other$phosphorusMg = other.getPhosphorusMg();
        if (this$phosphorusMg == null ? other$phosphorusMg != null : !this$phosphorusMg.equals(other$phosphorusMg))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Micros;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $seleniumMg = this.getSeleniumMg();
        result = result * PRIME + ($seleniumMg == null ? 43 : $seleniumMg.hashCode());
        final Object $niacinMg = this.getNiacinMg();
        result = result * PRIME + ($niacinMg == null ? 43 : $niacinMg.hashCode());
        final Object $magnesiumMg = this.getMagnesiumMg();
        result = result * PRIME + ($magnesiumMg == null ? 43 : $magnesiumMg.hashCode());
        final Object $copperMg = this.getCopperMg();
        result = result * PRIME + ($copperMg == null ? 43 : $copperMg.hashCode());
        final Object $vitaminB12Mg = this.getVitaminB12Mg();
        result = result * PRIME + ($vitaminB12Mg == null ? 43 : $vitaminB12Mg.hashCode());
        final Object $vitaminB6Mg = this.getVitaminB6Mg();
        result = result * PRIME + ($vitaminB6Mg == null ? 43 : $vitaminB6Mg.hashCode());
        final Object $vitaminCMg = this.getVitaminCMg();
        result = result * PRIME + ($vitaminCMg == null ? 43 : $vitaminCMg.hashCode());
        final Object $zincMg = this.getZincMg();
        result = result * PRIME + ($zincMg == null ? 43 : $zincMg.hashCode());
        final Object $vitaminEMg = this.getVitaminEMg();
        result = result * PRIME + ($vitaminEMg == null ? 43 : $vitaminEMg.hashCode());
        final Object $manganeseMg = this.getManganeseMg();
        result = result * PRIME + ($manganeseMg == null ? 43 : $manganeseMg.hashCode());
        final Object $vitaminDMg = this.getVitaminDMg();
        result = result * PRIME + ($vitaminDMg == null ? 43 : $vitaminDMg.hashCode());
        final Object $iodineMg = this.getIodineMg();
        result = result * PRIME + ($iodineMg == null ? 43 : $iodineMg.hashCode());
        final Object $chlorideMg = this.getChlorideMg();
        result = result * PRIME + ($chlorideMg == null ? 43 : $chlorideMg.hashCode());
        final Object $folateMg = this.getFolateMg();
        result = result * PRIME + ($folateMg == null ? 43 : $folateMg.hashCode());
        final Object $calciumMg = this.getCalciumMg();
        result = result * PRIME + ($calciumMg == null ? 43 : $calciumMg.hashCode());
        final Object $molybdenumMg = this.getMolybdenumMg();
        result = result * PRIME + ($molybdenumMg == null ? 43 : $molybdenumMg.hashCode());
        final Object $vitaminAMg = this.getVitaminAMg();
        result = result * PRIME + ($vitaminAMg == null ? 43 : $vitaminAMg.hashCode());
        final Object $riboflavinMg = this.getRiboflavinMg();
        result = result * PRIME + ($riboflavinMg == null ? 43 : $riboflavinMg.hashCode());
        final Object $folicAcidMg = this.getFolicAcidMg();
        result = result * PRIME + ($folicAcidMg == null ? 43 : $folicAcidMg.hashCode());
        final Object $ironMg = this.getIronMg();
        result = result * PRIME + ($ironMg == null ? 43 : $ironMg.hashCode());
        final Object $thiaminMg = this.getThiaminMg();
        result = result * PRIME + ($thiaminMg == null ? 43 : $thiaminMg.hashCode());
        final Object $pantothenicAcid_mg = this.getPantothenicAcid_mg();
        result = result * PRIME + ($pantothenicAcid_mg == null ? 43 : $pantothenicAcid_mg.hashCode());
        final Object $caffeineMg = this.getCaffeineMg();
        result = result * PRIME + ($caffeineMg == null ? 43 : $caffeineMg.hashCode());
        final Object $vitaminKMg = this.getVitaminKMg();
        result = result * PRIME + ($vitaminKMg == null ? 43 : $vitaminKMg.hashCode());
        final Object $chromiumMg = this.getChromiumMg();
        result = result * PRIME + ($chromiumMg == null ? 43 : $chromiumMg.hashCode());
        final Object $potassiumMg = this.getPotassiumMg();
        result = result * PRIME + ($potassiumMg == null ? 43 : $potassiumMg.hashCode());
        final Object $biotinMg = this.getBiotinMg();
        result = result * PRIME + ($biotinMg == null ? 43 : $biotinMg.hashCode());
        final Object $phosphorusMg = this.getPhosphorusMg();
        result = result * PRIME + ($phosphorusMg == null ? 43 : $phosphorusMg.hashCode());
        return result;
    }

    public String toString() {
        return "Micros(seleniumMg=" + this.getSeleniumMg() + ", niacinMg=" + this.getNiacinMg() + ", magnesiumMg=" + this.getMagnesiumMg() + ", copperMg=" + this.getCopperMg() + ", vitaminB12Mg=" + this.getVitaminB12Mg() + ", vitaminB6Mg=" + this.getVitaminB6Mg() + ", vitaminCMg=" + this.getVitaminCMg() + ", zincMg=" + this.getZincMg() + ", vitaminEMg=" + this.getVitaminEMg() + ", manganeseMg=" + this.getManganeseMg() + ", vitaminDMg=" + this.getVitaminDMg() + ", iodineMg=" + this.getIodineMg() + ", chlorideMg=" + this.getChlorideMg() + ", folateMg=" + this.getFolateMg() + ", calciumMg=" + this.getCalciumMg() + ", molybdenumMg=" + this.getMolybdenumMg() + ", vitaminAMg=" + this.getVitaminAMg() + ", riboflavinMg=" + this.getRiboflavinMg() + ", folicAcidMg=" + this.getFolicAcidMg() + ", ironMg=" + this.getIronMg() + ", thiaminMg=" + this.getThiaminMg() + ", pantothenicAcid_mg=" + this.getPantothenicAcid_mg() + ", caffeineMg=" + this.getCaffeineMg() + ", vitaminKMg=" + this.getVitaminKMg() + ", chromiumMg=" + this.getChromiumMg() + ", potassiumMg=" + this.getPotassiumMg() + ", biotinMg=" + this.getBiotinMg() + ", phosphorusMg=" + this.getPhosphorusMg() + ")";
    }
}
