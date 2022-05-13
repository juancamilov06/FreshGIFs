package com.juanvilla.freshgifs.core.entity

data class Gif(
    val type: String,
    val id: String,
    val slug: String,
    val url: String,
    val bitlyUrl: String,
    val embedUrl: String,
    val username: String,
    val source: String,
    val rating: String,
    val updateDateTime: String,
    val createDateTime: String,
    val importDateTime: String,
    // Date when marked as trending
    val trendingDateTime: String,
    val title: String,
    val user: User
)