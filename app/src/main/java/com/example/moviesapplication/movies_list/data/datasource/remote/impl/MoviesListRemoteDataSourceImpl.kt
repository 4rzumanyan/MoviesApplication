package com.example.moviesapplication.movies_list.data.datasource.remote.impl

import com.example.moviesapplication.movies_list.data.api.MoviesListApiService
import com.example.moviesapplication.movies_list.data.datasource.remote.MoviesListRemoteDataSource
import com.example.moviesapplication.movies_list.data.model.MoviesListDataModel

class MoviesListRemoteDataSourceImpl(
    private val moviesListApiService: MoviesListApiService
) : MoviesListRemoteDataSource {

    override suspend fun getMoviesList(): MoviesListDataModel =
        moviesListApiService.getMoviesList()
}