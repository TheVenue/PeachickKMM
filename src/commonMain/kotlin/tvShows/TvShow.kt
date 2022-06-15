package tvShows

import shared.Genre
import shared.MediaClass

data class TvShow(
    val seasons: MutableList<Season>,
    val id: String,
    val title: String,
    val genre: Genre,
    val description: String,
    override val isFeatured: Boolean = false,
    override val isExclusive: Boolean = false
) : MediaClass