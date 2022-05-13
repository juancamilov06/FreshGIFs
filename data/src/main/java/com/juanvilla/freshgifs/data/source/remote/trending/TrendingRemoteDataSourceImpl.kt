package com.juanvilla.freshgifs.data.source.remote.trending

import com.juanvilla.freshgifs.core.entity.GifWrapper
import com.juanvilla.freshgifs.core.util.Result

class TrendingRemoteDataSourceImpl : TrendingRemoteDataSource {
    override fun getTrendingGifs(offset: Int, rating: String, limit: Int): Result<GifWrapper> {
        TODO("Not yet implemented")
    }
}