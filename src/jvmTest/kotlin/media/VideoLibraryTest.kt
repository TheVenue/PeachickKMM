package media

import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class VideoLibraryTest {

    @Test
    @RepeatedTest(999)
    fun getGenreOfMovies() {
        val randomGenreInt = Random.nextInt(0..Genre.values().size)
        val genre = getGenre(randomGenreInt)
        val listOfVideos = VideoLibrary.getMoviesFromGenre(genre)
        listOfVideos.shuffled()
        assertEquals(genre, listOfVideos[0].genre)
    }

    @Test
    @RepeatedTest(999)
    fun getFeaturedMovies() {
        val listOfFeaturedMovies = VideoLibrary.getFeaturedMovies()
        assertTrue(listOfFeaturedMovies[0].isFeatured)
    }

    private fun getGenre(randomGenreInt: Int): Genre {
        return when (randomGenreInt) {
            0 -> Genre.ACTION_AND_ADVENTURE
            1 -> Genre.COMEDY
            2 -> Genre.KIDS
            else -> Genre.DRAMA
        }
    }
}