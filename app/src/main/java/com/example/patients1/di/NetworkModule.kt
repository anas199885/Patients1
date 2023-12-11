package com.example.patients1.di

import com.example.patients1.datasource.PatientsDataSource
import com.example.patients1.repository.PatientsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    const val baseURL = "https://patients-app-api.herokuapp.com/"

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun  providePatientsDataSource(retrofit: Retrofit): PatientsDataSource {
        return  retrofit.create(PatientsDataSource::class.java)
    }

    @Provides
    @Singleton
    fun  provideRepo(dataSource: PatientsDataSource): PatientsRepository {
        return  PatientsRepository(dataSource)
    }

}