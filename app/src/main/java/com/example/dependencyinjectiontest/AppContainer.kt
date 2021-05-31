package com.example.dependencyinjectiontest

import android.content.Context
import retrofit2.Retrofit

class AppContainer(
    private val context: Context
) {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://example.com")
        .build()
        .create(UserService::class.java)

    private val remoteDataSource = UserRemoteDataSource(retrofit)
    private val localDataSource = UserLocalDataSource(context)

    val userRepository = UserRepository(localDataSource, remoteDataSource)

    //  val loginViewModel get() = LoginViewModel(userRepository)
    var loginContainer: LoginContainer? = null
}