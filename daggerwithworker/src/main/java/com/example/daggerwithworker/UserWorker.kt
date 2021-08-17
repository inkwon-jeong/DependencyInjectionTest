package com.example.daggerwithworker

import android.content.Context
import android.util.Log
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import javax.inject.Inject

class UserWorker(
    context: Context,
    params: WorkerParameters,
    val userRepository: UserRepository
) : Worker(context, params) {

    override fun doWork(): Result {
        return Result.success()
    }

    class Factory @Inject constructor(
        private val userRepository: UserRepository
    ) : ChildWorkerFactory {
        override fun create(appContext: Context, params: WorkerParameters): ListenableWorker {
            return UserWorker(appContext, params, userRepository)
        }
    }
}

