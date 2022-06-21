package com.example.kotlinjetpackpractice.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "WordTable")
data class Word(
    @PrimaryKey (autoGenerate = true) val id:Int,
    @ColumnInfo(name = "wordname") val word: String
)
