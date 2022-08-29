package com.saadahmedsoft.nkgroup_jobassignment.services.repository

import androidx.lifecycle.MutableLiveData
import com.saadahmedsoft.base.utils.Constants.Errors.UNEXPECTED_ERROR_OCCURRED
import com.saadahmedsoft.base.utils.DataState
import com.saadahmedsoft.nkgroup_jobassignment.services.api.RetroInstance
import com.saadahmedsoft.nkgroup_jobassignment.services.model.api.DoctorResponse

class ApiRepository {
    suspend fun getDoctors(mutableLiveData: MutableLiveData<DataState<DoctorResponse>>, instance: RetroInstance) {
        try {
            val result = instance.getInstance.getDoctors()

            when {
                result.code() == 200 -> {
                    mutableLiveData.postValue(DataState.Success(result.body()))
                }
                else -> {
                    mutableLiveData.postValue(DataState.Failed(UNEXPECTED_ERROR_OCCURRED))
                }
            }
        } catch (e: Exception) {
            mutableLiveData.postValue(DataState.Failed(e.message))
        }
    }
}