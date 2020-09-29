package com.example.coroutinesappkotlin.RetrofitPackage

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class WebAccess {

    fun partsApi(): PartsApiClient {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org")
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()

        return retrofit.create(PartsApiClient::class.java)
    }

}
