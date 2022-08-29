package com.saadahmedsoft.base.helper

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager

fun linearLayoutManager(context: Context) = LinearLayoutManager(context)
fun staggeredGridLayoutManager() = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)