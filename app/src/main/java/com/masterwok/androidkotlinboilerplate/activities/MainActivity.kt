package com.masterwok.androidkotlinboilerplate.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatButton
import android.util.Log
import com.masterwok.androidkotlinboilerplate.R

class MainActivity : AppCompatActivity() {

    private var buttonClickMe: AppCompatButton? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main);

        bindViewComponents();
        subscribeToViewComponents();
    }

    private fun bindViewComponents() {
        buttonClickMe = findViewById(R.id.button_click_me);
    }

    private fun subscribeToViewComponents() {
        buttonClickMe?.setOnClickListener {
            Log.d("MainActivity", "Hello, World!");
        };
    }

}