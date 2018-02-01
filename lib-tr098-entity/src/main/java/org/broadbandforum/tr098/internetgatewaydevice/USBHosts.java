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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr098.internetgatewaydevice.usbhosts.Host;

	/**
	 * This object models the CPE's USB Host controllers.

See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.USBHosts.")
public class USBHosts {

	/**
	 * Table of CPE USB Host controllers.
	 */
	@XmlElementWrapper(name = "hosts")
	@XmlElement(name = "Host")
	public Collection<Host> hosts;

	public USBHosts() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the table of CPE USB Host controllers.
	 *
	 * @return the value
	 */
	public Collection<Host> getHosts() {
		if (this.hosts == null){ this.hosts=new ArrayList<>();}
		return hosts;
	}

	/**
	 * Set the table of CPE USB Host controllers.
	 *
	 * @param hosts the input value
	 */
	public void  setHosts(Collection<Host> hosts) {
		this.hosts = hosts;
	}

	/**
	 * Set the table of CPE USB Host controllers.
	 *
	 * @param host the input value
	 * @return this instance
	 */
	public USBHosts withHost(Host host) {
		getHosts().add(host);
		return this;
	}

	//</editor-fold>

}