interface NotesFunctions<S> {
    fun addNote (
        note: S,
    )

    fun createComment (
        comment: Comment
    )

    fun deleteNote (
        noteId: Int,
    )

    fun deleteComment (
        commentId: Int,
    )

    fun editNote (
        noteId: Int,
        newNote: S,
    )

    fun editComment (
        commentId: Int,
        newComment: Comment,
    )

    fun getNotes ()

    fun getNote (
        noteId: Int,
    )

    fun getComments (
        noteId: Int,
    )

    fun restoreComment (
        commentId: Int,
    )
}