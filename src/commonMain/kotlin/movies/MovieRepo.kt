package movies

import shared.AMOUNT_OF_TREDNING_ITEMS
import shared.Genre
import shared.Video

object MovieRepo {
    private val movieAPIService = MovieAPIService()
    private val cachedMovies = mutableListOf<Video>()

    fun getAllMovies(): List<Video> {
        if (cachedMovies.isEmpty()) {
            cachedMovies.addAll(movieAPIService.getMovies())
        }
        return cachedMovies
    }

    fun getMoviesFromGenre(genre: Genre): List<Video> {
        return getAllMovies().filter { it.genre == genre }
    }

    fun getFeaturedMovies(): List<Video> {
        return getAllMovies().filter { it.isFeatured }
    }

    fun getExclusiveMovies(): List<Video> {
        return getAllMovies().filter { it.isExclusive }
    }

    fun getTrendingMovies(): List<Video> {
        return getAllMovies().sortedByDescending { it.viewsInPastWeek }.take(AMOUNT_OF_TREDNING_ITEMS)
    }
}