package com.example.tails.model.entity

import androidx.room.*
import org.jetbrains.annotations.NotNull
import java.util.*

@Entity(
    tableName = "user_table",
    indices = [
        Index(
            value = ["id", "name"],
            unique = true
        )
    ]
)
data class User(
    @PrimaryKey
    @ColumnInfo(name = "id") val uid: String = UUID.randomUUID().toString(),
    @ColumnInfo(name = "name") val name: String?,
    @NotNull
    @ColumnInfo(name = "email") val email: String?,
    @NotNull
    @ColumnInfo(name = "password") val password: String?,
    @ColumnInfo(name = "picture") val picture: String?
)