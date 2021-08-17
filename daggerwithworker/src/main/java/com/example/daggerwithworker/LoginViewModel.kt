package com.example.daggerwithworker

import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
)