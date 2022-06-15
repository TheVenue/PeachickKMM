package tvShows

import shared.Genre
import shared.MediaClass

data class TvShow(
    val seasons: MutableList<Season>,
    override val id: String,
    override val title: String,
    override val genre: Genre,
    override val description: String,
    override val isFeatured: Boolean = false,
    override val isExclusive: Boolean = false
) : MediaClass