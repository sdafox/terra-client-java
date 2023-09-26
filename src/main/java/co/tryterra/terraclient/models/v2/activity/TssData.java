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

import co.tryterra.terraclient.models.v2.samples.TssSample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TssData {
    @JsonProperty("TSS_samples")
    private List<TssSample> tssSamples;

    public TssData() {
    }

    public List<TssSample> getTssSamples() {
        return this.tssSamples;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TssData)) return false;
        final TssData other = (TssData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tssSamples = this.getTssSamples();
        final Object other$tssSamples = other.getTssSamples();
        if (this$tssSamples == null ? other$tssSamples != null : !this$tssSamples.equals(other$tssSamples))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TssData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tssSamples = this.getTssSamples();
        result = result * PRIME + ($tssSamples == null ? 43 : $tssSamples.hashCode());
        return result;
    }

    public String toString() {
        return "TssData(tssSamples=" + this.getTssSamples() + ")";
    }
}
