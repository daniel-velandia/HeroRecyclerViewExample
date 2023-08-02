package com.example.herorecyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.herorecyclerview.databinding.ItemSuperHeroBinding
import com.example.herorecyclerview.model.SuperHero

class SuperHeroHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemSuperHeroBinding.bind(view)

    fun render(superHero: SuperHero, onItemSelected: (SuperHero) -> Unit) {

        binding.tvSuperHeroName.text = superHero.name
        binding.tvSuperHeroRealName.text = superHero.realName
        binding.tvSuperHeroPublisher.text = superHero.publisher

        Glide.with(binding.tvSuperHeroName.context)
            .load(superHero.photo)
            .into(binding.ivSuperHeroPhoto)

        itemView.setOnClickListener { onItemSelected(superHero) }
    }
}