package com.theophiluskibet.communityapi.utils

data class ResponseHandler(
    val code: Int,
    val success: Boolean,
    val message: String,
    val data: Any?
)