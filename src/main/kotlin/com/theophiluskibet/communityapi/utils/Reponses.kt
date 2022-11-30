package com.theophiluskibet.communityapi.utils

data class SuccessResponse(
    val success: Boolean,
    val message: String,
    val data: Any?
)