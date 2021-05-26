package com.example.dependencyinjectiontest

import android.app.Application

class MyApplication : Application() {

  val appContainer = AppContainer(applicationContext)
}