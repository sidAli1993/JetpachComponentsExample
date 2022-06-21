package com.example.kotlinjetpackpractice.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.kotlinjetpackpractice.WordRepository
import com.example.kotlinjetpackpractice.model.Word
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class WordVM(val wordRepository: WordRepository):ViewModel() {

    val allwords:LiveData<List<Word>> = wordRepository.allwords.asLiveData()

    fun insert(word: Word)=viewModelScope.launch{
        wordRepository.insert(word)
    }
}