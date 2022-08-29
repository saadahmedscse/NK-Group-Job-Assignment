package com.saadahmedsoft.nkgroup_jobassignment.services.repository

import androidx.lifecycle.LiveData
import com.saadahmedsoft.nkgroup_jobassignment.services.dao.ProductDao
import com.saadahmedsoft.nkgroup_jobassignment.services.model.room.Product

class ProductRepository(private val dao: ProductDao) {

    fun getProducts(): LiveData<List<Product>> = dao.getProducts()

    fun insertProduct(product: Product) {
        dao.insertProduct(product)
    }
}