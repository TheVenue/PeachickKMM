data class TvShow(
    val id: String,
    val title: String,
    val genre: Genre,
    val seasons: MutableList<Season>
) : MediaClass