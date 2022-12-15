package com.theophiluskibet.communityapi.models

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
    val id: String? = null,
    val email: String,
    val firstName: String,
    val lastName: String,
    val password: String
)
