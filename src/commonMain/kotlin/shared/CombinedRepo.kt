package shared

import movies.MovieRepo
import tvShows.TVShowRepo

object CombinedRepo {
    fun getAllFeaturedContent(): List<MediaClass> {
        return listOf(MovieRepo.getFeaturedMovies(), TVShowRepo.getFeaturedTvShows()).flatten()
    }

    fun getAllExclusiveContent(): List<MediaClass> {
        return listOf(MovieRepo.getExclusiveMovies(), TVShowRepo.getExclusiveTvShows()).flatten()
    }

    fun getAllContentFromAGenre(genre: Genre): List<MediaClass> {
        return listOf(MovieRepo.getMoviesFromGenre(genre), TVShowRepo.getTvShowsFromGenre(genre)).flatten()
    }
}