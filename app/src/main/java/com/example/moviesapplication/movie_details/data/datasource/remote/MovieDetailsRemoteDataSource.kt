package com.example.moviesapplication.movie_details.data.datasource.remote

import com.example.moviesapplication.movie_details.data.model.MovieDetailsDataModel

interface MovieDetailsRemoteDataSource {

    suspend fun getMovieDetails(movieId: Int): MovieDetailsDataModel
}