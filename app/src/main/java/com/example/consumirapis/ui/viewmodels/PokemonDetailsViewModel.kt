package com.example.consumirapis.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.consumirapis.domain.usecases.GetPokemonDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//el view model manejara la logica de la aplicacion

@HiltViewModel
class PokemonDetailsViewModel @Inject constructor(
    private val getPokemonDetailsUseCase: GetPokemonDetailsUseCase
) : ViewModel() {

    fun getPokemon(id: Int) = liveData {
        val pokemon = getPokemonDetailsUseCase(id)
        emit(pokemon)
    }
}