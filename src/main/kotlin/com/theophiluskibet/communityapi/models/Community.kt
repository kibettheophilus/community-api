package com.theophiluskibet.communityapi.models

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "communities")
data class Community(
    val id: String? = null,
    val name: String,
    val description: String,
    val logoUrl: String? = "",
    val events: List<Event>? = listOf(),
    val socials: Socials? = Socials(),
    val createdDate: String? = "",
    val createdBy: String? = null,
    val modifiedDate: String? = null,
    val modifiedBy: String? = null
)

data class Socials(
    val twitterUrl: String? = "",
    val facebookUrl: String? = "",
    val youtubeUrl: String? = "",
    val linkedinUrl: String? = ""
)
