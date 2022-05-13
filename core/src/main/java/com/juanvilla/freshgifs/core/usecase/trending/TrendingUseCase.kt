package com.juanvilla.freshgifs.core.usecase.trending

import com.juanvilla.freshgifs.core.entity.GifWrapper

interface TrendingUseCase {
    fun getTrendingGifs(
        offset: Int,
        rating: String,
        limit: Int = 25
    ): GifWrapper
}