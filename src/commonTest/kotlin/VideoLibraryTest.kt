import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class VideoLibraryTest {
    @BeforeTest
    fun setup() {
        VideoLibrary.myStuff.clear()
    }

    @Test
    fun addToMyStuffEnsureNoDuplicates() {
        assertEquals(0, VideoLibrary.myStuff.size)
        val video = VideoLibrary.featuredVideos[0]
        VideoLibrary.myStuff.add(video)
        VideoLibrary.myStuff.add(video)
        VideoLibrary.myStuff.add(video)
        VideoLibrary.myStuff.add(video)
        assertEquals(1, VideoLibrary.myStuff.size)
    }

    @Test
    fun removeFromMyStuff() {
        assertEquals(0, VideoLibrary.myStuff.size)
        val video = VideoLibrary.featuredVideos[0]
        VideoLibrary.myStuff.add(video)
        assertEquals(1, VideoLibrary.myStuff.size)
        VideoLibrary.myStuff.remove(video)
        VideoLibrary.myStuff.remove(video)
        VideoLibrary.myStuff.remove(video)
        assertEquals(0, VideoLibrary.myStuff.size)
    }
}