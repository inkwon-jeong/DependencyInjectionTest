package com.example.dependencyinjectiontest

class UserRepository(
  private val localDataSource: DataSource,
  private val remoteDataSource: DataSource
)