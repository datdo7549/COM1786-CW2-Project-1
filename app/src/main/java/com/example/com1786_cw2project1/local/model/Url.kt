package com.example.com1786_cw2project1.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Url")
data class Url(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo(name = "url")
    val url: String
)
