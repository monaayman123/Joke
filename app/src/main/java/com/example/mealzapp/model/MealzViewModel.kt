package com.example.mealzapp.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealzapp.repository.MealzRepository
import kotlinx.coroutines.launch

class MealzViewModel:ViewModel() {
    private val repository=MealzRepository()
    fun getMealz(){
        viewModelScope.launch {
            repository.getAllMealz()
        }
    }
}