package co.tryterra.terraclient.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvidersResponse {
    @JsonProperty("providers")
    private List<String> providers;
    @JsonProperty("sdk_providers")
    private List<String> sdkProviders;
    private String status;

    public ProvidersResponse() {
    }

    public List<String> getProviders() {
        return this.providers;
    }

    public List<String> getSdkProviders() {
        return this.sdkProviders;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProvidersResponse)) return false;
        final ProvidersResponse other = (ProvidersResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$providers = this.getProviders();
        final Object other$providers = other.getProviders();
        if (this$providers == null ? other$providers != null : !this$providers.equals(other$providers)) return false;
        final Object this$sdkProviders = this.getSdkProviders();
        final Object other$sdkProviders = other.getSdkProviders();
        if (this$sdkProviders == null ? other$sdkProviders != null : !this$sdkProviders.equals(other$sdkProviders))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProvidersResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $providers = this.getProviders();
        result = result * PRIME + ($providers == null ? 43 : $providers.hashCode());
        final Object $sdkProviders = this.getSdkProviders();
        result = result * PRIME + ($sdkProviders == null ? 43 : $sdkProviders.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "ProvidersResponse(providers=" + this.getProviders() + ", sdkProviders=" + this.getSdkProviders() + ", status=" + this.getStatus() + ")";
    }
}
