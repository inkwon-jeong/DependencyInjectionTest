package com.example.advancedhilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class LocalDataSource

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RemoteDataSource

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Binds
    @LocalDataSource
    abstract fun bindLocalDataSource(dataSource: UserLocalDataSource): DataSource

    @Binds
    @RemoteDataSource
    abstract fun bindRemoteDataSource(dataSource: UserRemoteDataSource): DataSource
}