package com.example.mealzapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object MealzModule {
    @Provides
    fun provideString():String{
        return "I am injected"
    }
}