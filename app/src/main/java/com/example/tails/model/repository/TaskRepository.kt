package com.example.tails.model.repository

import androidx.lifecycle.LiveData
import com.example.tails.model.dao.TaskDao
import com.example.tails.model.entity.ProjectWithTasks
import com.example.tails.model.entity.Task
import javax.inject.Inject

interface TaskRepository {
    suspend fun insertTask(task: Task)
    suspend fun updateTask(task: Task)
    suspend fun delTask(task: Task)
    suspend fun delTasks(vararg tasks: Task)
    fun getProjectWithTasks(projectId: Int): LiveData<List<ProjectWithTasks>>
}

class TaskRepositoryImp @Inject constructor (
    private val taskDao: TaskDao
        ): TaskRepository {
    override suspend fun insertTask(task: Task) = taskDao.insertTask(task)

    override suspend fun updateTask(task: Task) = taskDao.updateTask(task)

    override suspend fun delTask(task: Task) = taskDao.delTask(task)

    override suspend fun delTasks(vararg tasks: Task) = taskDao.delTasks(*tasks)

    override fun getProjectWithTasks(projectId: Int):
            LiveData<List<ProjectWithTasks>> = taskDao.getProjectWithTasks(projectId)

}