package co.tryterra.terraclient.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class GenerateWidgetResponse {
    @JsonProperty("expires_in")
    private int expires_in;
    @JsonProperty("session_id")
    private String session_id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("url")
    private String url;

    public GenerateWidgetResponse() {
    }

    public int getExpires_in() {
        return this.expires_in;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GenerateWidgetResponse)) return false;
        final GenerateWidgetResponse other = (GenerateWidgetResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getExpires_in() != other.getExpires_in()) return false;
        final Object this$session_id = this.getSession_id();
        final Object other$session_id = other.getSession_id();
        if (this$session_id == null ? other$session_id != null : !this$session_id.equals(other$session_id))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GenerateWidgetResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getExpires_in();
        final Object $session_id = this.getSession_id();
        result = result * PRIME + ($session_id == null ? 43 : $session_id.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        return result;
    }

    public String toString() {
        return "GenerateWidgetResponse(expires_in=" + this.getExpires_in() + ", session_id=" + this.getSession_id() + ", status=" + this.getStatus() + ", url=" + this.getUrl() + ")";
    }
}
