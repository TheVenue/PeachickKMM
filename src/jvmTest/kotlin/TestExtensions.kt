import shared.Genre

fun getGenre(randomGenreInt: Int): Genre {
    return when (randomGenreInt) {
        0 -> Genre.ACTION_AND_ADVENTURE
        1 -> Genre.COMEDY
        2 -> Genre.KIDS
        else -> Genre.DRAMA
    }
}