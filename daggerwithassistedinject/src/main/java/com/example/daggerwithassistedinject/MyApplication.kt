package com.example.daggerwithassistedinject

import android.app.Application

class MyApplication : Application() {

    val appComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}