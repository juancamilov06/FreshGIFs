package com.juanvilla.freshgifs.core.usecase.favorite

import com.juanvilla.freshgifs.core.entity.Gif

interface FavoriteUseCase {
    fun saveGifToFavorites(gif: Gif): Long
    fun deleteGifFromFavorites(id: String)
}