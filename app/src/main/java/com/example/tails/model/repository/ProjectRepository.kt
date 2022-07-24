package com.example.tails.model.repository

import androidx.lifecycle.LiveData
import com.example.tails.model.dao.ProjectDao
import com.example.tails.model.entity.Project
import com.example.tails.model.entity.UserWithProjects
import javax.inject.Inject

interface ProjectRepository {
    suspend fun insertProject(project: Project)
    suspend fun updateProject(project: Project)
    suspend fun delProject(toDelete: Project)
    fun getUserWithProjects(userId: String): LiveData<List<UserWithProjects>>
}

class ProjectRepositoryImp @Inject constructor (
    private val projectDao: ProjectDao
    ): ProjectRepository {
    override suspend fun insertProject(project: Project) = projectDao.insertProject(project)

    override suspend fun updateProject(project: Project) = projectDao.updateProject(project)

    override suspend fun delProject(toDelete: Project) = projectDao.delProject(toDelete)

    override fun getUserWithProjects(userId: String):
            LiveData<List<UserWithProjects>> = projectDao.getUserWithProjects(userId)

}