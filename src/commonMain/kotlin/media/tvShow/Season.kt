package media.tvShow

import media.Video

data class Season(
    val id: Int,
    val episodes: MutableList<Video>,
    val description: String
)
