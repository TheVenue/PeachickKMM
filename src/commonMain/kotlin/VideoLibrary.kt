object VideoLibrary {
    val featuredVideos = mutableListOf<Video>()
    val movies = mutableListOf<Video>()
    val tvShows = mutableListOf<TvShow>()
    val myStuff = mutableSetOf<MediaClass>()

    init {
        addFeaturedVideos()
        addMovies()
        addTvShows()
    }

    private fun addFeaturedVideos() {
        featuredVideos.add(
            Video(
                id = "iaidivcisis",
                title = "The Northman",
                genre = Genre.ACTION_AND_ADVENTURE,
                rating = Rating.R,
                description = "On the verge of becoming a man, Prince Amleth's life changes when his father is murdered and his mother is kidnapped; two decades later, the fierce viking seeks revenge.",
                peachickExclusive = true,
                releaseYear = 2022,
                videoLength = VideoLength(2, 16)
            )
        )
    }

    private fun addMovies() {
        movies.add(
            Video(
                id = "fsbvsfvas",
                title = "Blended",
                genre = Genre.COMEDY,
                rating = Rating.PG_13,
                description = "Soon after their blind date goes disastrously wrong, two single parents and their children end up sharing a suite together at an African resort.",
                peachickExclusive = false,
                releaseYear = 2014,
                videoLength = VideoLength(1, 57)
            )
        )
        movies.add(
            Video(
                id = "afasdfasfas",
                title = "Minions",
                genre = Genre.KIDS,
                rating = Rating.PG,
                description = "On a mission to find a new master to serve, three Minions meet Scarlet Overkill the world's first female supervillain.",
                peachickExclusive = false,
                releaseYear = 2015,
                videoLength = VideoLength(1, 30)
            )
        )
    }

    private fun addTvShows() {
        val episode1 = Video(
            id = "fhsgdassdt",
            title = "Pilot",
            genre = Genre.DRAMA,
            rating = Rating.TVMA,
            description = "A talented West Philly teenager is sent to live in Bel Air to avoid the dangers of his hometown.",
            peachickExclusive = true,
            releaseYear = 2022,
            videoLength = VideoLength(hrs = 0, 59)
        )
        val season = Season(
            id = 1,
            episodes = mutableListOf(episode1),
            description = "The journey of a talented teen whose life is forever transformed when he moves from the streets of West Philadelphia to live with his relatives in one of LA's wealthiest enclaves."
        )
        tvShows.add(
            TvShow(
                id = "afsgdsfhstad", title = "Bel-Air", genre = Genre.DRAMA, seasons = mutableListOf(season)
            )
        )
    }
}