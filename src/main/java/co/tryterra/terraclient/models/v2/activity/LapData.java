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

import co.tryterra.terraclient.models.v2.samples.LapSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LapData {
    private List<LapSample> laps;

    public LapData() {
    }

    public List<LapSample> getLaps() {
        return this.laps;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LapData)) return false;
        final LapData other = (LapData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$laps = this.getLaps();
        final Object other$laps = other.getLaps();
        if (this$laps == null ? other$laps != null : !this$laps.equals(other$laps)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LapData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $laps = this.getLaps();
        result = result * PRIME + ($laps == null ? 43 : $laps.hashCode());
        return result;
    }

    public String toString() {
        return "LapData(laps=" + this.getLaps() + ")";
    }
}
