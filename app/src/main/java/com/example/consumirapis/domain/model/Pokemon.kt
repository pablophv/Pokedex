package com.example.consumirapis.domain.model

import com.example.consumirapis.data.remote.dto.SpritesDTO
import com.example.consumirapis.data.remote.dto.StatDTO
import com.example.consumirapis.data.remote.dto.TypeDTO

data class Pokemon(
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
    val stats: List<PokemonStat>,
    val types: List<PokemonType>,
    val weight: Int
)

