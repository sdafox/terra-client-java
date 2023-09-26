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

package co.tryterra.terraclient.models.v2.common;

import co.tryterra.terraclient.models.v2.samples.OtherDeviceData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceData {
    private String name;
    @JsonProperty("hardware_version")
    private String hardwareVersion;
    private String manufacturer;
    @JsonProperty("software_version")
    private String softwareVersion;
    @JsonProperty("activation_timestamp")
    private String activationTimestamp;
    @JsonProperty("serial_number")
    private String serialNumber;
    @JsonProperty("other_devices")
    private List<OtherDeviceData> otherDevices;

    public DeviceData() {
    }

    public String getName() {
        return this.name;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public String getActivationTimestamp() {
        return this.activationTimestamp;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public List<OtherDeviceData> getOtherDevices() {
        return this.otherDevices;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DeviceData)) return false;
        final DeviceData other = (DeviceData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$hardwareVersion = this.getHardwareVersion();
        final Object other$hardwareVersion = other.getHardwareVersion();
        if (this$hardwareVersion == null ? other$hardwareVersion != null : !this$hardwareVersion.equals(other$hardwareVersion))
            return false;
        final Object this$manufacturer = this.getManufacturer();
        final Object other$manufacturer = other.getManufacturer();
        if (this$manufacturer == null ? other$manufacturer != null : !this$manufacturer.equals(other$manufacturer))
            return false;
        final Object this$softwareVersion = this.getSoftwareVersion();
        final Object other$softwareVersion = other.getSoftwareVersion();
        if (this$softwareVersion == null ? other$softwareVersion != null : !this$softwareVersion.equals(other$softwareVersion))
            return false;
        final Object this$activationTimestamp = this.getActivationTimestamp();
        final Object other$activationTimestamp = other.getActivationTimestamp();
        if (this$activationTimestamp == null ? other$activationTimestamp != null : !this$activationTimestamp.equals(other$activationTimestamp))
            return false;
        final Object this$serialNumber = this.getSerialNumber();
        final Object other$serialNumber = other.getSerialNumber();
        if (this$serialNumber == null ? other$serialNumber != null : !this$serialNumber.equals(other$serialNumber))
            return false;
        final Object this$otherDevices = this.getOtherDevices();
        final Object other$otherDevices = other.getOtherDevices();
        if (this$otherDevices == null ? other$otherDevices != null : !this$otherDevices.equals(other$otherDevices))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DeviceData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $hardwareVersion = this.getHardwareVersion();
        result = result * PRIME + ($hardwareVersion == null ? 43 : $hardwareVersion.hashCode());
        final Object $manufacturer = this.getManufacturer();
        result = result * PRIME + ($manufacturer == null ? 43 : $manufacturer.hashCode());
        final Object $softwareVersion = this.getSoftwareVersion();
        result = result * PRIME + ($softwareVersion == null ? 43 : $softwareVersion.hashCode());
        final Object $activationTimestamp = this.getActivationTimestamp();
        result = result * PRIME + ($activationTimestamp == null ? 43 : $activationTimestamp.hashCode());
        final Object $serialNumber = this.getSerialNumber();
        result = result * PRIME + ($serialNumber == null ? 43 : $serialNumber.hashCode());
        final Object $otherDevices = this.getOtherDevices();
        result = result * PRIME + ($otherDevices == null ? 43 : $otherDevices.hashCode());
        return result;
    }

    public String toString() {
        return "DeviceData(name=" + this.getName() + ", hardwareVersion=" + this.getHardwareVersion() + ", manufacturer=" + this.getManufacturer() + ", softwareVersion=" + this.getSoftwareVersion() + ", activationTimestamp=" + this.getActivationTimestamp() + ", serialNumber=" + this.getSerialNumber() + ", otherDevices=" + this.getOtherDevices() + ")";
    }
}
