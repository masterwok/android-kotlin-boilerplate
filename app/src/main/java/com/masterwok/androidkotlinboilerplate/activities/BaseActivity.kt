package com.masterwok.androidkotlinboilerplate.activities

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.masterwok.androidkotlinboilerplate.dagger.extensions.createFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


abstract class BaseActivity<T : ViewModel> : DaggerAppCompatActivity() {

    @Inject
    @Suppress("MemberVisibilityCanBePrivate")
    protected lateinit var viewModel: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ViewModelProviders
                .of(this, viewModel.createFactory())
                .get(viewModel.javaClass)
    }

}