package com.juanvilla.freshgifs.core.usecase.search

import com.juanvilla.freshgifs.core.entity.GifWrapper

class SearchUseCaseImpl : SearchUseCase {
    override fun searchGifByName(
        name: String,
        offset: Int,
        rating: String,
        limit: Int
    ): Result<GifWrapper> {
        TODO("Not yet implemented")
    }
}