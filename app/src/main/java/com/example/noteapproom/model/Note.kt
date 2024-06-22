package com.example.noteapproom.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notes")
@Parcelize
/*Note that only the primary constructor properties will be serialized*/
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val noteTitle : String,
    val noteDesc : String
) : Parcelable
