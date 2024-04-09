package com.example.mealzapp.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealzapp.data.JokeResponse
import com.example.mealzapp.networking.joke.JokeRetrofit
import kotlinx.coroutines.launch

class JokeViewModel:ViewModel() {
    val joke=MutableLiveData<JokeResponse>()
    init {
        getJokeRandomly()
    }
     fun getJokeRandomly(){
        viewModelScope.launch {
         joke.postValue(JokeRetrofit.apiService.getJoke())
        }
    }
}