package com.example.mealzapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mealzapp.R
import com.example.mealzapp.databinding.ActivityMainBinding
import com.example.mealzapp.model.JokeViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
   @Inject lateinit var injectedField:String
   val viewModel :JokeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
      binding.viewModel=viewModel
        binding.lifecycleOwner=this
        Toast.makeText(this,injectedField,Toast.LENGTH_LONG).show()


    }
}