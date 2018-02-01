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
package org.broadbandforum.tr069.internetgatewaydevice.landevice.wlanconfiguration;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr069.datatypes.MACAddress;

	/**
	 * This is a table of preshared keys.  The size of this table is fixed with exactly 10 entries (with instance numbers 1 through 10).  This object must be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.{i}.")
public class PreSharedKey {

	/**
	 * A literal WPA PSK expressed as a hexadecimal string.

The first table entry contains the default ''PreSharedKey'' (''InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.1.PreSharedKey'').
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PreSharedKey")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String preSharedKey;
	/**
	 * A passphrase from which WEP or PSK keys were generated.  This parameter for information only-the CPE is not responsible for generating the key based on the passphrase.

For WEP keys it must either be a valid key length divided by 8, in which case each byte contributes 8 bits to the key, or else must consist of Hex digits and be a valid key length divided by 4, in which case each byte contributes 4 bits to the key.

For WPA PSK, the key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 (RFC2898)..

Note: The 802.11i standard specifies rules for generation of WEP keys from a passphrase.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "KeyPassphrase")
	@CWMPParameter(access = "readWrite")
	@Size(max = 63)
	public String keyPassphrase;
	/**
	 * The MAC address associated with a preshared key, or {{empty}} if no MAC address is associated with the key.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AssociatedDeviceMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress associatedDeviceMACAddress;

	public PreSharedKey() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get a literal WPA PSK expressed as a hexadecimal string.

The first table entry contains the default ''PreSharedKey'' (''InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.1.PreSharedKey'').
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPreSharedKey() {
		return preSharedKey;
	}

	/**
	 * Set a literal WPA PSK expressed as a hexadecimal string.

The first table entry contains the default ''PreSharedKey'' (''InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.1.PreSharedKey'').
	 *
	 * @since 1.0
	 * @param preSharedKey the input value
	 */
	public void  setPreSharedKey(String preSharedKey) {
		this.preSharedKey = preSharedKey;
	}

	/**
	 * Set a literal WPA PSK expressed as a hexadecimal string.

The first table entry contains the default ''PreSharedKey'' (''InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.1.PreSharedKey'').
	 *
	 * @since 1.0
	 * @param preSharedKey the input value
	 * @return this instance
	 */
	public PreSharedKey withPreSharedKey(String preSharedKey) {
		this.preSharedKey = preSharedKey;
		return this;
	}

	/**
	 * Get a passphrase from which WEP or PSK keys were generated.  This parameter for information only-the CPE is not responsible for generating the key based on the passphrase.

For WEP keys it must either be a valid key length divided by 8, in which case each byte contributes 8 bits to the key, or else must consist of Hex digits and be a valid key length divided by 4, in which case each byte contributes 4 bits to the key.

For WPA PSK, the key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 (RFC2898)..

Note: The 802.11i standard specifies rules for generation of WEP keys from a passphrase.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getKeyPassphrase() {
		return keyPassphrase;
	}

	/**
	 * Set a passphrase from which WEP or PSK keys were generated.  This parameter for information only-the CPE is not responsible for generating the key based on the passphrase.

For WEP keys it must either be a valid key length divided by 8, in which case each byte contributes 8 bits to the key, or else must consist of Hex digits and be a valid key length divided by 4, in which case each byte contributes 4 bits to the key.

For WPA PSK, the key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 (RFC2898)..

Note: The 802.11i standard specifies rules for generation of WEP keys from a passphrase.
	 *
	 * @since 1.0
	 * @param keyPassphrase the input value
	 */
	public void  setKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
	}

	/**
	 * Set a passphrase from which WEP or PSK keys were generated.  This parameter for information only-the CPE is not responsible for generating the key based on the passphrase.

For WEP keys it must either be a valid key length divided by 8, in which case each byte contributes 8 bits to the key, or else must consist of Hex digits and be a valid key length divided by 4, in which case each byte contributes 4 bits to the key.

For WPA PSK, the key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 (RFC2898)..

Note: The 802.11i standard specifies rules for generation of WEP keys from a passphrase.
	 *
	 * @since 1.0
	 * @param keyPassphrase the input value
	 * @return this instance
	 */
	public PreSharedKey withKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
		return this;
	}

	/**
	 * Get the MAC address associated with a preshared key, or {{empty}} if no MAC address is associated with the key.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getAssociatedDeviceMACAddress() {
		return associatedDeviceMACAddress;
	}

	/**
	 * Set the MAC address associated with a preshared key, or {{empty}} if no MAC address is associated with the key.
	 *
	 * @since 1.0
	 * @param associatedDeviceMACAddress the input value
	 */
	public void  setAssociatedDeviceMACAddress(MACAddress associatedDeviceMACAddress) {
		this.associatedDeviceMACAddress = associatedDeviceMACAddress;
	}

	/**
	 * Set the MAC address associated with a preshared key, or {{empty}} if no MAC address is associated with the key.
	 *
	 * @since 1.0
	 * @param associatedDeviceMACAddress the input value
	 * @return this instance
	 */
	public PreSharedKey withAssociatedDeviceMACAddress(MACAddress associatedDeviceMACAddress) {
		this.associatedDeviceMACAddress = associatedDeviceMACAddress;
		return this;
	}

	//</editor-fold>

}