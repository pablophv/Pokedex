package com.example.consumirapis.data.remote.service


import com.example.consumirapis.data.remote.dto.PokemonDTO
import retrofit2.http.GET
import retrofit2.http.Path

/*
la interfaz apiService utiliza la funcion getPokemon para obtener informacion de un pokemon especifico
haciendo una llamada Api Rest, a traves de retrofit. Retrofit esta configurado en el modulo Dagger Hilt
 */
interface ApiService {
    @GET("pokemon/{id}")
    suspend fun getPokemon(@Path("id") id: Int): PokemonDTO
}

