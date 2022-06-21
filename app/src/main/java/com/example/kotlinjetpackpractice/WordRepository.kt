package com.example.kotlinjetpackpractice

import com.example.kotlinjetpackpractice.model.Word
import kotlinx.coroutines.flow.Flow


class WordRepository(val wordDao: WordDao) {
    val allwords:Flow<List<Word>> = wordDao.getWords()

    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}