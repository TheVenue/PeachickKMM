import movies.MovieRepo
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import kotlin.test.BeforeTest
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MovieTest {

    @BeforeTest
    fun setup() {
        MovieRepo.getAllMovies()
    }

    @Test
    @RepeatedTest(999)
    fun getGenreOfMovies() {
        val genre = getRandomGenre()
        val listOfVideos = MovieRepo.getMoviesFromGenre(genre)
        assertEquals(genre, listOfVideos.shuffled()[0].genre)
    }

    @Test
    @RepeatedTest(999)
    fun getFeaturedMovies() {
        val listOfFeaturedMovies = MovieRepo.getFeaturedMovies()
        assertTrue(listOfFeaturedMovies.shuffled()[0].isFeatured)
    }

    @Test
    @RepeatedTest(999)
    fun getExclusiveMovies() {
        val listOfExclusiveMovies = MovieRepo.getExclusiveMovies()
        assertTrue(listOfExclusiveMovies.shuffled()[0].isExclusive)
    }
}