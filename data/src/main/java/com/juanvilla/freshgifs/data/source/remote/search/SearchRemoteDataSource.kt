package com.juanvilla.freshgifs.data.source.remote.search

import com.juanvilla.freshgifs.core.entity.GifWrapper
import com.juanvilla.freshgifs.core.util.Result

interface SearchRemoteDataSource {
    fun getGifsByName(
        name: String,
        offset: Int,
        rating: String,
        limit: Int = 25
    ): Result<GifWrapper>
}