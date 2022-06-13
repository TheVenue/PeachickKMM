package media

import media.shared.Genre
import media.shared.Video
import media.tvShow.TvShow

object VideoRepo {
    private val videoAPIService = VideoAPIService()
    private val cachedMovies = mutableListOf<Video>()
    private val cachedTvShows = mutableListOf<TvShow>()

    fun getAllMovies(): MutableList<Video> {
        if (cachedMovies.isEmpty()) {
            cachedMovies.addAll(videoAPIService.getMovies())
        }
        return cachedMovies
    }

    fun getTVShows(): MutableList<TvShow> {
        if (cachedTvShows.isEmpty()) {
            cachedTvShows.addAll(videoAPIService.getTvShows())
        }
        return cachedTvShows
    }

    fun getMoviesFromGenre(genre: Genre): List<Video> {
        return cachedMovies.filter { it.genre == genre }
    }

    fun getFeaturedMovies(): List<Video> {
        return cachedMovies.filter { it.isFeatured }
    }

    fun getTvShowsFromGenre(genre: Genre): List<TvShow> {
        return cachedTvShows.filter { it.genre == genre }
    }
}