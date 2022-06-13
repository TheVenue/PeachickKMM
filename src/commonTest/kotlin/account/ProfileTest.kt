package account

import movie.MovieRepo
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class ProfileTest {
    private var profile: Profile? = null

    @BeforeTest
    fun setup() {
        profile = Profile(
            username = "101patrick",
            email = "marvindpatrick@gmail.com",
            myStuff = mutableSetOf()
        )
    }

    @Test
    fun addToMyStuffEnsureNoDuplicates() {
        assertEquals(0, profile?.myStuff?.size)
        val video = MovieRepo.getAllMovies()[0]
        profile?.myStuff?.add(video)
        profile?.myStuff?.add(video)
        profile?.myStuff?.add(video)
        profile?.myStuff?.add(video)
        assertEquals(1, profile?.myStuff?.size)
    }

    @Test
    fun removeFromMyStuff() {
        assertEquals(0, profile?.myStuff?.size)
        val video = MovieRepo.getAllMovies()[0]
        profile?.myStuff?.add(video)
        assertEquals(1, profile?.myStuff?.size)
        profile?.myStuff?.remove(video)
        profile?.myStuff?.remove(video)
        profile?.myStuff?.remove(video)
        assertEquals(0, profile?.myStuff?.size)
    }

    @AfterTest
    fun tearDown() {
        profile = null
    }
}