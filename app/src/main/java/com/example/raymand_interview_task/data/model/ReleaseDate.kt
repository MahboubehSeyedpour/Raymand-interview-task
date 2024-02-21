package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class ReleaseDate(@SerializedName("month")
                       val month: Int = 0,
                       @SerializedName("year")
                       val year: Int = 0,
                       @SerializedName("__typename")
                       val Typename: String = "",
                       @SerializedName("day")
                       val day: Int = 0)