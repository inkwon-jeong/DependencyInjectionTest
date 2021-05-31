package com.example.hilt

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val userService: UserService
) : DataSource