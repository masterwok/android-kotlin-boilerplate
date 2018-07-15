package com.masterwok.androidkotlinboilerplate.viewmodels

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor() : ViewModel() {

    private var currentCount: MutableLiveData<Int> = MutableLiveData()

    fun getCurrentCount(): MutableLiveData<Int> {
        if (currentCount.value == null) {
            currentCount.value = 0
        }

        return currentCount
    }


}