package com.juanvilla.freshgifs.data.source.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.juanvilla.freshgifs.data.source.local.entities.DbUser

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(dbUser: DbUser): Long

    @Delete
    fun deleteUser(dbUser: DbUser)
}