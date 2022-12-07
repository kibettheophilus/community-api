package com.theophiluskibet.communityapi.models

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "communities")
data class Community(
    val id: String? = null,
    val name: String,
    val description: String,
    val logoUrl: String? = null,
    val createdDate: String? = null,
    val createdBy: String? = null,
    val modifiedDate: String? = null,
    val modifiedBy: String? = null
)
//
//data class Socials(
//    val twitterUrl: String? = null,
//    val facebookUrl: String? = null,
//    val youtubeUrl: String? = null,
//    val linkedinUrl: String? = null
//)
