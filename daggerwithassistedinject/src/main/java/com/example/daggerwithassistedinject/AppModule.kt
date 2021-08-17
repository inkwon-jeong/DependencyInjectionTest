package com.example.daggerwithassistedinject

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module

@AssistedModule
@Module(includes = [AssistedInject_AppModule::class])
class AppModule