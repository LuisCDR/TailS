package com.example.tails.model.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ProjectWithTasks(
    @Embedded val project: Project,
    @Relation(
        parentColumn = "id",
        entity = Task::class,
        entityColumn = "project_id"
    )
    val tasks: List<Task>
)
