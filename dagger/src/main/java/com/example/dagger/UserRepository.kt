package com.example.dagger

import javax.inject.Inject

class UserRepository @Inject constructor(
    @LocalDataSource private val localDataSource: DataSource,
    @RemoteDataSource private val remoteDataSource: DataSource
)