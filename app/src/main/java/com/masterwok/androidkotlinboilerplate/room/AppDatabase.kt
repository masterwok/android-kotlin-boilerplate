package com.masterwok.androidkotlinboilerplate.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.masterwok.androidkotlinboilerplate.room.daos.UserDao
import com.masterwok.androidkotlinboilerplate.room.entities.User

@Database(
        entities = [
            User::class
        ],
        version = 1,
        exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}