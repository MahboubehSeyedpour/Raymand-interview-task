package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class ResultOfNameResult(
    @SerializedName("id")
    val id: String,
    @SerializedName("displayNameText")
    val displayNameText: String,
    @SerializedName("knownForJobCategory")
    val knownForJobCategory: String,
    @SerializedName("knownForTitleText")
    val knownForTitleText: String,
    @SerializedName("knownForTitleYear")
    val knownForTitleYear: String,
    @SerializedName("avatarImageModel")
    val avatarImageModel: AvatarImageModel,
)
