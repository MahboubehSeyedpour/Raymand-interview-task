package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class CreditsItem(@SerializedName("__typename")
                       val Typename: String = "",
                       @SerializedName("name")
                       val name: Name)