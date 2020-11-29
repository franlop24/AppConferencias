package com.franlops.conf.view.adapter

import com.franlops.conf.model.Speaker

interface SpeakerListener {
    fun onSpeakerCliked(speaker: Speaker, position: Int)
}