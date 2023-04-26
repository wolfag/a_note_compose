package com.example.notecompose.feature_note.data.repository

import com.example.notecompose.feature_note.data.data_source.NoteDao
import com.example.notecompose.feature_note.domain.model.Note
import com.example.notecompose.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNote(id: Int): Note? {
        return dao.getNote(id)
    }

    override suspend fun insert(note: Note) {
        return dao.insert(note)
    }

    override suspend fun delete(note: Note) {
        return dao.delete(note)
    }
}