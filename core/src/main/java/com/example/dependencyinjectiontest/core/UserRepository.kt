package com.example.dependencyinjectiontest.core

import android.content.Context
import com.example.dependencyinjectiontest.data.UserLocalDataSource
import com.example.dependencyinjectiontest.data.UserRemoteDataSource
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class UserRepository @Inject constructor(
    @ApplicationContext context: Context
) {
    private val localDataSource = UserLocalDataSource(context)
    private val remoteDataSource = UserRemoteDataSource()
}