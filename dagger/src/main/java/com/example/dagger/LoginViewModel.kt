package com.example.dagger

import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
)