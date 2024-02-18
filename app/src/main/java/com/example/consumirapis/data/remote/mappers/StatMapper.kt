package com.example.consumirapis.data.remote.mappers

import com.example.consumirapis.data.remote.dto.StatDTO
import com.example.consumirapis.domain.model.PokemonStat

object StatMapper {
    fun dtoToDomain(statDto: StatDTO): PokemonStat {
        return PokemonStat(
            baseStat = statDto.base_stat,
            effort = statDto.effort,
            name = statDto.stat.name
        )
    }
}