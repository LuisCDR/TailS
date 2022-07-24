package com.example.tails.model.repository

import androidx.lifecycle.LiveData
import com.example.tails.model.dao.UserDao
import com.example.tails.model.entity.User
import javax.inject.Inject

interface UserRepository {
    suspend fun insertUser(user: User)
    suspend fun updateUser(user: User)
    suspend fun delUser(toDelete: User)
    suspend fun getUserByUsername(name: String): LiveData<User>
    suspend fun getUserById(uid: String): LiveData<User>
}

class UserRepositoryImp @Inject constructor(
    private val userDao: UserDao
) : UserRepository {
    override suspend fun insertUser(user: User) = userDao.insertUser(user)

    override suspend fun updateUser(user: User) = userDao.updateUser(user)

    override suspend fun delUser(toDelete: User) = userDao.delUser(toDelete)

    override suspend fun getUserByUsername(name: String): LiveData<User> = userDao.getUserByUsername(name)

    override suspend fun getUserById(uid: String): LiveData<User> = userDao.getUserByID(uid)
}