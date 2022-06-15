import movies.MovieRepo
import shared.Genre
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.test.BeforeTest
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class MovieTest {

    @BeforeTest
    fun setup() {
        MovieRepo.getAllMovies()
    }

    @Test
    @RepeatedTest(999)
    fun getGenreOfMovies() {
        val randomGenreInt = Random.nextInt(0 until Genre.values().size)
        val genre = getGenre(randomGenreInt)
        val listOfVideos = MovieRepo.getMoviesFromGenre(genre)
        assertEquals(genre, listOfVideos.shuffled()[0].genre)
    }

    @Test
    @RepeatedTest(999)
    fun getFeaturedMovies() {
        val listOfFeaturedMovies = MovieRepo.getFeaturedMovies()
        assertTrue(listOfFeaturedMovies.shuffled()[0].isFeatured)
    }
}