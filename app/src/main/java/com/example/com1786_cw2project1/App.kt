package com.example.com1786_cw2project1

import android.app.Application
import com.example.com1786_cw2project1.local.di.databaseModule
import com.example.com1786_cw2project1.local.di.localModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(
                localModule,
                databaseModule,
            )
        }
    }
}