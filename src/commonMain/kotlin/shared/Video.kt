package shared

data class Video(
    val rating: Rating,
    val releaseYear: Int,
    val videoLengthInMinutes: Int,
    override val id: String,
    override val title: String,
    override val genre: Genre,
    override val description: String,
    override val isExclusive: Boolean = false,
    override val isFeatured: Boolean = false
) : MediaClass