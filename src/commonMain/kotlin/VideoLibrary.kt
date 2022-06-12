object VideoLibrary {
    val featuredVideos = arrayListOf<Video>()
    val movies = arrayListOf<Video>()
    val tvShows = arrayListOf<TvShow>()
    val sports = arrayListOf<Video>()
    val news = arrayListOf<Video>()

    init {
        addFeaturedVideos()
        addMovies()
        addTvShows()
        addSports()
        addNews()
    }

    private fun addFeaturedVideos() {
        featuredVideos.add(
            Video(id = "iaidivcisis", title = "The Northman", genre = Genre.ACTION_AND_ADVENTURE, rating = Rating.R, description = "On the verge of becoming a man, Prince Amleth's life changes when his father is murdered and his mother is kidnapped; two decades later, the fierce viking seeks revenge.", peachickExclusive = true, releaseYear = 2022, videoLength = VideoLength(2, 16))
        )
    }

    private fun addMovies() {

    }

    private fun addTvShows() {

    }

    private fun addSports() {

    }

    private fun addNews() {

    }
}