package account

object AccountRepo {
    private val accountApiService = AccountApiService()
    private val profiles = mutableListOf<Profile>()

    fun getProfiles(): MutableList<Profile> {
        if (profiles.isEmpty()) {
            profiles.addAll(accountApiService.getProfiles())
        }
        return profiles
    }
}