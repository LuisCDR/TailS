package com.example.tails.di

import com.example.tails.model.repository.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun userRepository(repository: UserRepositoryImp): UserRepository

    @Singleton
    @Binds
    abstract fun projectRepository(repository: ProjectRepositoryImp): ProjectRepository

    @Singleton
    @Binds
    abstract fun taskRepository(repository: TaskRepositoryImp): TaskRepository
}