data class TvShow(
    val id: String,
    val title: String,
    val genre: String,
    val seasons: MutableList<Season>
)