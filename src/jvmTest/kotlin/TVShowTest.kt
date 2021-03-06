import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import tvShows.TVShowRepo
import tvShows.TVShowRepo.getAllTVShows
import kotlin.test.BeforeTest
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TVShowTest {

    @Test
    @RepeatedTest(999)
    fun getGenreOfTvShows() {
        val genre = getRandomGenre()
        val listOfTvShows = TVShowRepo.getTvShowsFromGenre(genre)
        assertEquals(genre, listOfTvShows.shuffled()[0].genre)
    }

    @Test
    @RepeatedTest(999)
    fun getFeaturedTvShows() {
        val listOfFeaturedTvShows = TVShowRepo.getFeaturedTvShows()
        assertTrue(listOfFeaturedTvShows.shuffled()[0].isFeatured)
    }

    @Test
    @RepeatedTest(999)
    fun getExclusiveTvShows() {
        val listOfExclusiveTvShows = TVShowRepo.getExclusiveTvShows()
        assertTrue(listOfExclusiveTvShows.shuffled()[0].isExclusive)
    }
}