package shared

data class Video(
    val id: String,
    val title: String,
    val genre: Genre,
    val description: String,
    val rating: Rating,
    val releaseYear: Int,
    val videoLengthInMinutes: Int,
    override val isExclusive: Boolean = false,
    override val isFeatured: Boolean = false
) : MediaClass