package com.theophiluskibet.communityapi.models

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "communities")
data class Community(
    val name: String,
    val members: Int,
    val dateStarted: Long,
    val description: String
)
