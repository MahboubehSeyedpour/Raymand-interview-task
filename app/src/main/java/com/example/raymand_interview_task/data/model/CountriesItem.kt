package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class CountriesItem(@SerializedName("__typename")
                         val Typename: String = "",
                         @SerializedName("id")
                         val id: String = "")