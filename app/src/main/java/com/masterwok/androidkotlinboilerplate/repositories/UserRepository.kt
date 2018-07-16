package com.masterwok.androidkotlinboilerplate.repositories

import android.arch.lifecycle.LiveData
import com.masterwok.androidkotlinboilerplate.contracts.UserRepository
import com.masterwok.androidkotlinboilerplate.room.daos.UserDao
import com.masterwok.androidkotlinboilerplate.room.entities.User
import java.util.concurrent.Executor

class UserRepository(
        private val userDao: UserDao,
        private val executor: Executor
) : UserRepository {

    override fun insertUser(user: User) {
        executor.execute {
            userDao.insert(user)
        }
    }

    override fun getAllUsers(): LiveData<List<User>> = userDao.getAllUsers()

}