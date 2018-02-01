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
package org.broadbandforum.tr135.stbservice.capabilities.videodecoder;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.capabilities.videodecoder.mpeg4part10.ProfileLevel;

	/**
	 * Object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 10 is used as the video standard.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.VideoDecoder.MPEG4Part10.")
public class MPEG4Part10 {

	/**
	 * Audio Standards supported by the Player when associated with MPEG4 Part 10 video.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioStandards")
	@XmlList
	public Collection<String> audioStandards;
	/**
	 * Table to describe the set of profiles and levels combinations supported by the STB when MPEG4 Part 10 is used as video standard.

{{marktemplate|diffs-0:4}}{{+++k+++e---num---+++ys+++}}--- --- The table MUST include a distinct entry for each supported combination of these parameters.
	 */
	@XmlElementWrapper(name = "profileLevels")
	@XmlElement(name = "ProfileLevel")
	public Collection<ProfileLevel> profileLevels;

	public MPEG4Part10() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get audio Standards supported by the Player when associated with MPEG4 Part 10 video.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getAudioStandards() {
		if (this.audioStandards == null){ this.audioStandards=new ArrayList<>();}
		return audioStandards;
	}

	/**
	 * Set audio Standards supported by the Player when associated with MPEG4 Part 10 video.
	 *
	 * @since 1.0
	 * @param audioStandards the input value
	 */
	public void  setAudioStandards(Collection<String> audioStandards) {
		this.audioStandards = audioStandards;
	}

	/**
	 * Set audio Standards supported by the Player when associated with MPEG4 Part 10 video.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public MPEG4Part10 withAudioStandards(String string) {
		getAudioStandards().add(string);
		return this;
	}

	/**
	 * Get the table to describe the set of profiles and levels combinations supported by the STB when MPEG4 Part 10 is used as video standard.

{{marktemplate|diffs-0:4}}{{+++k+++e---num---+++ys+++}}--- --- The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @return the value
	 */
	public Collection<ProfileLevel> getProfileLevels() {
		if (this.profileLevels == null){ this.profileLevels=new ArrayList<>();}
		return profileLevels;
	}

	/**
	 * Set the table to describe the set of profiles and levels combinations supported by the STB when MPEG4 Part 10 is used as video standard.

{{marktemplate|diffs-0:4}}{{+++k+++e---num---+++ys+++}}--- --- The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @param profileLevels the input value
	 */
	public void  setProfileLevels(Collection<ProfileLevel> profileLevels) {
		this.profileLevels = profileLevels;
	}

	/**
	 * Set the table to describe the set of profiles and levels combinations supported by the STB when MPEG4 Part 10 is used as video standard.

{{marktemplate|diffs-0:4}}{{+++k+++e---num---+++ys+++}}--- --- The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @param profileLevel the input value
	 * @return this instance
	 */
	public MPEG4Part10 withProfileLevel(ProfileLevel profileLevel) {
		getProfileLevels().add(profileLevel);
		return this;
	}

	//</editor-fold>

}