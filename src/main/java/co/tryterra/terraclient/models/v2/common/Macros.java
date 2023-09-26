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
public class Macros {
    private Double calories;
    @JsonProperty("protein_g")
    private Double proteinG;
    @JsonProperty("carbohydrates_g")
    private Double carbohydratesG;
    @JsonProperty("trans_fat_g")
    private Double transFatG;
    @JsonProperty("fat_g")
    private Double fatG;
    @JsonProperty("sugar_g")
    private Double sugarG;
    @JsonProperty("cholesterol_mg")
    private Double cholesterolMg;
    @JsonProperty("fiber_g")
    private Double fiberG;
    @JsonProperty("sodium_mg")
    private Double sodiumMg;
    @JsonProperty("alcohol_g")
    private Double alcoholG;

    public Macros() {
    }

    public Double getCalories() {
        return this.calories;
    }

    public Double getProteinG() {
        return this.proteinG;
    }

    public Double getCarbohydratesG() {
        return this.carbohydratesG;
    }

    public Double getTransFatG() {
        return this.transFatG;
    }

    public Double getFatG() {
        return this.fatG;
    }

    public Double getSugarG() {
        return this.sugarG;
    }

    public Double getCholesterolMg() {
        return this.cholesterolMg;
    }

    public Double getFiberG() {
        return this.fiberG;
    }

    public Double getSodiumMg() {
        return this.sodiumMg;
    }

    public Double getAlcoholG() {
        return this.alcoholG;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Macros)) return false;
        final Macros other = (Macros) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$calories = this.getCalories();
        final Object other$calories = other.getCalories();
        if (this$calories == null ? other$calories != null : !this$calories.equals(other$calories)) return false;
        final Object this$proteinG = this.getProteinG();
        final Object other$proteinG = other.getProteinG();
        if (this$proteinG == null ? other$proteinG != null : !this$proteinG.equals(other$proteinG)) return false;
        final Object this$carbohydratesG = this.getCarbohydratesG();
        final Object other$carbohydratesG = other.getCarbohydratesG();
        if (this$carbohydratesG == null ? other$carbohydratesG != null : !this$carbohydratesG.equals(other$carbohydratesG))
            return false;
        final Object this$transFatG = this.getTransFatG();
        final Object other$transFatG = other.getTransFatG();
        if (this$transFatG == null ? other$transFatG != null : !this$transFatG.equals(other$transFatG)) return false;
        final Object this$fatG = this.getFatG();
        final Object other$fatG = other.getFatG();
        if (this$fatG == null ? other$fatG != null : !this$fatG.equals(other$fatG)) return false;
        final Object this$sugarG = this.getSugarG();
        final Object other$sugarG = other.getSugarG();
        if (this$sugarG == null ? other$sugarG != null : !this$sugarG.equals(other$sugarG)) return false;
        final Object this$cholesterolMg = this.getCholesterolMg();
        final Object other$cholesterolMg = other.getCholesterolMg();
        if (this$cholesterolMg == null ? other$cholesterolMg != null : !this$cholesterolMg.equals(other$cholesterolMg))
            return false;
        final Object this$fiberG = this.getFiberG();
        final Object other$fiberG = other.getFiberG();
        if (this$fiberG == null ? other$fiberG != null : !this$fiberG.equals(other$fiberG)) return false;
        final Object this$sodiumMg = this.getSodiumMg();
        final Object other$sodiumMg = other.getSodiumMg();
        if (this$sodiumMg == null ? other$sodiumMg != null : !this$sodiumMg.equals(other$sodiumMg)) return false;
        final Object this$alcoholG = this.getAlcoholG();
        final Object other$alcoholG = other.getAlcoholG();
        if (this$alcoholG == null ? other$alcoholG != null : !this$alcoholG.equals(other$alcoholG)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Macros;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $calories = this.getCalories();
        result = result * PRIME + ($calories == null ? 43 : $calories.hashCode());
        final Object $proteinG = this.getProteinG();
        result = result * PRIME + ($proteinG == null ? 43 : $proteinG.hashCode());
        final Object $carbohydratesG = this.getCarbohydratesG();
        result = result * PRIME + ($carbohydratesG == null ? 43 : $carbohydratesG.hashCode());
        final Object $transFatG = this.getTransFatG();
        result = result * PRIME + ($transFatG == null ? 43 : $transFatG.hashCode());
        final Object $fatG = this.getFatG();
        result = result * PRIME + ($fatG == null ? 43 : $fatG.hashCode());
        final Object $sugarG = this.getSugarG();
        result = result * PRIME + ($sugarG == null ? 43 : $sugarG.hashCode());
        final Object $cholesterolMg = this.getCholesterolMg();
        result = result * PRIME + ($cholesterolMg == null ? 43 : $cholesterolMg.hashCode());
        final Object $fiberG = this.getFiberG();
        result = result * PRIME + ($fiberG == null ? 43 : $fiberG.hashCode());
        final Object $sodiumMg = this.getSodiumMg();
        result = result * PRIME + ($sodiumMg == null ? 43 : $sodiumMg.hashCode());
        final Object $alcoholG = this.getAlcoholG();
        result = result * PRIME + ($alcoholG == null ? 43 : $alcoholG.hashCode());
        return result;
    }

    public String toString() {
        return "Macros(calories=" + this.getCalories() + ", proteinG=" + this.getProteinG() + ", carbohydratesG=" + this.getCarbohydratesG() + ", transFatG=" + this.getTransFatG() + ", fatG=" + this.getFatG() + ", sugarG=" + this.getSugarG() + ", cholesterolMg=" + this.getCholesterolMg() + ", fiberG=" + this.getFiberG() + ", sodiumMg=" + this.getSodiumMg() + ", alcoholG=" + this.getAlcoholG() + ")";
    }
}
