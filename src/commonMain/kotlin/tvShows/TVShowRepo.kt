package tvShows

import shared.Genre

object TVShowRepo {
    private val tvShowAPIService = TVShowAPIService()
    private val cachedTvShows = mutableListOf<TvShow>()

    @Deprecated(message = "Use getAllTVShows() instead.", ReplaceWith("getAllTVShows()"))
    fun getTVShows(): MutableList<TvShow> {
        if (cachedTvShows.isEmpty()) {
            cachedTvShows.addAll(tvShowAPIService.getTvShows())
        }
        return cachedTvShows
    }

    fun getAllTVShows(): List<TvShow> {
        if (cachedTvShows.isEmpty()) {
            cachedTvShows.addAll(tvShowAPIService.getTvShows())
        }
        return cachedTvShows
    }

    fun getTvShowsFromGenre(genre: Genre): List<TvShow> {
        return cachedTvShows.filter { it.genre == genre }
    }

    fun getFeaturedTvShows(): List<TvShow> {
        return cachedTvShows.filter { it.isFeatured }
    }

    fun getPeachickExclusiveTvShows(): List<TvShow> {
        return cachedTvShows.filter { it.isPeachickExclusive }
    }
}