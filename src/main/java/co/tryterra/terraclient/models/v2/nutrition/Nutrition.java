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

package co.tryterra.terraclient.models.v2.nutrition;

import co.tryterra.terraclient.models.v2.common.Macros;
import co.tryterra.terraclient.models.v2.common.Metadata;
import co.tryterra.terraclient.models.v2.common.Micros;
import co.tryterra.terraclient.models.v2.samples.Meal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Nutrition {
    public Nutrition() {
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public Summary getSummary() {
        return this.summary;
    }

    public List<Meal> getMeals() {
        return this.meals;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Nutrition)) return false;
        final Nutrition other = (Nutrition) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$metadata = this.getMetadata();
        final Object other$metadata = other.getMetadata();
        if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
        final Object this$summary = this.getSummary();
        final Object other$summary = other.getSummary();
        if (this$summary == null ? other$summary != null : !this$summary.equals(other$summary)) return false;
        final Object this$meals = this.getMeals();
        final Object other$meals = other.getMeals();
        if (this$meals == null ? other$meals != null : !this$meals.equals(other$meals)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Nutrition;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $metadata = this.getMetadata();
        result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
        final Object $summary = this.getSummary();
        result = result * PRIME + ($summary == null ? 43 : $summary.hashCode());
        final Object $meals = this.getMeals();
        result = result * PRIME + ($meals == null ? 43 : $meals.hashCode());
        return result;
    }

    public String toString() {
        return "Nutrition(metadata=" + this.getMetadata() + ", summary=" + this.getSummary() + ", meals=" + this.getMeals() + ")";
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Summary {
        private Macros macros;
        private Micros micros;
        @JsonProperty("water_ml")
        private Double waterMl;

        public Summary() {
        }

        public Macros getMacros() {
            return this.macros;
        }

        public Micros getMicros() {
            return this.micros;
        }

        public Double getWaterMl() {
            return this.waterMl;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Summary)) return false;
            final Summary other = (Summary) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$macros = this.getMacros();
            final Object other$macros = other.getMacros();
            if (this$macros == null ? other$macros != null : !this$macros.equals(other$macros)) return false;
            final Object this$micros = this.getMicros();
            final Object other$micros = other.getMicros();
            if (this$micros == null ? other$micros != null : !this$micros.equals(other$micros)) return false;
            final Object this$waterMl = this.getWaterMl();
            final Object other$waterMl = other.getWaterMl();
            if (this$waterMl == null ? other$waterMl != null : !this$waterMl.equals(other$waterMl)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Summary;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $macros = this.getMacros();
            result = result * PRIME + ($macros == null ? 43 : $macros.hashCode());
            final Object $micros = this.getMicros();
            result = result * PRIME + ($micros == null ? 43 : $micros.hashCode());
            final Object $waterMl = this.getWaterMl();
            result = result * PRIME + ($waterMl == null ? 43 : $waterMl.hashCode());
            return result;
        }

        public String toString() {
            return "Nutrition.Summary(macros=" + this.getMacros() + ", micros=" + this.getMicros() + ", waterMl=" + this.getWaterMl() + ")";
        }
    }

    private Metadata metadata;
    private Summary summary;
    private List<Meal> meals;
}
