package media

data class Video(
    val id: String,
    val title: String,
    val genre: Genre,
    val description: String,
    val rating: Rating,
    val peachickExclusive: Boolean = false,
    val isFeatured: Boolean = true,
    val releaseYear: Int,
    val videoLengthInMinutes: Int
) : MediaClass