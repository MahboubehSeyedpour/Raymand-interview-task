package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class AvatarImageModel(
    @SerializedName("url")
    val url: String,
    @SerializedName("maxHeight")
    val maxHeight: Int,
    @SerializedName("maxWidth")
    val maxWidth: Int,
    @SerializedName("caption")
    val caption: String,
)
