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

package co.tryterra.terraclient.models.v2.daily;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ScoresData {
    private Double recovery;
    private Double sleep;
    private Double activity;

    public ScoresData() {
    }

    public Double getRecovery() {
        return this.recovery;
    }

    public Double getSleep() {
        return this.sleep;
    }

    public Double getActivity() {
        return this.activity;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ScoresData)) return false;
        final ScoresData other = (ScoresData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$recovery = this.getRecovery();
        final Object other$recovery = other.getRecovery();
        if (this$recovery == null ? other$recovery != null : !this$recovery.equals(other$recovery)) return false;
        final Object this$sleep = this.getSleep();
        final Object other$sleep = other.getSleep();
        if (this$sleep == null ? other$sleep != null : !this$sleep.equals(other$sleep)) return false;
        final Object this$activity = this.getActivity();
        final Object other$activity = other.getActivity();
        if (this$activity == null ? other$activity != null : !this$activity.equals(other$activity)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ScoresData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $recovery = this.getRecovery();
        result = result * PRIME + ($recovery == null ? 43 : $recovery.hashCode());
        final Object $sleep = this.getSleep();
        result = result * PRIME + ($sleep == null ? 43 : $sleep.hashCode());
        final Object $activity = this.getActivity();
        result = result * PRIME + ($activity == null ? 43 : $activity.hashCode());
        return result;
    }

    public String toString() {
        return "ScoresData(recovery=" + this.getRecovery() + ", sleep=" + this.getSleep() + ", activity=" + this.getActivity() + ")";
    }
}
