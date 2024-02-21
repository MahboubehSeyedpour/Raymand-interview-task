package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class ItemsItem(@SerializedName("__typename")
                     val Typename: String = "",
                     @SerializedName("conceptId")
                     val conceptId: String = "",
                     @SerializedName("text")
                     val text: String = "")