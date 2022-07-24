package com.example.tails.model.entity

import androidx.room.*

@Entity(
    tableName = "task_table",
    indices = [
        Index(
            value = ["name"],
            unique = true
        )
    ]
)
data class Task(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "project_id") val projectId: Int?,
    @ColumnInfo(name = "finished") val isFinished: Boolean?,
    @ColumnInfo(name = "priority") val priority: String?,
    @ColumnInfo(name = "sections") val sections: Int?,
    @ColumnInfo(name = "work_time") val workTime: Int?,
    @ColumnInfo(name = "break_time") val breakTime: Int?,
    @ColumnInfo(name = "rest_time") val restTime: Int?
)

enum class Priority {
    LOW,
    MED,
    HIGH
}

