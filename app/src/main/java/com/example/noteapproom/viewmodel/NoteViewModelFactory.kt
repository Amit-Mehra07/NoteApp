package com.example.noteapproom.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.noteapproom.repository.NoteRepository
//this class is helpful to instanciate and return view-model
//we need ViewModelFactory when we have custom parameters in view model,
//otherwise we can simply use default view model
class NoteViewModelFactory(val app:Application, private val noteRepository: NoteRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, noteRepository) as T
    }

}