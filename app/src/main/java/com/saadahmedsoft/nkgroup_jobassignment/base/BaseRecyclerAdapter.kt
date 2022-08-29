package com.saadahmedsoft.base

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<T: Any, VB: ViewDataBinding> : RecyclerView.Adapter<BaseViewHolder<VB>>() {

    private var items = mutableListOf<T>()

    @get: LayoutRes
    abstract val layoutRes: Int

    abstract fun onBind(binding: VB, item: T, position: Int)

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(items: List<T>) {
        this.items = items as MutableList<T>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BaseViewHolder<VB>(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            layoutRes,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        onBind(holder.binding, items[position], position)
    }

    override fun getItemCount() = items.size

    interface OnItemActionListener<T> {
        fun onDeleteClickListener(view: View, item: T, position: Int)
    }
}