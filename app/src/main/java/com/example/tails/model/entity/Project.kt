package com.example.tails.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "project_table",
    indices = [
        Index(
            value = ["id", "name"],
            unique = true
        )
    ]
)
data class Project(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "user_id") val userId: String?,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "color") val color: String?
)