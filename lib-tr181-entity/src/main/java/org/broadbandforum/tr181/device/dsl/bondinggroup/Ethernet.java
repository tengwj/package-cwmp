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
package org.broadbandforum.tr181.device.dsl.bondinggroup;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.dsl.bondinggroup.ethernet.Stats;

	/**
	 * Ethernet-based bonding parameters {{bibref|G.998.2}}.

        This object MUST be present if, and only if, {{param|#.BondScheme}} is {{enum|Ethernet|#.BondScheme}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.BondingGroup.{i}.Ethernet.")
public class Ethernet {

	/**
	 * {{bibref|G.998.2}} Ethernet-based bonding statistics.

        These relate to the {{bibref|G.998.2}} PME (Physical Medium Entity) Aggregation Function (PAF) and to its upper layer interface.  PAF  lower layer interface statistics are in the {{object|##.BondedChannel.{i}.Ethernet.Stats}} objects.

        The CPE MUST reset the Stats parameters either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|##.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|##.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Ethernet() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{bibref|G.998.2}} Ethernet-based bonding statistics.

        These relate to the {{bibref|G.998.2}} PME (Physical Medium Entity) Aggregation Function (PAF) and to its upper layer interface.  PAF  lower layer interface statistics are in the {{object|##.BondedChannel.{i}.Ethernet.Stats}} objects.

        The CPE MUST reset the Stats parameters either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|##.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|##.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the {{bibref|G.998.2}} Ethernet-based bonding statistics.

        These relate to the {{bibref|G.998.2}} PME (Physical Medium Entity) Aggregation Function (PAF) and to its upper layer interface.  PAF  lower layer interface statistics are in the {{object|##.BondedChannel.{i}.Ethernet.Stats}} objects.

        The CPE MUST reset the Stats parameters either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|##.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|##.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the {{bibref|G.998.2}} Ethernet-based bonding statistics.

        These relate to the {{bibref|G.998.2}} PME (Physical Medium Entity) Aggregation Function (PAF) and to its upper layer interface.  PAF  lower layer interface statistics are in the {{object|##.BondedChannel.{i}.Ethernet.Stats}} objects.

        The CPE MUST reset the Stats parameters either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|##.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|##.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Ethernet withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}