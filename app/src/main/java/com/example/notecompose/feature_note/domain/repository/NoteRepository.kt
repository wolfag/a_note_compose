package com.example.notecompose.feature_note.domain.repository

import com.example.notecompose.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNote(id: Int): Note?

    suspend fun insert(note: Note)

    suspend fun delete(note: Note)
}