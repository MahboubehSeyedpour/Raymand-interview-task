package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class SpokenLanguages(@SerializedName("__typename")
                           val Typename: String = "",
                           @SerializedName("spokenLanguages")
                           val spokenLanguages: List<SpokenLanguagesItem>?)