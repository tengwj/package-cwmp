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
package org.broadbandforum.tr104.voiceservice.callcontrol.line;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.callcontrol.line.stats.DSP;
import org.broadbandforum.tr104.voiceservice.callcontrol.line.stats.IncomingCalls;
import org.broadbandforum.tr104.voiceservice.callcontrol.line.stats.OutgoingCalls;
import org.broadbandforum.tr104.voiceservice.callcontrol.line.stats.RTP;

	/**
	 * Statistics for this {{object|#}} instance.

The CPE MUST reset the line's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the line becomes operationally down due to a previous administrative down (i.e. the line's {{param|#.Status}} parameter transitions to a down state after the line is disabled) or when the line becomes administratively up (i.e. the line's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.Line.{i}.Stats.")
public class Stats {

	/**
	 * Statistics for incoming calls.
	 */
	@XmlElement(name = "IncomingCalls")
	public IncomingCalls incomingCalls;
	/**
	 * Statistics for outgoing calls.
	 */
	@XmlElement(name = "OutgoingCalls")
	public OutgoingCalls outgoingCalls;
	/**
	 * RTP statistic parameters.
	 */
	@XmlElement(name = "RTP")
	public RTP rtp;
	/**
	 * DSP statistic parameters.
	 */
	@XmlElement(name = "DSP")
	public DSP dsp;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the statistics for incoming calls.
	 *
	 * @return the value
	 */
	public IncomingCalls getIncomingCalls() {
		return incomingCalls;
	}

	/**
	 * Set the statistics for incoming calls.
	 *
	 * @param incomingCalls the input value
	 */
	public void  setIncomingCalls(IncomingCalls incomingCalls) {
		this.incomingCalls = incomingCalls;
	}

	/**
	 * Set the statistics for incoming calls.
	 *
	 * @param incomingCalls the input value
	 * @return this instance
	 */
	public Stats withIncomingCalls(IncomingCalls incomingCalls) {
		this.incomingCalls = incomingCalls;
		return this;
	}

	/**
	 * Get the statistics for outgoing calls.
	 *
	 * @return the value
	 */
	public OutgoingCalls getOutgoingCalls() {
		return outgoingCalls;
	}

	/**
	 * Set the statistics for outgoing calls.
	 *
	 * @param outgoingCalls the input value
	 */
	public void  setOutgoingCalls(OutgoingCalls outgoingCalls) {
		this.outgoingCalls = outgoingCalls;
	}

	/**
	 * Set the statistics for outgoing calls.
	 *
	 * @param outgoingCalls the input value
	 * @return this instance
	 */
	public Stats withOutgoingCalls(OutgoingCalls outgoingCalls) {
		this.outgoingCalls = outgoingCalls;
		return this;
	}

	/**
	 * Get the rtp statistic parameters.
	 *
	 * @return the value
	 */
	public RTP getRtp() {
		return rtp;
	}

	/**
	 * Set the rtp statistic parameters.
	 *
	 * @param rtp the input value
	 */
	public void  setRtp(RTP rtp) {
		this.rtp = rtp;
	}

	/**
	 * Set the rtp statistic parameters.
	 *
	 * @param rtp the input value
	 * @return this instance
	 */
	public Stats withRtp(RTP rtp) {
		this.rtp = rtp;
		return this;
	}

	/**
	 * Get the dsp statistic parameters.
	 *
	 * @return the value
	 */
	public DSP getDsp() {
		return dsp;
	}

	/**
	 * Set the dsp statistic parameters.
	 *
	 * @param dsp the input value
	 */
	public void  setDsp(DSP dsp) {
		this.dsp = dsp;
	}

	/**
	 * Set the dsp statistic parameters.
	 *
	 * @param dsp the input value
	 * @return this instance
	 */
	public Stats withDsp(DSP dsp) {
		this.dsp = dsp;
		return this;
	}

	//</editor-fold>

}