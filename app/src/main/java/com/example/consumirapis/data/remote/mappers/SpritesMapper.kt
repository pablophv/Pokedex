package com.example.consumirapis.data.remote.mappers

import com.example.consumirapis.data.remote.dto.SpritesDTO
import com.example.consumirapis.domain.model.PokemonSprites

object SpritesMapper {
    fun dtoToDomain(spritesDto: SpritesDTO): PokemonSprites {
        return PokemonSprites(
            front_default = spritesDto.front_default ?: "",
            back_default = spritesDto.back_default ?: ""
        )
    }
}