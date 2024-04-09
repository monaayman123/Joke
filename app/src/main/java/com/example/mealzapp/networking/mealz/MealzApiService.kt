package com.example.mealzapp.networking.mealz

import com.example.mealzapp.data.CategoriesResponse
import retrofit2.Response
import retrofit2.http.GET

interface MealzApiService {

    @GET("categories.php")
   suspend fun getAllMealz():Response<CategoriesResponse>

}