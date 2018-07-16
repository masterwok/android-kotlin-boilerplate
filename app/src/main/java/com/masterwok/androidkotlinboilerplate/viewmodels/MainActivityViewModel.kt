package com.masterwok.androidkotlinboilerplate.viewmodels

import android.arch.lifecycle.ViewModel
import com.masterwok.androidkotlinboilerplate.contracts.UserRepository
import com.masterwok.androidkotlinboilerplate.room.entities.User
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
        private var userRepository: UserRepository
) : ViewModel() {

    fun insertUser() {
        userRepository.insertUser(User(
                id = null,
                firstName = "Jonathan",
                lastName = "Trowbridge"
        ))
    }

    fun getAllUsers() = userRepository.getAllUsers()

}