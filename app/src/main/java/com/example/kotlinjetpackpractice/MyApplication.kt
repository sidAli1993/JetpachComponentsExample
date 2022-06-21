package com.example.kotlinjetpackpractice

import android.app.Application
import com.example.kotlinjetpackpractice.RoomDB.WordRoomDatabase

class MyApplication :Application(){
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}