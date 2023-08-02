package com.example.herorecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.herorecyclerview.R
import com.example.herorecyclerview.model.SuperHero

class SuperHeroAdapter(
    private val superHeroList: List<SuperHero>,
    private val onItemSelected: (SuperHero) -> Unit): RecyclerView.Adapter<SuperHeroHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroHolder(layoutInflater.inflate(R.layout.item_super_hero ,parent, false))
    }

    override fun getItemCount(): Int = superHeroList.size

    override fun onBindViewHolder(holder: SuperHeroHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item, onItemSelected)
    }
}