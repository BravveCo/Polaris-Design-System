package com.digitalhorizons.infrastructure.servicefactory

import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber

private const val TAG = "okhttp"

object OkHttpLoggingFactory {
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor { message -> Timber.tag(TAG).d(message) }.apply {
            level = if (true)
                HttpLoggingInterceptor.Level.BODY
            else
                HttpLoggingInterceptor.Level.BODY
        }
}