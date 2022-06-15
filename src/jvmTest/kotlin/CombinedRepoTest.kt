import movies.MovieRepo
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import shared.CombinedRepo
import tvShows.TVShowRepo
import kotlin.test.BeforeTest
import kotlin.test.assertTrue

class CombinedRepoTest {

    @BeforeTest
    fun setup() {
        MovieRepo.getAllMovies()
        TVShowRepo.getAllTVShows()
    }

    @Test
    @RepeatedTest(999)
    fun getAllFeaturedContent() {
        val listOfAllFeaturedContent = CombinedRepo.getAllFeaturedContent()
        assertTrue(listOfAllFeaturedContent.shuffled()[0].isFeatured)
    }

    @Test
    @RepeatedTest(999)
    fun getAllExclusiveContent() {
        val listOfExclusiveContent = CombinedRepo.getAllExclusiveContent()
        assertTrue(listOfExclusiveContent.shuffled()[0].isExclusive)
    }
}