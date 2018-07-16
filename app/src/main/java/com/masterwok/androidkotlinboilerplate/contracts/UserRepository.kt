package com.masterwok.androidkotlinboilerplate.contracts

import android.arch.lifecycle.LiveData
import com.masterwok.androidkotlinboilerplate.room.entities.User

interface UserRepository {
    fun insertUser(user: User)

    fun getAllUsers(): LiveData<List<User>>
}