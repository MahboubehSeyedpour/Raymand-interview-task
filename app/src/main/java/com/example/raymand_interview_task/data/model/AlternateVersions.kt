package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class AlternateVersions(@SerializedName("total")
                             val total: Int = 0,
                             @SerializedName("__typename")
                             val Typename: String = "")