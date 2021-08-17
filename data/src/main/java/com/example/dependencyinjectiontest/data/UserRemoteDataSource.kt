package com.example.dependencyinjectiontest.data

import retrofit2.Retrofit


class UserRemoteDataSource : DataSource {

    private val userService =
        Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(UserService::class.java)
}