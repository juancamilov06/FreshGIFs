package com.juanvilla.freshgifs.data.source.remote.entities

data class ApiUser(
    val avatarUrl: String,
    val bannerUrl: String,
    val profileUrl: String,
    val username: String,
    val displayName: String
)