package com.example.tails.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tails.model.entity.ProjectWithTasks
import com.example.tails.model.entity.Task

@Dao
interface TaskDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: Task)

    @Update
    suspend fun updateTask(task: Task)

    @Delete
    suspend fun delTask(task: Task)

    @Delete
    suspend fun delTasks(vararg tasks: Task)

    @Transaction
    @Query("SELECT * FROM project_table WHERE id = :projectId")
    fun getProjectWithTasks(projectId: Int):LiveData<List<ProjectWithTasks>>
}