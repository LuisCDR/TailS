package com.example.tails.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tails.model.dao.ProjectDao
import com.example.tails.model.dao.TaskDao
import com.example.tails.model.dao.UserDao
import com.example.tails.model.entity.Project
import com.example.tails.model.entity.Task
import com.example.tails.model.entity.User

@Database(entities = [User::class, Project::class, Task::class], version = 1, exportSchema = false)
abstract class TailsDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun projectDao(): ProjectDao
    abstract fun taskDao(): TaskDao

    companion object {
        @Volatile
        private var INSTANCE: TailsDatabase? = null

        fun getDB(context: Context): TailsDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TailsDatabase::class.java,
                    "tails_db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}