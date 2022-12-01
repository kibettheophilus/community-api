package com.theophiluskibet.communityapi.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.stereotype.Component

@Document(collection = "events")
data class Event(
    @Id
    val id: String,
    var eventName: String,
)
