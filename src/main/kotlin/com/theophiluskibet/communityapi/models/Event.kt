package com.theophiluskibet.communityapi.models

data class Event(
    val id: Int,
    val eventName: String,
    val eventDate: Long,
    val location: String
)
