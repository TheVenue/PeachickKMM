package movies

import shared.Genre
import shared.Rating
import shared.Video
import tvShows.Season
import tvShows.TvShow

class MovieAPIService {

    fun getMovies() : MutableList<Video> {
        val movies = mutableListOf<Video>()
        movies.add(
            Video(
                id = "fsbvsfvas",
                title = "Blended",
                genre = Genre.COMEDY,
                rating = Rating.PG13,
                description = "Soon after their blind date goes disastrously wrong, two single parents and their children end up sharing a suite together at an African resort.",
                peachickExclusive = false,
                releaseYear = 2014,
                videoLengthInMinutes = 117
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
                videoLengthInMinutes = 90
            )
        )
        movies.add(
            Video(
                id = "34fsdfa32",
                title = "2 Fast 2 Furious",
                genre = Genre.ACTION_AND_ADVENTURE,
                rating = Rating.PG13,
                description = "A former policeman (Paul Walker) and his friend (Tyrese) work with a U.S. Customs agent (Eva Mendes) to indict a launderer in Miami.",
                peachickExclusive = false,
                releaseYear = 2003,
                videoLengthInMinutes = 107
            )
        )
        movies.add(
            Video(
                id = "439f9sv9as",
                title = "Antwone Fisher",
                genre = Genre.DRAMA,
                rating = Rating.PG13,
                description = "A Navy psychiatrist inspires a violence-prone sailor who was abused by foster parents to find his birth mother.",
                peachickExclusive = false,
                releaseYear = 2002,
                videoLengthInMinutes = 120
            )
        )
        movies.add(
            Video(
                id = "iaidivcisis",
                title = "The Northman",
                genre = Genre.ACTION_AND_ADVENTURE,
                rating = Rating.R,
                description = "On the verge of becoming a man, Prince Amleth's life changes when his father is murdered and his mother is kidnapped; two decades later, the fierce viking seeks revenge.",
                peachickExclusive = true,
                isFeatured = true,
                releaseYear = 2022,
                videoLengthInMinutes = 136
            )
        )
        return movies
    }
}