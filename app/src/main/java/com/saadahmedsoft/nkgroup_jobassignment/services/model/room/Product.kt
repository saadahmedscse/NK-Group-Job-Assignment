package com.saadahmedsoft.nkgroup_jobassignment.services.model.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.saadahmedsoft.base.utils.Constants.Database.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String = "",
    val price: Double = 0.0,
    val time: String = ""
)
