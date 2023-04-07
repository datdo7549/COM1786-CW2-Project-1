package com.example.com1786_cw2project1.local.di

import androidx.room.Room
import com.example.com1786_cw2project1.local.database.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            "data"
        )
            .allowMainThreadQueries()
            .build()
    }

    single {
        get<AppDatabase>().urlDao()
    }
}