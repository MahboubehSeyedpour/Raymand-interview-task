package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("id")
    val id: String,
    @SerializedName("titleNameText")
    val titleNameText: String,
    @SerializedName("titleTypeText")
    val titleTypeText: String,
    @SerializedName("topCredits")
    val topCredits: List<String>,
    @SerializedName("imageType")
    val imageType: String,
    @SerializedName("titleReleaseText")
    val titleReleaseText: String,
    @SerializedName("titlePosterImageModel")
    val titlePosterImageModel: TitlePosterImageModel?,
)
