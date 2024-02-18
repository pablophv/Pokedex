package com.example.consumirapis.data.remote.mappers

import com.example.consumirapis.data.remote.dto.TypeDTO
import com.example.consumirapis.domain.model.PokemonType

object TypeMapper {
    fun dtoToDomain(typeDto: TypeDTO): PokemonType {
        return PokemonType(
            name = typeDto.type.name
        )
    }
}