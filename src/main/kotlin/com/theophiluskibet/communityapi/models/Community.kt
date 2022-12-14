package com.theophiluskibet.communityapi.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "communities")
data class Community(
    @Id
    val id: Long,
    val name: String,
    val members: Int,
    val dateStarted: Long,
    val description: String
)
