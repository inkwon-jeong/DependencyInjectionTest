package com.example.daggerwithassistedinject

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val userService: UserService
) : DataSource