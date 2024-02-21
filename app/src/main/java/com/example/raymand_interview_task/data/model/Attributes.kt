package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Attributes (

    @SerializedName("text") val text : String,
    @SerializedName("__typename") val __typename : String
)