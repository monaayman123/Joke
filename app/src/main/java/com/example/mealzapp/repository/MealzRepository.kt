package com.example.mealzapp.repository

import com.example.mealzapp.networking.mealz.MealzRetrofit

class MealzRepository() {
    suspend fun getAllMealz()=MealzRetrofit.apiService.getAllMealz()
}