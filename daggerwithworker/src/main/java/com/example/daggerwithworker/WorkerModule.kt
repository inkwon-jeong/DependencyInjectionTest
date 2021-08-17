package com.example.daggerwithworker

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerFactory
import androidx.work.WorkerParameters
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

@Module
abstract class WorkerModule {

    @Binds
    @IntoMap
    @WorkerKey(UserWorker::class)
    abstract fun bindUserWorker(factory: UserWorker.Factory): ChildWorkerFactory
}

class WorkerFactory @Inject constructor(
    private val workerFactories: Map<Class<out ListenableWorker>,
        @JvmSuppressWildcards Provider<ChildWorkerFactory>>
) : WorkerFactory() {
    override fun createWorker(
        appContext: Context,
        workerClassName: String,
        workerParameters: WorkerParameters
    ): ListenableWorker {
        val foundEntry =
            workerFactories.entries.find { Class.forName(workerClassName).isAssignableFrom(it.key) }
        val factoryProvider = foundEntry?.value
            ?: throw IllegalArgumentException("unknown worker class name: $workerClassName")
        return factoryProvider.get().create(appContext, workerParameters)
    }
}

interface ChildWorkerFactory {
    fun create(appContext: Context, params: WorkerParameters): ListenableWorker
}

@MapKey
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class WorkerKey(val value: KClass<out ListenableWorker>)