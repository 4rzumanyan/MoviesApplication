package com.example.moviesapplication.movie_details.domain.model

data class MovieDetailsDomainModel(
    val adult: Boolean?,
    val id: Int?,
    val overview: String?,
    val poster_path: String?,
    val release_date: String?,
    val title: String?,
    val vote_average: Double?,
    val vote_count: Int?
)