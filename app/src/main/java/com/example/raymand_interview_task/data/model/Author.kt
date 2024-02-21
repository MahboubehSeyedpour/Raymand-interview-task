package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Author (

    @SerializedName("nickName") val nickName : String,
    @SerializedName("__typename") val __typename : String
)