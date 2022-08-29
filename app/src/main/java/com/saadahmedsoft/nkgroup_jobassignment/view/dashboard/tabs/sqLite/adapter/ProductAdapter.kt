package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.sqLite.adapter

import android.annotation.SuppressLint
import com.saadahmedsoft.base.BaseRecyclerAdapter
import com.saadahmedsoft.nkgroup_jobassignment.R
import com.saadahmedsoft.nkgroup_jobassignment.databinding.ItemLayoutProductBinding
import com.saadahmedsoft.nkgroup_jobassignment.services.model.room.Product
import java.text.SimpleDateFormat
import java.util.*

class ProductAdapter : BaseRecyclerAdapter<Product, ItemLayoutProductBinding>() {
    override val layoutRes: Int
        get() = R.layout.item_layout_product

    @SuppressLint("SimpleDateFormat")
    override fun onBind(binding: ItemLayoutProductBinding, item: Product, position: Int) {
        binding.name.text = item.name
        binding.price.text = item.price.toString()

        val sdf = SimpleDateFormat("dd-MM-yy")
        val date = Date(item.time.toLong())
        binding.date.text = sdf.format(date)
    }
}