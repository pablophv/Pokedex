package com.example.consumirapis.domain.repository

import com.example.consumirapis.domain.model.Pokemon

interface PokemonRepository {
    suspend fun getPokemon(id: Int): Pokemon
}