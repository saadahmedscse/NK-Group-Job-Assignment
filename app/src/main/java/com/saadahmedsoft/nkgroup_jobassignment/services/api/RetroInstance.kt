package com.saadahmedsoft.nkgroup_jobassignment.services.api

import com.saadahmedsoft.base.utils.Constants.Api.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val getInstance: APIInterface by lazy {
        retrofit.create(APIInterface::class.java)
    }
}