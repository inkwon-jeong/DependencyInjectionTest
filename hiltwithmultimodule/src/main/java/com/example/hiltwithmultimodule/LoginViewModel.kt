package com.example.hiltwithmultimodule

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectiontest.core.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val userRepository: UserRepository
) : ViewModel()