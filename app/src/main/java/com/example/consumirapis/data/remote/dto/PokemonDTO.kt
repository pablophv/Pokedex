package com.example.consumirapis.data.remote.dto

data class PokemonDTO(

    val base_experience: Int,
    val height: Int,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val name: String,
    val order: Int,
    val past_abilities: List<Any>,
    val past_types: List<Any>,
    val sprites: SpritesDTO,
    val stats: List<StatDTO>,
    val types: List<TypeDTO>,
    val weight: Int
)