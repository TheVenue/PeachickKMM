package tvShows

import shared.Video

data class Season(
    val id: String,
    val seasonNumber: Int,
    val episodes: MutableList<Video>,
)
