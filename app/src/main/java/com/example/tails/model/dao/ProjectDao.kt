package com.example.tails.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tails.model.entity.Project
import com.example.tails.model.entity.UserWithProjects
import kotlinx.coroutines.flow.Flow

@Dao
interface ProjectDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProject(project: Project)

    @Update
    suspend fun updateProject(project: Project)

    @Delete
    suspend fun delProject(project: Project)

    @Transaction
    @Query("SELECT * FROM user_table WHERE id = :userId")
    fun getUserWithProjects(userId: String): LiveData<List<UserWithProjects>>
}