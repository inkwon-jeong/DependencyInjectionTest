package com.example.daggerwithworker

import dagger.Binds
import dagger.Module
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class LocalDataSource

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RemoteDataSource

@Module
abstract class DataSourceModule {
    @Binds
    @LocalDataSource
    abstract fun bindLocalDataSource(dataSource: UserLocalDataSource): DataSource

    @Binds
    @RemoteDataSource
    abstract fun bindRemoteDataSource(dataSource: UserRemoteDataSource): DataSource
}