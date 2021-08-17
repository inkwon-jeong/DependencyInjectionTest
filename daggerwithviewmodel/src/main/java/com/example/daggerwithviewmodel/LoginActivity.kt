package com.example.daggerwithviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val loginViewModel by viewModels<LoginViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent = (applicationContext as MyApplication)
            .appComponent.loginComponent().create()

        loginComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}