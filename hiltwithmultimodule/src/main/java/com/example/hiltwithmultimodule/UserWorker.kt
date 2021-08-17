package com.example.hiltwithmultimodule

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.dependencyinjectiontest.core.UserRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class UserWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters,
    val userRepository: UserRepository
) : Worker(context, params) {

    override fun doWork(): Result {
        return Result.success()
    }
}

