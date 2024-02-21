package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Characters (

    @SerializedName("character") val character : String,
    @SerializedName("name") val name : Name,
    @SerializedName("__typename") val __typename : String
)