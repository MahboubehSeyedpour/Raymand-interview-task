package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Categories (

    @SerializedName("value") val value : String,
    @SerializedName("__typename") val __typename : String
)