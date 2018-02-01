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
package org.broadbandforum.tr069.internetgatewaydevice.wandevice.wanethernetinterfaceconfig;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains statistics for an Ethernet WAN interface on a CPE device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANEthernetInterfaceConfig.Stats.")
public class Stats {

	/**
	 * Total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BytesSent")
	public Long bytesSent;
	/**
	 * Total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BytesReceived")
	public Long bytesReceived;
	/**
	 * Total number of packets sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsSent")
	public Long packetsSent;
	/**
	 * Total number of packets received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsReceived")
	public Long packetsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Stats withBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Stats withBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of packets sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of packets sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of packets sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Stats withPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of packets received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of packets received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of packets received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Stats withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	//</editor-fold>

}