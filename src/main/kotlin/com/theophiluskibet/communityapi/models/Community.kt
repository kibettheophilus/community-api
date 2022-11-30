package com.theophiluskibet.communityapi.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Community(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    val name: String,
    val members: Int,
    val dateStarted: Long
)
