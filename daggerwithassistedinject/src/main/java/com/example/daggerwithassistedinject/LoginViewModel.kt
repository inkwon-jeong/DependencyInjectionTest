package com.example.daggerwithassistedinject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import javax.inject.Inject

class LoginViewModel @AssistedInject constructor(
    @Assisted private val userName: String,
    private val userRepository: UserRepository
) : ViewModel() {

    companion object {
        fun getViewModelFactory(
            factory: Factory,
            userName: String
        ) = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return factory.create(userName) as T
            }
        }
    }

    @AssistedInject.Factory
    interface Factory {
        fun create(userName: String): LoginViewModel
    }
}