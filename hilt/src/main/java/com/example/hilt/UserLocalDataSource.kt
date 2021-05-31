package com.example.hilt

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class UserLocalDataSource @Inject constructor(
    @ApplicationContext private val context: Context
) : DataSource