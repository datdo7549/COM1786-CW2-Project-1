package com.example.com1786_cw2project1.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.com1786_cw2project1.local.model.Url

@Dao
interface UrlDao {
    @Insert
    fun addUrl(url: Url)

    @Query("SELECT * FROM url")
    fun getListUrl(): List<Url>
}