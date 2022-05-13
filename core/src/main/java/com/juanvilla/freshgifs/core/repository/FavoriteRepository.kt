package com.juanvilla.freshgifs.core.repository

import com.juanvilla.freshgifs.core.entity.Gif

interface FavoriteRepository {
    fun save(gif: Gif): Long
    fun delete(id: String)
}