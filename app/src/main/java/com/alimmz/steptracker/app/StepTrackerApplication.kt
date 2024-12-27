package com.alimmz.steptracker.app

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import com.alimmz.steptracker.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Provider

@HiltAndroidApp
class StepTrackerApplication : Application(), ImageLoaderFactory {

    @Inject
    lateinit var imageLoader: Provider<ImageLoader>

    override fun newImageLoader(): ImageLoader = imageLoader.get()

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }
}