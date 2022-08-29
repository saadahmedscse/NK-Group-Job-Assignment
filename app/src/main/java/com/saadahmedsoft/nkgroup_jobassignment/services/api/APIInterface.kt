package com.saadahmedsoft.nkgroup_jobassignment.services.api

import com.saadahmedsoft.nkgroup_jobassignment.services.model.api.DoctorResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface APIInterface {
    @Headers("Content-Type: application/json")
    @GET("our-doctors")
    suspend fun getDoctors() : Response<DoctorResponse>
}