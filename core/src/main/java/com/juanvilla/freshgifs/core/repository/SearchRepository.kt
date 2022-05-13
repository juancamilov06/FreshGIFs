package com.juanvilla.freshgifs.core.repository

import com.juanvilla.freshgifs.core.entity.GifWrapper

interface SearchRepository {
    fun searchByName(
        name: String,
        offset: Int,
        rating: String,
        limit: Int = 25
    ): GifWrapper
}