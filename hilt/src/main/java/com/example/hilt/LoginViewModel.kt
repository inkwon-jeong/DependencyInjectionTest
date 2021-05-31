package com.example.hilt

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
)