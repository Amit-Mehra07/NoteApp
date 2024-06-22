package com.example.noteapproom.model
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDao {
    //it means :  if primary key is already exist in the table the old data will
    //be replaced with the new data
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note : Note)

    @Update
    suspend fun updateNote(note : Note)

    @Delete
    suspend fun deleteNote(note : Note)

    @Query("SELECT * FROM NOTES ORDER BY id DESC")
    fun getAllNotes() : LiveData<List<Note>>

    //means if the data match with title or description then store the data in
    //live data object containing with list of Note data entities
    @Query("SELECT * FROM NOTES WHERE noteTitle LIKE :query or noteDesc LIKE :query")
    fun searchNote(query : String?) : LiveData<List<Note>>
}