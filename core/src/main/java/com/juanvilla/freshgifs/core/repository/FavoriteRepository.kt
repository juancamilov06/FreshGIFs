package com.juanvilla.freshgifs.core.repository

import com.juanvilla.freshgifs.core.entity.Gif
import com.juanvilla.freshgifs.core.entity.GifWrapper

interface FavoriteRepository {
    fun save(gif: Gif): Result<Long>
    fun delete(id: String): Result<Unit>
    fun findAll(): Result<GifWrapper>
}