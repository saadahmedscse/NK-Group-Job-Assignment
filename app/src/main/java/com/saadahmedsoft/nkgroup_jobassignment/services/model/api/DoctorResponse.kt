package com.saadahmedsoft.nkgroup_jobassignment.services.model.api

data class DoctorResponse(
    val status: String? = null,
    val msg: String? = null,
    val doctors: List<Doctor>? = null
)