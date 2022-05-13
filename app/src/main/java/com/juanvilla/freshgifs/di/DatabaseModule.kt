package com.juanvilla.freshgifs.di

import android.content.Context
import androidx.room.Room
import com.juanvilla.freshgifs.data.source.local.GifDatabase
import com.juanvilla.freshgifs.data.source.local.dao.FavoritesDao
import com.juanvilla.freshgifs.data.source.local.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): GifDatabase =
        Room.databaseBuilder(
            context,
            GifDatabase::class.java,
            "gif_database"
        ).build()

    @Provides
    @Singleton
    fun provideUserDao(
        gifDatabase: GifDatabase
    ): UserDao = gifDatabase.getUserDao()

    @Provides
    @Singleton
    fun provideFavoritesDao(
        gifDatabase: GifDatabase
    ): FavoritesDao = gifDatabase.getFavoritesDao()
}