package com.alimmz.steptracker.app

import android.content.Context
import coil.ImageLoader
import coil.decode.SvgDecoder
import coil.decode.VideoFrameDecoder
import coil.util.DebugLogger
import com.alimmz.steptracker.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.ConnectionSpec
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideJson() = Json {
        prettyPrint = true
        isLenient = true
        ignoreUnknownKeys = true
        explicitNulls = false
        allowStructuredMapKeys = true
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().apply {
            connectionSpecs(listOf(ConnectionSpec.RESTRICTED_TLS))
            connectTimeout(20, TimeUnit.SECONDS)
            addInterceptor(
                HttpLoggingInterceptor().apply {
                    setLevel(HttpLoggingInterceptor.Level.BODY)
                }
            )
        }.build()
    }


    @Provides
    @Singleton
    fun imageLoader(
        okHttpCallFactory: OkHttpClient,
        @ApplicationContext application: Context,
    ): ImageLoader = ImageLoader.Builder(application)
        .callFactory(okHttpCallFactory)
        .components {
            add(SvgDecoder.Factory())
            add(VideoFrameDecoder.Factory())
        }
        .crossfade(true)
        .apply {
            if (BuildConfig.DEBUG) {
                logger(DebugLogger())
            }
        }
        .build()
}