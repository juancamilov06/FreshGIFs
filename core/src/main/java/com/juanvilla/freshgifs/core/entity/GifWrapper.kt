package com.juanvilla.freshgifs.core.entity

data class GifWrapper(
    val gifs: List<Gif>,
    val pagination: Pagination
)