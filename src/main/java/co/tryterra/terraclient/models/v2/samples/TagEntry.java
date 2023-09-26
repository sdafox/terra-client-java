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
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TagEntry {
    private String timestamp;
    @JsonProperty("tag_name")
    private String tagName;
    private String notes;

    public TagEntry() {
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getTagName() {
        return this.tagName;
    }

    public String getNotes() {
        return this.notes;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TagEntry)) return false;
        final TagEntry other = (TagEntry) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$tagName = this.getTagName();
        final Object other$tagName = other.getTagName();
        if (this$tagName == null ? other$tagName != null : !this$tagName.equals(other$tagName)) return false;
        final Object this$notes = this.getNotes();
        final Object other$notes = other.getNotes();
        if (this$notes == null ? other$notes != null : !this$notes.equals(other$notes)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TagEntry;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $tagName = this.getTagName();
        result = result * PRIME + ($tagName == null ? 43 : $tagName.hashCode());
        final Object $notes = this.getNotes();
        result = result * PRIME + ($notes == null ? 43 : $notes.hashCode());
        return result;
    }

    public String toString() {
        return "TagEntry(timestamp=" + this.getTimestamp() + ", tagName=" + this.getTagName() + ", notes=" + this.getNotes() + ")";
    }
}
