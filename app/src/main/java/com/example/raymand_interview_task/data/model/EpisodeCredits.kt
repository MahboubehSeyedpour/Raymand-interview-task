package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class EpisodeCredits(@SerializedName("total")
                          val total: Int = 0,
                          @SerializedName("yearRange")
                          val yearRange: Any,
                          @SerializedName("__typename")
                          val Typename: String = "")