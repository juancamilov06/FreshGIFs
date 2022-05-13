package com.juanvilla.freshgifs.data.source.remote.entities

import com.google.gson.annotations.SerializedName

data class ApiMeta(
    val status: Int,
    val msg: String,
    @SerializedName("request_id")
    val requestId: String
)