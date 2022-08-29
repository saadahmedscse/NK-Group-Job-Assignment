package com.saadahmedsoft.base.helper

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

inline fun <T> LifecycleOwner.observe(
    liveData: MutableLiveData<T>,
    crossinline action: (T) -> Unit
) {
    liveData.observe(this) { it?.let(action) }
}

inline fun <T> LifecycleOwner.observe(liveData: LiveData<T>, crossinline action: (T) -> Unit) {
    liveData.observe(this) { it?.let(action) }
}