package com.apriega77.pokemon

import androidx.lifecycle.ViewModel
import com.apriega77.pokemon.model.Pokemon

class PokemonViewModel : ViewModel() {
    val data = listOf(
        Pokemon(name = "bulbasaur", url = "https://img.pokemondb.net/artwork/large/bulbasaur.jpg"),
        Pokemon(name = "ivysaur", url = "https://img.pokemondb.net/artwork/large/ivysaur.jpg"),
        Pokemon(name = "venusaur", url = "https://img.pokemondb.net/artwork/large/venusaur.jpg"),
        Pokemon(name = "charmander", url = "https://img.pokemondb.net/artwork/large/charmander.jpg"),
        Pokemon(name = "charmeleon", url = "https://img.pokemondb.net/artwork/large/charmeleon.jpg"),
        Pokemon(name = "charizard", url = "https://img.pokemondb.net/artwork/large/charizard.jpg"),
        Pokemon(name = "squirtle", url = "https://img.pokemondb.net/artwork/large/squirtle.jpg"),
        Pokemon(name = "squirtle", url = "https://img.pokemondb.net/artwork/large/squirtle.jpg"),
        Pokemon(name = "wartortle", url = "https://img.pokemondb.net/artwork/large/wartortle.jpg"),
        Pokemon(name = "blastoise", url = "https://img.pokemondb.net/artwork/large/blastoise.jpg")
    )


}