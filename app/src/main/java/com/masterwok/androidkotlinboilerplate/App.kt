package com.masterwok.androidkotlinboilerplate

import com.masterwok.androidkotlinboilerplate.dagger.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication


class App : DaggerApplication() {

    private val appComponent: AndroidInjector<App> by lazy {
        DaggerAppComponent
                .builder()
                .create(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return appComponent
    }

}