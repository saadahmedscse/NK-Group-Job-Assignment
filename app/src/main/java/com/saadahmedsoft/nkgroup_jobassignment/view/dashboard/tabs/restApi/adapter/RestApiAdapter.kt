package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.restApi.adapter

import android.annotation.SuppressLint
import com.saadahmedsoft.base.BaseRecyclerAdapter
import com.saadahmedsoft.nkgroup_jobassignment.R
import com.saadahmedsoft.nkgroup_jobassignment.databinding.ItemLayoutApiBinding
import com.saadahmedsoft.nkgroup_jobassignment.services.model.api.Doctor
import com.squareup.picasso.Picasso

class RestApiAdapter : BaseRecyclerAdapter<Doctor, ItemLayoutApiBinding>() {
    override val layoutRes: Int
        get() = R.layout.item_layout_api

    @SuppressLint("SetTextI18n")
    override fun onBind(binding: ItemLayoutApiBinding, item: Doctor, position: Int) {
        binding.department.text = item.department!!.title
        binding.name.text = item.user!!.firstName + " " + item.user.lastName
        binding.email.text = item.user.email
        binding.qualification.text = item.specialist

        Picasso.get().load(item.user.media!![0].originalUrl).into(binding.picture)
    }
}