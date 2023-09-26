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
public class PolylineMapData {
    @JsonProperty("summary_polyline")
    private String summaryPolyline;

    public PolylineMapData() {
    }

    public String getSummaryPolyline() {
        return this.summaryPolyline;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PolylineMapData)) return false;
        final PolylineMapData other = (PolylineMapData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$summaryPolyline = this.getSummaryPolyline();
        final Object other$summaryPolyline = other.getSummaryPolyline();
        if (this$summaryPolyline == null ? other$summaryPolyline != null : !this$summaryPolyline.equals(other$summaryPolyline))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PolylineMapData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $summaryPolyline = this.getSummaryPolyline();
        result = result * PRIME + ($summaryPolyline == null ? 43 : $summaryPolyline.hashCode());
        return result;
    }

    public String toString() {
        return "PolylineMapData(summaryPolyline=" + this.getSummaryPolyline() + ")";
    }
}
