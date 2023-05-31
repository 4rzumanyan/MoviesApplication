package com.example.moviesapplication.movies_list.domain.usecase

import com.example.moviesapplication.core.usecase.CoroutineUseCase
import com.example.moviesapplication.movies_list.domain.repository.MoviesListRepository
import com.example.moviesapplication.movies_list.domain.mapper.MoviesListDataToDomainMapper
import com.example.moviesapplication.movies_list.domain.model.MoviesListDomainModel
import kotlinx.coroutines.CoroutineDispatcher

class GetMoviesListUseCase(
    coroutineDispatcher: CoroutineDispatcher,
    private val moviesListDataToDomainMapper: MoviesListDataToDomainMapper,
    private val moviesListRepository: MoviesListRepository
) : CoroutineUseCase<Unit, MoviesListDomainModel>(coroutineDispatcher = coroutineDispatcher) {

    override suspend fun execute(parameters: Unit): MoviesListDomainModel =
        moviesListDataToDomainMapper.map(moviesListRepository.getRemoteMoviesList())
}