package com.example.notecompose.feature_note.presentation.notes.components

import android.provider.ContactsContract.CommonDataKinds.Note
import com.example.notecompose.feature_note.domain.util.NoteOrder
import com.example.notecompose.feature_note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
