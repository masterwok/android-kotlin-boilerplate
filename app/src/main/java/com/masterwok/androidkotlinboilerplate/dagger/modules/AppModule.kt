package com.masterwok.androidkotlinboilerplate.dagger.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule {
    @Provides
    @Singleton
    fun provideApp(app: Application) = app
}

