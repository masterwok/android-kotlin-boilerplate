package com.masterwok.androidkotlinboilerplate.dagger.extensions

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

/**
 * Add a view model factory extension method to ViewModel and its derived classes.
 */
fun <T : ViewModel> T.createFactory(): ViewModelProvider.Factory {
    val viewModel = this

    return object : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return viewModel as T
        }
    }
}