package com.example.noteapproom.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.noteapproom.model.Note
import com.example.noteapproom.model.NoteDao

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun getNoteDao() : NoteDao

    companion object{
        //we can access anywhere in app bcz it contain static data
        @Volatile
        //it ensures that changes made by one thread are immediately visible
        //to other thread
        private var instance : NoteDatabase? = null
        // instance var, holds the singleton instance of the NoteDatabase
        private val LOCK = Any()
        //this is a Lock object which is used to synchronize the database
        //creation process

        operator fun invoke(context : Context) = instance ?:
        synchronized(LOCK){
            //this block ensure that only one thread can execute the code inside
            //the block at a time
            instance ?: createDatabase(context).also{
                instance = it
            }
        }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,NoteDatabase::class.java,"note_db"
        ).build()
    }
}