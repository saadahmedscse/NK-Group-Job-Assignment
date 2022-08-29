package com.saadahmedsoft.nkgroup_jobassignment.services.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.saadahmedsoft.base.utils.Constants.Database.TABLE_NAME
import com.saadahmedsoft.nkgroup_jobassignment.services.dao.ProductDao
import com.saadahmedsoft.nkgroup_jobassignment.services.model.room.Product

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class ProductDatabase : RoomDatabase() {

    abstract fun applicationDao(): ProductDao

    companion object {
        @Volatile
        var instance: ProductDatabase? = null

        fun getDatabaseInstance(context: Context): ProductDatabase {
            val tempInstance = instance

            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val roomDatabaseInstance = Room.databaseBuilder(
                    context,
                    ProductDatabase::class.java,
                    TABLE_NAME
                ).allowMainThreadQueries().build()
                instance = roomDatabaseInstance
                return instance as ProductDatabase
            }
        }
    }
}