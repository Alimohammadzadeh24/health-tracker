package com.alimmz.steptracker.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(SingletonComponent::class)
object CoroutinesDispatchersModule {

    @Module
    @InstallIn(SingletonComponent::class)
    object DispatchersModule {
        @Provides
        @Dispatcher(NiaDispatchers.IO)
        fun providesIODispatcher(): CoroutineDispatcher = Dispatchers.IO

        @Provides
        @Dispatcher(NiaDispatchers.Default)
        fun providesDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default
    }

}