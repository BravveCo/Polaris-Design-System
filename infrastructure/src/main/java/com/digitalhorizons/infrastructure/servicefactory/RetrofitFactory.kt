package com.digitalhorizons.infrastructure.servicefactory

import okhttp3.MediaType.Companion.toMediaType
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

const val TYPE = "application/json; charset=UTF8"
val json = Json { ignoreUnknownKeys = true }


object RetrofitFactory {
    inline fun <reified T> createRetrofit(okHttpClient: OkHttpClient, url: String): T {
        return Retrofit.Builder()
            .baseUrl(url)
            .client(okHttpClient)
            .addConverterFactory(
                json.asConverterFactory(
                    TYPE.toMediaType()
                )
            )
            .build()
            .create(T::class.java)
    }
}