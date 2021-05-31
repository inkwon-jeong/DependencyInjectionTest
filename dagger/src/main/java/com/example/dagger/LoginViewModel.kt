package com.example.dagger

import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
)