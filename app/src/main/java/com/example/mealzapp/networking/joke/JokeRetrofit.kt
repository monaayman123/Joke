package com.example.mealzapp.networking.joke

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object JokeRetrofit {
    private val BASE_URL="https://v2.jokeapi.dev/"
    private val retrofit=Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}