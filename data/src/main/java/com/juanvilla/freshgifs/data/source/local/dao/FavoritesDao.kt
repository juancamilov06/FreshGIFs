package com.juanvilla.freshgifs.data.source.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.juanvilla.freshgifs.data.source.local.entities.DbGif
import com.juanvilla.freshgifs.data.source.local.entities.DbUser

@Dao
interface FavoritesDao {
    @Query(
        "SELECT * FROM gif as g " +
        "JOIN user on user.username = g.username"
    )
    suspend fun findAll(): Map<DbGif, DbUser>
}