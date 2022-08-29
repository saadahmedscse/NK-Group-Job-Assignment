package com.saadahmedsoft.nkgroup_jobassignment.services.model.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.saadahmedsoft.base.utils.Constants.Database.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Product(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var name: String = "",
    var price: Double = 0.0,
    var time: String = ""
)
