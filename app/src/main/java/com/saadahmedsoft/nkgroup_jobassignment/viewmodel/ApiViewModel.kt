package com.saadahmedsoft.nkgroup_jobassignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saadahmedsoft.base.utils.DataState
import com.saadahmedsoft.nkgroup_jobassignment.services.api.RetroInstance
import com.saadahmedsoft.nkgroup_jobassignment.services.model.api.DoctorResponse
import com.saadahmedsoft.nkgroup_jobassignment.services.repository.ApiRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ApiViewModel : ViewModel() {
    val repo = ApiRepository()

    private val mutableLiveData = MutableLiveData<DataState<DoctorResponse>>()
    val liveData: LiveData<DataState<DoctorResponse>>
        get() = mutableLiveData

    fun getDoctors(instance: RetroInstance) {
        viewModelScope.launch(Dispatchers.IO) {
            repo.getDoctors(mutableLiveData, instance)
        }
    }
}