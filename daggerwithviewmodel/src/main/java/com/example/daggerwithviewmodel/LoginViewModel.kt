package com.example.daggerwithviewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel()