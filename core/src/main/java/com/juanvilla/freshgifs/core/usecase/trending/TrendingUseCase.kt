package com.juanvilla.freshgifs.core.usecase.trending

import com.juanvilla.freshgifs.core.entity.GifWrapper
import com.juanvilla.freshgifs.core.util.Result

interface TrendingUseCase {
    fun getTrendingGifs(
        offset: Int,
        rating: String,
        limit: Int = 25
    ): Result<GifWrapper>
}