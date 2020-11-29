package com.franlops.conf.view.adapter

import com.franlops.conf.model.Conference

interface ScheduleListener{
    fun onConferenceClicked(conference: Conference, position: Int)
}