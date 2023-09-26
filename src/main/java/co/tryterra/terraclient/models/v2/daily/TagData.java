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

import co.tryterra.terraclient.models.v2.samples.TagEntry;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TagData {
    private List<TagEntry> tags;

    public TagData() {
    }

    public List<TagEntry> getTags() {
        return this.tags;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TagData)) return false;
        final TagData other = (TagData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tags = this.getTags();
        final Object other$tags = other.getTags();
        if (this$tags == null ? other$tags != null : !this$tags.equals(other$tags)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TagData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tags = this.getTags();
        result = result * PRIME + ($tags == null ? 43 : $tags.hashCode());
        return result;
    }

    public String toString() {
        return "TagData(tags=" + this.getTags() + ")";
    }
}
