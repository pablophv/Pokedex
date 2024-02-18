package com.example.consumirapis.data.remote.mappers

import com.example.consumirapis.data.remote.dto.PokemonDTO
import com.example.consumirapis.domain.model.Pokemon

object PokemonMapper {
    fun dtoToDomain(pokemonDto: PokemonDTO): Pokemon {
        return Pokemon(
            base_experience = pokemonDto.base_experience,
            height = pokemonDto.height,
            id = pokemonDto.id,
            is_default = pokemonDto.is_default,
            location_area_encounters = pokemonDto.location_area_encounters,
            name = pokemonDto.name,
            order = pokemonDto.order,
            past_abilities = pokemonDto.past_abilities, // Asumiendo que esto se maneja como una lista de Any actualmente
            past_types = pokemonDto.past_types, // Similar a past_abilities
            sprites = pokemonDto.sprites, // Asegúrate de tener un mapper si es necesario
            stats = pokemonDto.stats.map(StatMapper::dtoToDomain), // Usa StatMapper para convertir
            types = pokemonDto.types.map(TypeMapper::dtoToDomain), // Usa TypeMapper para convertir
            weight = pokemonDto.weight
        )
    }
}