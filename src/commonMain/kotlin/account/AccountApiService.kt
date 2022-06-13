package account

class AccountApiService {

    fun getProfiles(): MutableList<Profile> {
        return mutableListOf(
            Profile(
                username = "101patrick",
                email = "marvindcpatrick@gmail.com",
                myStuff = mutableSetOf()
            )
        )
    }

}