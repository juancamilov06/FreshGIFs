package com.juanvilla.freshgifs.core.usecase.search

import com.juanvilla.freshgifs.core.entity.GifWrapper

interface SearchUseCase {
    fun searchGifByName(
        name: String,
        offset: Int,
        rating: String,
        limit: Int = 25
    ): Result<GifWrapper>
}