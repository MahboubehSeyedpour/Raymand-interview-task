package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class CanRate(@SerializedName("__typename")
                   val Typename: String = "",
                   @SerializedName("isRatable")
                   val isRatable: Boolean = false)