package tvShows

import shared.Genre
import shared.Video

object TVShowRepo {
    private val tvShowAPIService = TVShowAPIService()
    private val cachedTvShows = mutableListOf<TvShow>()

    fun getTVShows(): MutableList<TvShow> {
        if (cachedTvShows.isEmpty()) {
            cachedTvShows.addAll(tvShowAPIService.getTvShows())
        }
        return cachedTvShows
    }

    fun getTvShowsFromGenre(genre: Genre): List<TvShow> {
        return cachedTvShows.filter { it.genre == genre }
    }
}