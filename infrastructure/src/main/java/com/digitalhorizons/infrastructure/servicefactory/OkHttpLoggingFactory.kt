package com.digitalhorizons.infrastructure.servicefactory

import okhttp3.logging.HttpLoggingInterceptor
import com.digitalhorizons.infrastructure.BuildConfig

private const val TAG = "okhttp"

object OkHttpLoggingFactory {
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG)
                HttpLoggingInterceptor.Level.BODY
            else
                HttpLoggingInterceptor.Level.NONE
        }
}