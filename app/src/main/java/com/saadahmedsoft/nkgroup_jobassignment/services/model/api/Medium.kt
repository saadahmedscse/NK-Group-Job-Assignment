package com.saadahmedsoft.nkgroup_jobassignment.services.model.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Medium(
    @SerializedName("id")
    @Expose
    val id: Int? = null,
    @SerializedName("model_type")
    @Expose
    val modelType: String? = null,
    @SerializedName("model_id")
    @Expose
    val modelId: String? = null,
    @SerializedName("collection_name")
    @Expose
    val collectionName: String? = null,
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("file_name")
    @Expose
    val fileName: String? = null,
    @SerializedName("mime_type")
    @Expose
    val mimeType: String? = null,
    @SerializedName("disk")
    @Expose
    val disk: String? = null,
    @SerializedName("size")
    @Expose
    val size: String? = null,
    @SerializedName("manipulations")
    @Expose
    val manipulations: List<Any>? = null,
    @SerializedName("custom_properties")
    @Expose
    val customProperties: List<Any>? = null,
    @SerializedName("responsive_images")
    @Expose
    val responsiveImages: List<Any>? = null,
    @SerializedName("order_column")
    @Expose
    val orderColumn: String? = null,

    @SerializedName("created_at")
    @Expose
    val createdAt: String? = null,

    @SerializedName("updated_at")
    @Expose
    val updatedAt: String? = null,

    @SerializedName("conversions_disk")
    @Expose
    val conversionsDisk: String? = null,

    @SerializedName("uuid")
    @Expose
    val uuid: String? = null,
    @SerializedName("generated_conversions")
    @Expose
    val generatedConversions: List<Any>? = null,
    @SerializedName("original_url")
    @Expose
    val originalUrl: String? = null,

    @SerializedName("preview_url")
    @Expose
    val previewUrl: String? = null
)
