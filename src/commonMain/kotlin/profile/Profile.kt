package profile

import media.MediaClass

data class Profile(
    val username: String,
    val email: String,
    val myStuff: MutableSet<MediaClass>
)
