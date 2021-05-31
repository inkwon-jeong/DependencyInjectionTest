package com.example.dependencyinjectiontest

class UserRemoteDataSource(
    private val userService: UserService
) : DataSource