package com.masterwok.androidkotlinboilerplate.dagger.modules

import com.masterwok.androidkotlinboilerplate.activities.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
@Suppress("unused")
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

}