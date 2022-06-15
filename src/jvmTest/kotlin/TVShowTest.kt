import shared.Genre
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import tvShows.TVShowRepo
import tvShows.TVShowRepo.getAllTVShows
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.test.BeforeTest
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class TVShowTest {

    @BeforeTest
    fun setup() {
        getAllTVShows()
    }

    @Test
    @RepeatedTest(999)
    fun getGenreOfTvShows() {
        val randomGenreInt = Random.nextInt(0 until Genre.values().size)
        val genre = getGenre(randomGenreInt)
        val listOfTvShows = TVShowRepo.getTvShowsFromGenre(genre)
        listOfTvShows.shuffled()
        assertEquals(genre, listOfTvShows[0].genre)
    }

    @Test
    @RepeatedTest(999)
    fun getFeaturedTvShows() {
        val listOfFeaturedTvShows = TVShowRepo.getFeaturedTvShows()
        listOfFeaturedTvShows.shuffled()
        assertTrue(listOfFeaturedTvShows[0].isFeatured)
    }
}