package com.example.mealzapp.model

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealzapp.repository.MealzRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealzViewModel @Inject constructor(
    private val repository:MealzRepository
):ViewModel() {

    fun getMealz(){
        viewModelScope.launch {
            try {
                repository.getAllMealz()
            }catch (e:Exception){
                Log.i("mealz",e.message.toString())
            }


        }
    }
}