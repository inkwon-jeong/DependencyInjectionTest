package com.example.daggerwithassistedinject

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class NetworkModule {

    @Provides
    fun provideUserService(): UserService =
        Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(UserService::class.java)
}