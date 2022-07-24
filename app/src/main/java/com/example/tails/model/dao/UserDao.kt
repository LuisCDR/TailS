package com.example.tails.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tails.model.entity.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun delUser(user: User)

    @Query("SELECT * FROM user_table WHERE name = :name")
    fun getUserByUsername(name: String): LiveData<User>

    @Query("SELECT * FROM user_table WHERE id = :uid")
    fun getUserByID(uid: String): LiveData<User>
}