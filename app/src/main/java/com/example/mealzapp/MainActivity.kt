package com.example.mealzapp

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mealzapp.databinding.ActivityMainBinding
import com.example.mealzapp.model.JokeViewModel
import com.example.mealzapp.networking.JokeRetrofit

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
   val viewModel :JokeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
       binding.viewModel=viewModel
        binding.lifecycleOwner=this


    }
}