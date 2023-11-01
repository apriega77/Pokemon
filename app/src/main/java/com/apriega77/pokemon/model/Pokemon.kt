package com.apriega77.pokemon.model

data class Pokemon(val url: String, val name: String) {
    companion object {
        val init = Pokemon("", "")
    }
}