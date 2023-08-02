package com.example.herorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.herorecyclerview.adapter.SuperHeroAdapter
import com.example.herorecyclerview.databinding.ActivityMainBinding
import com.example.herorecyclerview.model.SuperHero
import com.example.herorecyclerview.model.SuperHeroProvider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superHeroList) { onItemSelected(it) }

    }

    private fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.name, Toast.LENGTH_SHORT).show()
    }
}