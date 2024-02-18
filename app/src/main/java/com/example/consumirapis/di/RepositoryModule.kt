package com.example.consumirapis.di

import com.example.consumirapis.data.remote.service.ApiService
import com.example.consumirapis.data.repository.PokemonRepositoryImpl
import com.example.consumirapis.domain.repository.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        apiService: ApiService
    ): PokemonRepository = PokemonRepositoryImpl(apiService)
}