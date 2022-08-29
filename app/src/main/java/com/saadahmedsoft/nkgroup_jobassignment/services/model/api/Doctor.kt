package com.saadahmedsoft.nkgroup_jobassignment.services.model.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Doctor(
    @SerializedName("id")
    @Expose
    val id: Int? = null,
    @SerializedName("user_id")
    @Expose
    val userId: Int? = null,
    @SerializedName("doctor_department_id")
    @Expose
    val doctorDepartmentId: Int? = null,
    @SerializedName("specialist")
    @Expose
    val specialist: String? = null,
    @SerializedName("fee")
    @Expose
    val fee: String? = null,
    @SerializedName("experience")
    @Expose
    val experience: String? = null,
    @SerializedName("bmdc")
    @Expose
    val bmdc: String? = null,
    @SerializedName("tenant_id")
    @Expose
    val tenantId: String? = null,
    @SerializedName("created_at")
    @Expose
    val createdAt: String? = null,
    @SerializedName("updated_at")
    @Expose
    val updatedAt: String? = null,
    @SerializedName("department")
    @Expose
    val department: Department? = null,
    @SerializedName("user")
    @Expose
    val user: User? = null
)
