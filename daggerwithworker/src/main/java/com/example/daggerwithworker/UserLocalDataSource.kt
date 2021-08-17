package com.example.daggerwithworker

import android.content.Context
import javax.inject.Inject

class UserLocalDataSource @Inject constructor(
    private val context: Context
) : DataSource