package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun provideUserService(): UserService =
        Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(UserService::class.java)
}