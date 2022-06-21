package com.example.kotlinjetpackpractice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlinjetpackpractice.model.Word
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
    @Query("select * from wordtable ORDER BY wordname ASC")
    fun getWords(): Flow<List<Word>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(word: Word)

    @Query("delete from wordtable")
    suspend fun deleteTable()
}