package com.theophiluskibet.communityapi.models

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "events")
data class Event(
    val eventName: String,
)
