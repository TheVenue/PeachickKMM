package shared

interface MediaClass {
    val isExclusive: Boolean
    val isFeatured: Boolean
    val id: String
    val title: String
    val genre: Genre
    val description: String
}