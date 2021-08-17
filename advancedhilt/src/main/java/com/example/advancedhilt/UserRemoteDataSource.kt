package com.example.advancedhilt

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val userService: UserService
) : DataSource