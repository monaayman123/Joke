package com.example.mealzapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mealzapp.R
import com.example.mealzapp.data.CategoriesResponse
import com.example.mealzapp.databinding.MealsItemBinding

class MealzAdapter: RecyclerView.Adapter<MealzAdapter.MyViewHolder>() {

    private val list_item= emptyList<CategoriesResponse>()
    class MyViewHolder(itemView:View) :ViewHolder(itemView){
      val binding=MealsItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.meals_item,parent,false))
    }

    override fun getItemCount(): Int {
      return list_item.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentItem=list_item[position]
        holder.binding.text.text= currentItem.categories.component2().toString()

    }
}


