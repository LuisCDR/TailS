package com.example.tails.di

import android.content.Context
import com.example.tails.model.TailsDatabase
import com.example.tails.model.dao.ProjectDao
import com.example.tails.model.dao.TaskDao
import com.example.tails.model.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Singleton
    @Provides
    fun dataSource(@ApplicationContext context: Context): TailsDatabase = TailsDatabase.getDB(context)

    @Singleton
    @Provides
    fun userDao(db: TailsDatabase): UserDao = db.userDao()

    @Singleton
    @Provides
    fun projectDao(db: TailsDatabase): ProjectDao = db.projectDao()

    @Singleton
    @Provides
    fun taskDao(db: TailsDatabase): TaskDao = db.taskDao()
}