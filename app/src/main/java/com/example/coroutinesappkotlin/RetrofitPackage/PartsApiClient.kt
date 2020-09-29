package com.example.coroutinesappkotlin.RetrofitPackage

import com.example.coroutinesappkotlin.ModelPackage.MovieModel
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface PartsApiClient {

    @GET
    fun getPartsAsync(@Url url: String): Deferred<Response<MovieModel>>
}
