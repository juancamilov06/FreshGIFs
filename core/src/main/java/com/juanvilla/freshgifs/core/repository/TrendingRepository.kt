package com.juanvilla.freshgifs.core.repository

import com.juanvilla.freshgifs.core.entity.GifWrapper

interface TrendingRepository {
    fun getTrending(
        offset: Int,
        rating: String,
        limit: Int = 25
    ): GifWrapper
}