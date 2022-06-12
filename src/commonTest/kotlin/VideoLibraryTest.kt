import kotlin.test.Test
import kotlin.test.assertEquals

class VideoLibraryTest {
    @Test
    fun addToMyStuffEnsureNoDuplicates() {
        assertEquals(0, VideoLibrary.myStuff.size)
        val video = VideoLibrary.featuredVideos[0]
        VideoLibrary.addToMyStuff(video)
        VideoLibrary.addToMyStuff(video)
        VideoLibrary.addToMyStuff(video)
        VideoLibrary.addToMyStuff(video)
        assertEquals(1, VideoLibrary.myStuff.size)
    }

    @Test
    fun removeFromMyStuff() {
        assertEquals(0, VideoLibrary.myStuff.size)
        val video = VideoLibrary.featuredVideos[0]
        VideoLibrary.addToMyStuff(video)
        assertEquals(1, VideoLibrary.myStuff.size)
        VideoLibrary.removeFromMyStuff(video)
        VideoLibrary.removeFromMyStuff(video)
        VideoLibrary.removeFromMyStuff(video)
        assertEquals(0, VideoLibrary.myStuff.size)
    }
}