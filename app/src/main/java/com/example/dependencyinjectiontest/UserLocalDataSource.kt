package com.example.dependencyinjectiontest

import android.content.Context

class UserLocalDataSource(
  private val context: Context
) : DataSource