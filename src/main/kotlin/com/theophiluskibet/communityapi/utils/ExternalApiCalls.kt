package com.theophiluskibet.communityapi.utils

import okhttp3.*
import java.io.IOException


fun makeApiCall() {
    val okHttpClient = OkHttpClient()

    val request = Request.Builder().url("https://dummyjson.com/products").build()

    okHttpClient.newCall(request).enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            println(e.stackTrace)
        }

        override fun onResponse(call: Call, response: Response) {
            println(response.body)
        }

    })
}