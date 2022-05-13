package com.juanvilla.freshgifs.data.source.local

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.juanvilla.freshgifs.data.source.local.dao.FavoritesDao
import com.juanvilla.freshgifs.data.source.local.dao.UserDao
import com.juanvilla.freshgifs.data.source.local.entities.DbGif
import com.juanvilla.freshgifs.data.source.local.entities.DbUser

@Database(entities = [DbGif::class, DbUser::class], version = 1, exportSchema = false)
abstract class GifDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao
    abstract fun getFavoritesDao(): FavoritesDao
}