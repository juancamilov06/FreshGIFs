package com.juanvilla.freshgifs.core.usecase.trending

import com.juanvilla.freshgifs.core.entity.GifWrapper
import com.juanvilla.freshgifs.core.util.Result

class TrendingUseCaseImpl : TrendingUseCase {
    override fun getTrendingGifs(offset: Int, rating: String, limit: Int): Result<GifWrapper> {
        TODO("Not yet implemented")
    }
}