package com.saadahmedsoft.nkgroup_jobassignment.services.model.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Department(
    @SerializedName("id")
    @Expose
    val id: Int? = null,
    @SerializedName("title")
    @Expose
    val title: String? = null,
    @SerializedName("description")
    @Expose
    val description: String? = null,
    @SerializedName("tenant_id")
    @Expose
    val tenantId: String? = null,
    @SerializedName("created_at")
    @Expose
    val createdAt: String? = null,
    @SerializedName("updated_at")
    @Expose
    val updatedAt: String? = null,
)