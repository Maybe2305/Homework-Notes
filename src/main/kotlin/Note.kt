

data class Note (
    val idNote: Int = 1,
    val titleNote: String = "",
    val textNote: String = "",
    val comments: MutableList<Comment> = mutableListOf()

) {
}