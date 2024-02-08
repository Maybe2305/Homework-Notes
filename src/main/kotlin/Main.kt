fun main() {
    val manageNotes = CreateNotes<Note>()
    val note1 = Note(1,"First Note", "I'm create my first note :D")
    manageNotes.addNote(note1)

    val comment1 = Comment(1,"My first comment")
    manageNotes.createComment(comment1)


    val newNote = Note(1,"Edited Note", "I'm Edit Note 1")
    manageNotes.editNote(1,newNote)


    val note2 = Note(2,"2nd Note", "It is my second Note")
    manageNotes.addNote(note2)

    manageNotes.deleteNote(1)

    manageNotes.getNotes()

    manageNotes.deleteComment(1)
    manageNotes.getComments(1)
    manageNotes.restoreComment(1)
    manageNotes.getComments(1)

}