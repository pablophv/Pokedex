package com.example.consumirapis.domain.usecases

import com.example.consumirapis.domain.model.Pokemon
import com.example.consumirapis.domain.repository.PokemonRepository
import javax.inject.Inject

class GetPokemonDetailsUseCase @Inject constructor(
    private val pokemonRepository: PokemonRepository
) {
    suspend operator fun invoke(id: Int): Pokemon {
        return pokemonRepository.getPokemon(id)
    }
}