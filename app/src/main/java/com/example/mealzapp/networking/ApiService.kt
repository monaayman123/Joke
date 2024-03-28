package com.example.mealzapp.networking

import com.example.mealzapp.data.JokeResponse
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @POST("joke/Any")
    fun getJoke(): JokeResponse
}