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
        return getAllTVShows().filter { it.genre == genre }
    }

    fun getFeaturedTvShows(): List<TvShow> {
        return getAllTVShows().filter { it.isFeatured }
    }

    fun getExclusiveTvShows(): List<TvShow> {
        return getAllTVShows().filter { it.isExclusive }
    }
}