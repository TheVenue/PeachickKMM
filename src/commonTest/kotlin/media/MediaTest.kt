package media

import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.test.Test
import kotlin.test.assertEquals

class MediaTest {
    @Test
    fun getGenreOfMovies() {
        val randomGenreInt = Random.nextInt(0..Genre.values().size)
        val genre = getGenre(randomGenreInt)
        val listOfVideos = VideoLibrary.getMoviesFromGenre(genre)
        listOfVideos.shuffled()
        assertEquals(genre, listOfVideos[0].genre)
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