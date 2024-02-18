package com.example.consumirapis.data.repository

import com.example.consumirapis.data.remote.mappers.PokemonMapper
import com.example.consumirapis.data.remote.service.ApiService
import com.example.consumirapis.domain.model.Pokemon
import com.example.consumirapis.domain.repository.PokemonRepository
import javax.inject.Inject

//clase que implementa la interfaz PokemonRepository
class PokemonRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
): PokemonRepository {

    override suspend fun getPokemon(id: Int): Pokemon {
        val pokemonDto = apiService.getPokemon(id)
        return PokemonMapper.dtoToDomain(pokemonDto) //mapeamos el dto a un modelo de dominio
    }
}