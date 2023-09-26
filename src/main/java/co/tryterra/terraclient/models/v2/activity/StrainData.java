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

package co.tryterra.terraclient.models.v2.activity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StrainData {
    @JsonProperty("strain_level")
    public Double strainLevel;

    public StrainData() {
    }

    public Double getStrainLevel() {
        return this.strainLevel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StrainData)) return false;
        final StrainData other = (StrainData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$strainLevel = this.getStrainLevel();
        final Object other$strainLevel = other.getStrainLevel();
        if (this$strainLevel == null ? other$strainLevel != null : !this$strainLevel.equals(other$strainLevel))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StrainData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $strainLevel = this.getStrainLevel();
        result = result * PRIME + ($strainLevel == null ? 43 : $strainLevel.hashCode());
        return result;
    }

    public String toString() {
        return "StrainData(strainLevel=" + this.getStrainLevel() + ")";
    }
}
