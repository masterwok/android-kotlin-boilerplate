package com.masterwok.androidkotlinboilerplate.activities

import android.os.Bundle
import com.masterwok.androidkotlinboilerplate.R
import com.masterwok.androidkotlinboilerplate.viewmodels.MainActivityViewModel

class MainActivity : BaseActivity<MainActivityViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

}