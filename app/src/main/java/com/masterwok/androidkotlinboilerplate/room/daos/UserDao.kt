package com.masterwok.androidkotlinboilerplate.room.daos

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.masterwok.androidkotlinboilerplate.room.entities.User

@Dao
interface UserDao {
    @Query("select * from user")
    fun getAllUsers(): LiveData<List<User>>

    @Insert(onConflict = REPLACE)
    fun insert(user: User)
}