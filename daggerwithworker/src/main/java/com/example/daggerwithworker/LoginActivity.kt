package com.example.daggerwithworker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent = (applicationContext as MyApplication)
            .appComponent.loginComponent().create()

        loginComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        executeWorker()
    }

    private fun executeWorker() {
        val workRequest = OneTimeWorkRequestBuilder<UserWorker>().build()
        WorkManager.getInstance(applicationContext)
            .enqueue(workRequest)
    }
}