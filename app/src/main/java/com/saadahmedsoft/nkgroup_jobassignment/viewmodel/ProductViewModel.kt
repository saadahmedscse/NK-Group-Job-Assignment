package com.saadahmedsoft.nkgroup_jobassignment.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.saadahmedsoft.nkgroup_jobassignment.services.database.ProductDatabase
import com.saadahmedsoft.nkgroup_jobassignment.services.model.room.Product
import com.saadahmedsoft.nkgroup_jobassignment.services.repository.ProductRepository

class ProductViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: ProductRepository
    init {
        val dao = ProductDatabase.getDatabaseInstance(application).applicationDao()
        repository = ProductRepository(dao)
    }

    fun insertProduct(product: Product) {
        repository.insertProduct(product)
    }

    fun getProducts(): LiveData<List<Product>> {
        return repository.getProducts()
    }
}