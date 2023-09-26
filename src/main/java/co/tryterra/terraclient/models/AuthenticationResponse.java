package co.tryterra.terraclient.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticationResponse {
    @JsonProperty("status")
    private String status;
    @JsonProperty("auth_url")
    private String auth_url; 
    @JsonProperty("user_id")
    private String user_id;

    public AuthenticationResponse() {
    }

    public String getStatus() {
        return this.status;
    }

    public String getAuth_url() {
        return this.auth_url;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthenticationResponse)) return false;
        final AuthenticationResponse other = (AuthenticationResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$auth_url = this.getAuth_url();
        final Object other$auth_url = other.getAuth_url();
        if (this$auth_url == null ? other$auth_url != null : !this$auth_url.equals(other$auth_url)) return false;
        final Object this$user_id = this.getUser_id();
        final Object other$user_id = other.getUser_id();
        if (this$user_id == null ? other$user_id != null : !this$user_id.equals(other$user_id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AuthenticationResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $auth_url = this.getAuth_url();
        result = result * PRIME + ($auth_url == null ? 43 : $auth_url.hashCode());
        final Object $user_id = this.getUser_id();
        result = result * PRIME + ($user_id == null ? 43 : $user_id.hashCode());
        return result;
    }

    public String toString() {
        return "AuthenticationResponse(status=" + this.getStatus() + ", auth_url=" + this.getAuth_url() + ", user_id=" + this.getUser_id() + ")";
    }
}
