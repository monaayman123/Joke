package com.example.mealzapp.networking.mealz

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

abstract class MealzRetrofit {

    companion object{
        private val BASE_URL="https://www.themealdb.com/api/json/v1/1/"

      private  val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService= retrofit.create(MealzApiService::class.java)
    }

}