package com.example.mealzapp.networking

import com.example.mealzapp.data.JokeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {
    @GET("joke/Any")
  suspend  fun getJoke(): JokeResponse
}