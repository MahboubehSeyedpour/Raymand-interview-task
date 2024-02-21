package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class DisplayableProperty(@SerializedName("__typename")
                               val Typename: String = "",
                               @SerializedName("value")
                               val value: Value)