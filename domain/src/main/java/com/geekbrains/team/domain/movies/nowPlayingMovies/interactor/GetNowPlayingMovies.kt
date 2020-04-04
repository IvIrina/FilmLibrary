package com.geekbrains.team.domain.movies.nowPlayingMovies.interactor

import com.geekbrains.team.domain.base.UseCase
import com.geekbrains.team.domain.movies.model.Movie
import com.geekbrains.team.domain.movies.nowPlayingMovies.repository.NowPlayingMoviesRepository
import io.reactivex.Single
import javax.inject.Inject

class GetNowPlayingMovies @Inject constructor(private val repository: NowPlayingMoviesRepository) :
    UseCase<List<Movie>, GetNowPlayingMovies.Params> {
    override fun execute(params: Params): Single<List<Movie>> {
        return repository.fetch(page = params.page)
    }

    data class Params(val page: Int)
}