package com.saadahmedsoft.base.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToolbarViewModel : ViewModel() {

    private val _title = MutableLiveData<String>()
    val title: LiveData<String>
        get() = _title

    private val _isBackButtonVisible = MutableLiveData<Boolean>()
    val isBackButtonVisible: LiveData<Boolean>
        get() = _isBackButtonVisible

    fun setTitle(title: String) {
        _title.postValue(title)
    }

    fun setBackButtonState(state: Boolean) {
        _isBackButtonVisible.postValue(state)
    }
}