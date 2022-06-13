package tvShow

import shared.Genre
import shared.MediaClass

data class TvShow(
    val id: String,
    val title: String,
    val genre: Genre,
    val seasons: MutableList<Season>,
    val isPeachickExclusive: Boolean = false,
    val isFeatured: Boolean = false,
    val description: String
) : MediaClass