package com.example.daggerwithworker

import android.app.Application
import androidx.work.Configuration

class MyApplication : Application(), Configuration.Provider {

    val appComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

    override fun getWorkManagerConfiguration(): Configuration {
        return Configuration.Builder()
            .setWorkerFactory(appComponent.workerFactory())
            .build()
    }

}