package com.example.daggerwithworker

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val userService: UserService
) : DataSource