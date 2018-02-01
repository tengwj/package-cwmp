/*
 * Copyright 2018 Key Bridge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.datatypes.IPAddress;

	/**
	 * IP address table with each object representing an IP address on the LANDevice IP interface.

Support for more than one interface instance is OPTIONAL.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.IPInterface.{i}.")
public class IPInterface {

	/**
	 * Enables or disables this entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * IP address of the LAN-side interface of the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IPInterfaceIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress ipinterfaceIPAddress;
	/**
	 * Subnet mask of the LAN-side interface of the IGD.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IPInterfaceSubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress ipinterfaceSubnetMask;
	/**
	 * Represents the addressing method used to assign the LAN-side IP address of the CPE on this interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IPInterfaceAddressingType")
	@CWMPParameter(access = "readWrite")
	public String ipinterfaceAddressingType = "DHCP";

	public IPInterface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public IPInterface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public IPInterface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the ip address of the LAN-side interface of the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getIpinterfaceIPAddress() {
		return ipinterfaceIPAddress;
	}

	/**
	 * Set the ip address of the LAN-side interface of the CPE.
	 *
	 * @since 1.0
	 * @param ipinterfaceIPAddress the input value
	 */
	public void  setIpinterfaceIPAddress(IPAddress ipinterfaceIPAddress) {
		this.ipinterfaceIPAddress = ipinterfaceIPAddress;
	}

	/**
	 * Set the ip address of the LAN-side interface of the CPE.
	 *
	 * @since 1.0
	 * @param ipinterfaceIPAddress the input value
	 * @return this instance
	 */
	public IPInterface withIpinterfaceIPAddress(IPAddress ipinterfaceIPAddress) {
		this.ipinterfaceIPAddress = ipinterfaceIPAddress;
		return this;
	}

	/**
	 * Get the subnet mask of the LAN-side interface of the IGD.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getIpinterfaceSubnetMask() {
		return ipinterfaceSubnetMask;
	}

	/**
	 * Set the subnet mask of the LAN-side interface of the IGD.
	 *
	 * @since 1.0
	 * @param ipinterfaceSubnetMask the input value
	 */
	public void  setIpinterfaceSubnetMask(IPAddress ipinterfaceSubnetMask) {
		this.ipinterfaceSubnetMask = ipinterfaceSubnetMask;
	}

	/**
	 * Set the subnet mask of the LAN-side interface of the IGD.
	 *
	 * @since 1.0
	 * @param ipinterfaceSubnetMask the input value
	 * @return this instance
	 */
	public IPInterface withIpinterfaceSubnetMask(IPAddress ipinterfaceSubnetMask) {
		this.ipinterfaceSubnetMask = ipinterfaceSubnetMask;
		return this;
	}

	/**
	 * Get the represents the addressing method used to assign the LAN-side IP address of the CPE on this interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIpinterfaceAddressingType() {
		return ipinterfaceAddressingType;
	}

	/**
	 * Set the represents the addressing method used to assign the LAN-side IP address of the CPE on this interface.
	 *
	 * @since 1.0
	 * @param ipinterfaceAddressingType the input value
	 */
	public void  setIpinterfaceAddressingType(String ipinterfaceAddressingType) {
		this.ipinterfaceAddressingType = ipinterfaceAddressingType;
	}

	/**
	 * Set the represents the addressing method used to assign the LAN-side IP address of the CPE on this interface.
	 *
	 * @since 1.0
	 * @param ipinterfaceAddressingType the input value
	 * @return this instance
	 */
	public IPInterface withIpinterfaceAddressingType(String ipinterfaceAddressingType) {
		this.ipinterfaceAddressingType = ipinterfaceAddressingType;
		return this;
	}

	//</editor-fold>

}