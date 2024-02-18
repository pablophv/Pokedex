package com.example.consumirapis.di

import com.example.consumirapis.data.remote.service.ApiService
import com.example.consumirapis.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/*
la anotacion @Module nos indica que esta clase es un modulo Dagger Hilt, los modulos proporcionan
instancias de clases que se pueden inyectar en otras clases.
este modulo proporciona la instancia de retrofit y apiService para la inyeccion de dependencias
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {//crea y devuelve una instancia de retrofit
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {//recibe una instancia de retrofit como parametro, y devuelve una instancia de ApiService
        return retrofit.create(ApiService::class.java)
    }
}