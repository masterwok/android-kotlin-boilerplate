package com.masterwok.androidkotlinboilerplate.dagger.modules

import android.arch.persistence.room.Room
import android.content.Context
import com.masterwok.androidkotlinboilerplate.contracts.UserRepository
import com.masterwok.androidkotlinboilerplate.room.AppDatabase
import com.masterwok.androidkotlinboilerplate.room.daos.UserDao
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class PersistenceModule {

    @Provides
    @Singleton
    fun providesAppDatabase(context: Context): AppDatabase = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "app-database.db"
    ).build()

    @Provides
    @Singleton
    fun providesUserDao(database: AppDatabase) = database.userDao()

    @Provides
    @Singleton
    fun providesUserRepository(userDao: UserDao): UserRepository = com.masterwok.androidkotlinboilerplate.repositories.UserRepository(
            userDao,
            Executors.newSingleThreadExecutor()
    )

}

