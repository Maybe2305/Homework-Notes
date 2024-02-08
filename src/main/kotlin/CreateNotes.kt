class CreateNotes<S> : NotesFunctions<S> {

    private val notes: MutableList<S> = mutableListOf()
    private val comments = Note().comments
    private val deletedComments: MutableList<Comment> = mutableListOf()


    override fun addNote(note: S) {
        notes.add(note)
    }

    override fun createComment(comment: Comment) {
        comments.add(comment)
    }

    override fun deleteNote(noteId: Int) {
        notes.removeAt(noteId - 1)
    }

    override fun deleteComment(commentId: Int) {
        val delete = comments.removeAt(commentId - 1)
        deletedComments.add(commentId -1, delete)
    }

    override fun editNote(noteId: Int, newNote: S) {
        notes[noteId - 1] = newNote
    }

    override fun editComment(commentId: Int, newComment: Comment) {
        comments[commentId - 1] = newComment
    }

    override fun getNotes() {
        for (noteList in notes) println(noteList)
    }

    override fun getNote(noteId: Int) {
        println(notes[noteId - 1])
    }

    override fun getComments(noteId: Int) {
        for (message in comments) println(message)
    }

    override fun restoreComment(commentId: Int) {
        val restore = deletedComments.removeAt(commentId - 1)
        comments.add(commentId - 1, restore)
    }


}