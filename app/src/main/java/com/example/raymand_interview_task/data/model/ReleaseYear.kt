package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class ReleaseYear(@SerializedName("year")
                       val year: Int = 0,
                       @SerializedName("__typename")
                       val Typename: String = "",
                       @SerializedName("endYear")
                       val endYear: Any)