package com.example.com1786_cw2project1.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.com1786_cw2project1.local.model.Url

@Database(entities = [Url::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun urlDao(): UrlDao
}