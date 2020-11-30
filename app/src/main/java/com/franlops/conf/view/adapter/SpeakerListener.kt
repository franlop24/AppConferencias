package com.franlops.conf.view.adapter

import com.franlops.conf.model.Speaker

interface SpeakerListener {
    fun onSpeakerClicked(speaker: Speaker, position: Int)
}