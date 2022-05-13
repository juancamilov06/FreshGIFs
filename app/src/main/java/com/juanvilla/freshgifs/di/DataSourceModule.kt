package com.juanvilla.freshgifs.di

import com.juanvilla.freshgifs.data.source.remote.search.SearchRemoteDataSource
import com.juanvilla.freshgifs.data.source.remote.search.SearchRemoteDataSourceImpl
import com.juanvilla.freshgifs.data.source.remote.trending.TrendingRemoteDataSource
import com.juanvilla.freshgifs.data.source.remote.trending.TrendingRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
interface DataSourceModule {

    @Binds
    @Singleton
    fun bindTrendingRemoteDataSource(
        trendingRemoteDataSourceImpl: TrendingRemoteDataSourceImpl
    ): TrendingRemoteDataSource

    @Binds
    @Singleton
    fun bindSearchRemoteDataSource(
        searchRemoteDataSourceImpl: SearchRemoteDataSourceImpl
    ): SearchRemoteDataSource
}