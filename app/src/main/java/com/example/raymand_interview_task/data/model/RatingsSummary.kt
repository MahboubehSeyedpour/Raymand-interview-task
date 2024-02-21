package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class RatingsSummary(@SerializedName("__typename")
                          val Typename: String = "",
                          @SerializedName("voteCount")
                          val voteCount: Int = 0,
                          @SerializedName("aggregateRating")
                          val aggregateRating: Double = 0.0)