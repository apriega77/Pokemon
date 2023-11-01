package com.apriega77.pokemon.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.apriega77.pokemon.model.Pokemon

@Composable
fun PokemonItemView(pokemon: Pokemon, onItemClickListener: (String) -> Unit) {
    Box(modifier = Modifier.size(100.dp, 150.dp).padding(16.dp).clickable { onItemClickListener(pokemon.url) }) {
        AsyncImage(
            model = pokemon.url,
            contentDescription = pokemon.name,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Text(text = pokemon.name, modifier = Modifier.align(Alignment.Center))
    }
}