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

import co.tryterra.terraclient.models.v2.common.Macros;
import co.tryterra.terraclient.models.v2.common.Micros;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meal {
    public Meal() {
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public Macros getMacros() {
        return this.macros;
    }

    public Micros getMicros() {
        return this.micros;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Meal)) return false;
        final Meal other = (Meal) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$macros = this.getMacros();
        final Object other$macros = other.getMacros();
        if (this$macros == null ? other$macros != null : !this$macros.equals(other$macros)) return false;
        final Object this$micros = this.getMicros();
        final Object other$micros = other.getMicros();
        if (this$micros == null ? other$micros != null : !this$micros.equals(other$micros)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Meal;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $macros = this.getMacros();
        result = result * PRIME + ($macros == null ? 43 : $macros.hashCode());
        final Object $micros = this.getMicros();
        result = result * PRIME + ($micros == null ? 43 : $micros.hashCode());
        return result;
    }

    public String toString() {
        return "Meal(name=" + this.getName() + ", id=" + this.getId() + ", macros=" + this.getMacros() + ", micros=" + this.getMicros() + ")";
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Quantity {
        private Integer unit;
        private Double amount;

        public Quantity() {
        }

        public Integer getUnit() {
            return this.unit;
        }

        public Double getAmount() {
            return this.amount;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Quantity)) return false;
            final Quantity other = (Quantity) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$unit = this.getUnit();
            final Object other$unit = other.getUnit();
            if (this$unit == null ? other$unit != null : !this$unit.equals(other$unit)) return false;
            final Object this$amount = this.getAmount();
            final Object other$amount = other.getAmount();
            if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Quantity;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $unit = this.getUnit();
            result = result * PRIME + ($unit == null ? 43 : $unit.hashCode());
            final Object $amount = this.getAmount();
            result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
            return result;
        }

        public String toString() {
            return "Meal.Quantity(unit=" + this.getUnit() + ", amount=" + this.getAmount() + ")";
        }
    }

    private String name;
    private String id;
    private Macros macros;
    private Micros micros;
}
