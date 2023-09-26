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
public class OtherDeviceData {
    private String name;
    private String manufacturer;
    @JsonProperty("serial_number")
    private String serialNumber;
    @JsonProperty("software_version")
    private String softwareVersion;
    @JsonProperty("hardware_version")
    private String hardwareVersion;

    public OtherDeviceData() {
    }

    public String getName() {
        return this.name;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OtherDeviceData)) return false;
        final OtherDeviceData other = (OtherDeviceData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$manufacturer = this.getManufacturer();
        final Object other$manufacturer = other.getManufacturer();
        if (this$manufacturer == null ? other$manufacturer != null : !this$manufacturer.equals(other$manufacturer))
            return false;
        final Object this$serialNumber = this.getSerialNumber();
        final Object other$serialNumber = other.getSerialNumber();
        if (this$serialNumber == null ? other$serialNumber != null : !this$serialNumber.equals(other$serialNumber))
            return false;
        final Object this$softwareVersion = this.getSoftwareVersion();
        final Object other$softwareVersion = other.getSoftwareVersion();
        if (this$softwareVersion == null ? other$softwareVersion != null : !this$softwareVersion.equals(other$softwareVersion))
            return false;
        final Object this$hardwareVersion = this.getHardwareVersion();
        final Object other$hardwareVersion = other.getHardwareVersion();
        if (this$hardwareVersion == null ? other$hardwareVersion != null : !this$hardwareVersion.equals(other$hardwareVersion))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OtherDeviceData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $manufacturer = this.getManufacturer();
        result = result * PRIME + ($manufacturer == null ? 43 : $manufacturer.hashCode());
        final Object $serialNumber = this.getSerialNumber();
        result = result * PRIME + ($serialNumber == null ? 43 : $serialNumber.hashCode());
        final Object $softwareVersion = this.getSoftwareVersion();
        result = result * PRIME + ($softwareVersion == null ? 43 : $softwareVersion.hashCode());
        final Object $hardwareVersion = this.getHardwareVersion();
        result = result * PRIME + ($hardwareVersion == null ? 43 : $hardwareVersion.hashCode());
        return result;
    }

    public String toString() {
        return "OtherDeviceData(name=" + this.getName() + ", manufacturer=" + this.getManufacturer() + ", serialNumber=" + this.getSerialNumber() + ", softwareVersion=" + this.getSoftwareVersion() + ", hardwareVersion=" + this.getHardwareVersion() + ")";
    }
}
