package com.example.dependencyinjectiontest.data

import android.content.Context

class UserLocalDataSource(
    private val context: Context
) : DataSource