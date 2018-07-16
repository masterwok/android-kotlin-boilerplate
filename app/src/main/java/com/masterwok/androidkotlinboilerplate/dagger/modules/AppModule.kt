package com.masterwok.androidkotlinboilerplate.dagger.modules

import android.app.Application
import android.content.Context
import com.masterwok.androidkotlinboilerplate.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule() {

    @Provides
    @Singleton
    fun provideApp(app: App): Application = app

    @Provides
    @Singleton
    fun provideContext(app: App): Context = app

}

