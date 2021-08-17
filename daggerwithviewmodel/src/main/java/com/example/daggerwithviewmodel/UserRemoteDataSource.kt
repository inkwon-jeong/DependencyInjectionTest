package com.example.daggerwithviewmodel

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val userService: UserService
) : DataSource