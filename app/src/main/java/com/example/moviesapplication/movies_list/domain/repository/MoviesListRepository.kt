package com.example.moviesapplication.movies_list.domain.repository

import com.example.moviesapplication.movies_list.data.model.MoviesListDataModel

interface MoviesListRepository {

    suspend fun getRemoteMoviesList(): MoviesListDataModel
}