package com.masterwok.androidkotlinboilerplate.activities

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.widget.AppCompatButton
import android.support.v7.widget.AppCompatTextView
import com.masterwok.androidkotlinboilerplate.R
import com.masterwok.androidkotlinboilerplate.room.entities.User
import com.masterwok.androidkotlinboilerplate.viewmodels.MainActivityViewModel

class MainActivity : BaseActivity<MainActivityViewModel>() {

    private var buttonClickMe: AppCompatButton? = null
    private var textViewCount: AppCompatTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        bindViewComponents()
        subscribeToViewComponents()
        subscribeToLiveData()
    }

    private fun bindViewComponents() {
        buttonClickMe = findViewById(R.id.button_click_me)
        textViewCount = findViewById(R.id.textview_count)
    }

    private fun subscribeToViewComponents() {
        buttonClickMe?.setOnClickListener {
            viewModel.insertUser()
        }
    }

    private fun subscribeToLiveData() {
        viewModel
                .getAllUsers()
                .observe(this, Observer { t -> configure(t) })
    }

    private fun configure(users: List<User>?) {
        textViewCount?.text = (users?.count() ?: 0).toString()
    }

}