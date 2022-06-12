package profile

import media.MediaClass
data class Profile(
    var username: String,
    val email: String,
    val myStuff: MutableSet<MediaClass>
)
