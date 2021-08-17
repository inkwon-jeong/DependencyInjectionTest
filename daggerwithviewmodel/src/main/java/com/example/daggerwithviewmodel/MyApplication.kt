package com.example.daggerwithviewmodel

import android.app.Application

class MyApplication : Application() {

    val appComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}