package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class OriginalTitleText(@SerializedName("__typename")
                             val Typename: String = "",
                             @SerializedName("text")
                             val text: String = "")