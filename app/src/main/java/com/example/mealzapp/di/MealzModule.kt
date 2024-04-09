package com.example.mealzapp.di

import com.example.mealzapp.networking.joke.ApiService
import com.example.mealzapp.networking.joke.JokeRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MealzModule {
    @Provides
    fun provideString():String{
        return "I am injected"
    }
    @Provides
    @Singleton
    fun provideRetrofit():Retrofit{
        val BASE_URL="https://v2.jokeapi.dev/"
        val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
    @Provides
    @Singleton
    fun provideServices(retrofit: Retrofit):ApiService{
        val apiService= retrofit.create(ApiService::class.java)
        return apiService
    }
}