package com.juanvilla.freshgifs.data.source.remote.search

import com.juanvilla.freshgifs.core.entity.GifWrapper
import com.juanvilla.freshgifs.core.util.Result

class SearchRemoteDataSourceImpl : SearchRemoteDataSource {
    override fun getGifsByName(
        name: String,
        offset: Int,
        rating: String,
        limit: Int
    ): Result<GifWrapper> {
        TODO("Not yet implemented")
    }
}