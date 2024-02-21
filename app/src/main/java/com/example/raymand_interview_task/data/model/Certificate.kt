package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Certificate(

    @SerializedName("rating") val rating : String,
    @SerializedName("__typename") val __typename : String
)