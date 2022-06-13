import shared.Genre
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import tvShows.TVShowRepo
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.test.BeforeTest
import kotlin.test.assertEquals

internal class TVShowTest {

    @BeforeTest
    fun setup() {
        TVShowRepo.getTVShows()
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
}