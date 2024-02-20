package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class NameResults(
    @SerializedName("results")
    val results: List<ResultOfNameResult>,
    @SerializedName("nextCursor")
    val nextCursor: String,
    @SerializedName("hasExactMatches")
    val hasExactMatches: Boolean,
)
