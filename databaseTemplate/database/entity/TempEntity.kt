package com.example.retrofittemplate.databaseTemplate.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TempEntity(
    @PrimaryKey(autoGenerate = true) val uid: Long? = null,
    val description: String? = null,
    val type: String,
    val amount: Double,
    val categoryId: Long,
    val timestamp: String,
)