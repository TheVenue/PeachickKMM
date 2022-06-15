import shared.Genre
import kotlin.random.Random
import kotlin.random.nextInt

fun getRandomGenre(): Genre {
    return when (Random.nextInt(0 until Genre.values().size)) {
        0 -> Genre.ACTION_AND_ADVENTURE
        1 -> Genre.COMEDY
        2 -> Genre.KIDS
        else -> Genre.DRAMA
    }
}