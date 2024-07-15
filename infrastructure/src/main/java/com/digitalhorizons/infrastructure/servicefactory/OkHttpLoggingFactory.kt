package com.digitalhorizons.infrastructure.servicefactory

import android.util.Log
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber

private const val TAG = "okhttp"

object OkHttpLoggingFactory {
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply {
            level = if (true)
                HttpLoggingInterceptor.Level.BODY
            else
                HttpLoggingInterceptor.Level.BODY
        }
}