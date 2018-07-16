package com.masterwok.androidkotlinboilerplate.room.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "user")
data class User(
        @PrimaryKey(autoGenerate = true) var id: Long?,
        @ColumnInfo(name = "name_first") var firstName: String,
        @ColumnInfo(name = "name_last") var lastName: String
)
