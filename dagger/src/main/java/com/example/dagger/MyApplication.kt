package com.example.dagger

import android.app.Application

class MyApplication : Application() {

    val appComponent = DaggerAppComponent.factory().create(applicationContext)
}