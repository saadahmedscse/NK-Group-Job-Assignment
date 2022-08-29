package com.saadahmedsoft.nkgroup_jobassignment.services.model.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    @Expose
    val id: Int? = null,
    @SerializedName("agent_id")
    @Expose
    val agentId: Any? = null,
    @SerializedName("department_id")
    @Expose
    val departmentId: String? = null,
    @SerializedName("first_name")
    @Expose
    val firstName: String? = null,
    @SerializedName("last_name")
    @Expose
    val lastName: String? = null,
    @SerializedName("email")
    @Expose
    val email: String? = null,
    @SerializedName("balance")
    @Expose
    val balance: String? = null,
    @SerializedName("designation")
    @Expose
    val designation: String? = null,
    @SerializedName("phone")
    @Expose
    val phone: String? = null,
    @SerializedName("address")
    @Expose
    val address: Any? = null,
    @SerializedName("commission")
    @Expose
    val commission: Any? = null,
    @SerializedName("gender")
    @Expose
    val gender: String? = null,
    @SerializedName("qualification")
    @Expose
    val qualification: String? = null,
    @SerializedName("blood_group")
    @Expose
    val bloodGroup: Any? = null,
    @SerializedName("dob")
    @Expose
    val dob: String? = null,
    @SerializedName("email_verified_at")
    @Expose
    val emailVerifiedAt: Any? = null,
    @SerializedName("owner_id")
    @Expose
    val ownerId: String? = null,

    @SerializedName("owner_type")
    @Expose
    val ownerType: String? = null,

    @SerializedName("status")
    @Expose
    val status: String? = null,

    @SerializedName("language")
    @Expose
    val language: String? = null,

    @SerializedName("username")
    @Expose
    val username: Any? = null,

    @SerializedName("hospital_name")
    @Expose
    val hospitalName: String? = null,

    @SerializedName("tenant_id")
    @Expose
    val tenantId: String? = null,

    @SerializedName("tenant_type")
    @Expose
    val tenantType: String? = null,

    @SerializedName("facebook_url")
    @Expose
    val facebookUrl: Any? = null,

    @SerializedName("twitter_url")
    @Expose
    val twitterUrl: Any? = null,

    @SerializedName("instagram_url")
    @Expose
    val instagramUrl: Any? = null,

    @SerializedName("linkedIn_url")
    @Expose
    val linkedInUrl: Any? = null,

    @SerializedName("division")
    @Expose
    val division: String? = null,

    @SerializedName("district")
    @Expose
    val district: String? = null,

    @SerializedName("thana")
    @Expose
    val thana: String? = null,

    @SerializedName("village")
    @Expose
    val village: Any? = null,

    @SerializedName("disease")
    @Expose
    val disease: Any? = null,

    @SerializedName("discount")
    @Expose
    val discount: String? = null,

    @SerializedName("disease_details")
    @Expose
    val diseaseDetails: Any? = null,

    @SerializedName("created_at")
    @Expose
    val createdAt: String? = null,

    @SerializedName("updated_at")
    @Expose
    val updatedAt: String? = null,

    @SerializedName("full_name")
    @Expose
    val fullName: String? = null,

    @SerializedName("age")
    @Expose
    val age: Int? = null,

    @SerializedName("media")
    @Expose
    val media: List<Medium>? = null
)
