package com.juanvilla.freshgifs.core.repository

import com.juanvilla.freshgifs.core.entity.Gif

interface FavoriteRepository {
    fun save(gif: Gif)
    fun delete(id: String)
}