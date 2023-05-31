package com.example.moviesapplication.movies_list.data.setup.di

import com.example.moviesapplication.movies_list.data.api.MoviesListApiService
import com.example.moviesapplication.movies_list.data.datasource.remote.MoviesListRemoteDataSource
import com.example.moviesapplication.movies_list.data.datasource.remote.impl.MoviesListRemoteDataSourceImpl
import com.example.moviesapplication.movies_list.domain.repository.MoviesListRepository
import com.example.moviesapplication.movies_list.data.repository.impl.MoviesListRepositoryImpl
import org.koin.dsl.module
import retrofit2.Retrofit

val moviesListDataModule = module {

    factory<MoviesListRepository> { MoviesListRepositoryImpl(moviesListRemoteDataSource = get()) }

    factory<MoviesListRemoteDataSource> { MoviesListRemoteDataSourceImpl(moviesListApiService = get()) }

    factory { get<Retrofit>().create(MoviesListApiService::class.java) }
}