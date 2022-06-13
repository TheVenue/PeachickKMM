package movies

import shared.Genre
import shared.Video

object MovieRepo {
    private val movieAPIService = MovieAPIService()
    private val cachedMovies = mutableListOf<Video>()

    fun getAllMovies(): MutableList<Video> {
        if (cachedMovies.isEmpty()) {
            cachedMovies.addAll(movieAPIService.getMovies())
        }
        return cachedMovies
    }

    fun getMoviesFromGenre(genre: Genre): List<Video> {
        return cachedMovies.filter { it.genre == genre }
    }

    fun getFeaturedMovies(): List<Video> {
        return cachedMovies.filter { it.isFeatured }
    }
}