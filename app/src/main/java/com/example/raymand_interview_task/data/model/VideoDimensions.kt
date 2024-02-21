package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class VideoDimensions (

    @SerializedName("aspectRatio") val aspectRatio : Double,
    @SerializedName("__typename") val __typename : String
)