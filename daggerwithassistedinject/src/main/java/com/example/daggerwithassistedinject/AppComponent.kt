package com.example.daggerwithassistedinject

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        NetworkModule::class,
        DataSourceModule::class,
        SubcomponentsModule::class,
        AppModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun loginComponent(): LoginComponent.Factory
}