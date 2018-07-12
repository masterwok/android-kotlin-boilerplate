package com.masterwok.androidkotlinboilerplate.dagger.components

import com.masterwok.androidkotlinboilerplate.App
import com.masterwok.androidkotlinboilerplate.dagger.modules.ActivityModule
import com.masterwok.androidkotlinboilerplate.dagger.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>();

}