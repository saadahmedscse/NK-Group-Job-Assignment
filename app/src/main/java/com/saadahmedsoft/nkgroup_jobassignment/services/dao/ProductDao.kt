package com.saadahmedsoft.nkgroup_jobassignment.services.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.saadahmedsoft.base.utils.Constants.Database.TABLE_NAME
import com.saadahmedsoft.nkgroup_jobassignment.services.model.room.Product

@Dao
interface ProductDao {
    @Query("SELECT * FROM $TABLE_NAME ORDER BY id ASC")
    fun getProducts(): LiveData<List<Product>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProduct(product: Product)
}