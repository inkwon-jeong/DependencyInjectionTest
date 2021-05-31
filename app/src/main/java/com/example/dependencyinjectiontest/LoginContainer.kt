package com.example.dependencyinjectiontest

class LoginContainer(
    private val userRepository: UserRepository
) {

    val loginViewModel get() = LoginViewModel(userRepository)
}