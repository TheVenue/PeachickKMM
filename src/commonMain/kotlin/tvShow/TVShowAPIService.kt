package tvShow

import shared.Genre
import shared.Rating
import shared.Video

class TVShowAPIService {

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

    fun getTvShows() : MutableList<TvShow> {
        val tvShows = mutableListOf<TvShow>()
        val episodeOfBelAir = Video(
            id = "fhsgdassdt",
            title = "Dreams And Nightmares",
            genre = Genre.DRAMA,
            rating = Rating.TVMA,
            description = "A talented West Philly teenager is sent to live in Bel Air to avoid the dangers of his hometown.",
            peachickExclusive = true,
            releaseYear = 2022,
            videoLengthInMinutes = 59
        )
        val seasonOfBelAir = Season(
            id = "24jnr3i32ofn",
            seasonNumber = 1,
            episodes = mutableListOf(episodeOfBelAir)
        )
        tvShows.add(
            TvShow(
                id = "afsgdsfhstad",
                title = "Bel-Air",
                genre = Genre.DRAMA,
                seasons = mutableListOf(seasonOfBelAir),
                description = "The journey of a talented teen whose life is forever transformed when he moves from the streets of West Philadelphia to live with his relatives in one of LA's wealthiest enclaves."
            )
        )

        val episodeOfTheOffice = Video(
            id = "afaawedewafdsad",
            title = "Pilot",
            genre = Genre.COMEDY,
            rating = Rating.TV14,
            description = "A documentary crew films Dunder Mifflin's reactions to downsizing rumors; a feud is born between Jim and Dwight.",
            peachickExclusive = false,
            releaseYear = 2005,
            videoLengthInMinutes = 38
        )
        val seasonOfTheOffice = Season(
            id = "49ewfiqwe9nf",
            seasonNumber = 1,
            episodes = mutableListOf(episodeOfTheOffice),
        )
        tvShows.add(
            TvShow(
                id = "rai99s99ef",
                title = "The Office",
                genre = Genre.COMEDY,
                seasons = mutableListOf(seasonOfTheOffice),
                description = "Bears. Beets. Battlestar Galactica. From Scranton to Stamford and back, employees plod along at Dunder Mifflin. Featuring extended episodes with new bonus scenes."
            )
        )

        val episodeOfChicagoFire = Video(
            id = "4289weiasdicsda9",
            title = "Mayday",
            genre = Genre.ACTION_AND_ADVENTURE,
            rating = Rating.TV14,
            description = "Firehouse 51 deals with the aftermath of the capsized boat rescue.",
            peachickExclusive = false,
            releaseYear = 2012,
            videoLengthInMinutes = 42
        )
        val seasonOfChicagoFire = Season(
            id = "fisa9asd9as",
            seasonNumber = 1,
            episodes = mutableListOf(episodeOfChicagoFire)
        )
        tvShows.add(
            TvShow(
                id = "af0vasdviasd9o",
                title = "Chicago Fire",
                genre = Genre.ACTION_AND_ADVENTURE,
                seasons = mutableListOf(seasonOfChicagoFire),
                description = "The courageous firefighters, rescue squad members and paramedics of Chicago Firehouse 51 forge unbreakable bonds while fighting to save their city from peril. Catch new episodes first on NBC.",
            )
        )

        val episodeOfAmericanNinjaWarriorJunior = Video(
            id = "af0asdvj9asdv",
            title = "The Next Generation of Ninjas",
            genre = Genre.KIDS,
            rating = Rating.TVG,
            description = "Twelve young athletes between the ages of 9 to 14 compete in the first of 16 qualifiers.",
            peachickExclusive = true,
            releaseYear = 2018,
            videoLengthInMinutes = 46
        )
        val seasonOfAmericanNinjaWarriorJunior = Season(
            id = "adias9a99fdas",
            seasonNumber = 1,
            episodes = mutableListOf(episodeOfAmericanNinjaWarriorJunior),
        )
        tvShows.add(
            TvShow(
                id = "fsdvcasd0asda",
                title = "American Ninja Warrior Junior",
                genre = Genre.KIDS,
                seasons = mutableListOf(seasonOfAmericanNinjaWarriorJunior),
                description = "Children, ages 9 to 14, race against each other on the ultimate obstacle course to win the title of American Ninja Warrior Junior."
            )
        )
        return tvShows
    }
}