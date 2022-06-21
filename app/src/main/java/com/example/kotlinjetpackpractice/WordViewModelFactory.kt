package com.example.kotlinjetpackpractice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinjetpackpractice.ViewModels.WordVM

class WordViewModelFactory(private val repository: WordRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WordVM::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return WordVM(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}