package com.apriega77.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.apriega77.pokemon.screen.PokemonScreen

class MainActivity : AppCompatActivity() {

    private val viewModel: PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokemonScreen(viewModel.data)
        }
    }
}