package com.juanvilla.freshgifs.data.source.remote.trending

import com.juanvilla.freshgifs.core.entity.GifWrapper
import com.juanvilla.freshgifs.core.util.Result

interface TrendingRemoteDataSource {
    fun getTrendingGifs(
        offset: Int,
        rating: String,
        limit: Int = 25
    ): Result<GifWrapper>
}