package com.example.hiltwithmultimodule

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
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