package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class IframeAddReviewLink(@SerializedName("__typename")
                               val Typename: String = "",
                               @SerializedName("url")
                               val url: String = "")