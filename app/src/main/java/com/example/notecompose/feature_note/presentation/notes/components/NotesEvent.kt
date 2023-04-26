package com.example.notecompose.feature_note.presentation.notes.components

import android.provider.ContactsContract.CommonDataKinds.Note
import com.example.notecompose.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}

