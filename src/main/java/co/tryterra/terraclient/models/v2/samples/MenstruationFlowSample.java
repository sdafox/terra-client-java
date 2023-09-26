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

@JsonIgnoreProperties(ignoreUnknown = true)
public class MenstruationFlowSample {
    private String timestamp;
    private Integer flow;

    public MenstruationFlowSample() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Integer getFlow() {
        return this.flow;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MenstruationFlowSample)) return false;
        final MenstruationFlowSample other = (MenstruationFlowSample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$flow = this.getFlow();
        final Object other$flow = other.getFlow();
        if (this$flow == null ? other$flow != null : !this$flow.equals(other$flow)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenstruationFlowSample;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $flow = this.getFlow();
        result = result * PRIME + ($flow == null ? 43 : $flow.hashCode());
        return result;
    }

    public String toString() {
        return "MenstruationFlowSample(timestamp=" + this.getTimestamp() + ", flow=" + this.getFlow() + ")";
    }
}
