package com.example.dagger

import android.app.Activity
import android.os.Bundle
import javax.inject.Inject

class LoginActivity : Activity() {
    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent = (applicationContext as MyApplication)
            .appComponent.loginComponent().create()

        loginComponent.inject(this)
        super.onCreate(savedInstanceState)
    }
}