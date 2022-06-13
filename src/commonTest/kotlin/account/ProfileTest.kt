package account

import movies.MovieRepo
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class ProfileTest {
    private var myProfile: Profile? = null
    private var kidsProfile: Profile? = null

    @BeforeTest
    fun setup() {
        myProfile = Profile(
            username = "101patrick",
            email = "marvindpatrick@gmail.com",
            myStuff = mutableSetOf()
        )
        kidsProfile = Profile(
            username = "kids",
            email = "marvindcpatrick@gmail.com",
            myStuff = mutableSetOf()
        )
    }

    @Test
    fun addToMyStuffEnsureNoDuplicates() {
        assertEquals(0, myProfile?.myStuff?.size)
        val video = MovieRepo.getAllMovies()[0]
        myProfile?.myStuff?.add(video)
        myProfile?.myStuff?.add(video)
        myProfile?.myStuff?.add(video)
        myProfile?.myStuff?.add(video)
        assertEquals(1, myProfile?.myStuff?.size)
        assertEquals(0, kidsProfile?.myStuff?.size)
    }

    @Test
    fun removeFromMyStuff() {
        assertEquals(0, myProfile?.myStuff?.size)
        val video = MovieRepo.getAllMovies()[0]
        myProfile?.myStuff?.add(video)
        assertEquals(1, myProfile?.myStuff?.size)
        assertEquals(0, kidsProfile?.myStuff?.size)
        myProfile?.myStuff?.remove(video)
        myProfile?.myStuff?.remove(video)
        myProfile?.myStuff?.remove(video)
        assertEquals(0, myProfile?.myStuff?.size)
    }

    @AfterTest
    fun tearDown() {
        myProfile = null
        kidsProfile = null
    }
}