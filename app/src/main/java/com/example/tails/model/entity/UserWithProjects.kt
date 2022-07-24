package com.example.tails.model.entity

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithProjects(
    @Embedded
    val user: User,
    @Relation(
        parentColumn = "id",
        entity = Project::class,
        entityColumn = "user_id"
    )
    val projects: List<Project>
)
