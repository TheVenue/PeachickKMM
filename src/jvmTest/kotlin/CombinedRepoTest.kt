import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import shared.CombinedRepo
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CombinedRepoTest {

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

    @Test
    @RepeatedTest(999)
    fun getAllContentFromAGenre() {
        val genre = getRandomGenre()
        val listOfContentFromAGenre = CombinedRepo.getAllContentFromAGenre(genre)
        assertEquals(genre, listOfContentFromAGenre.shuffled()[0].genre)
    }
}