package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Value(@SerializedName("__typename")
                 val Typename: String = "",
                 @SerializedName("plainText")
                 val plainText: String = "")