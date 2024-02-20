package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class KeywordResults(
    @SerializedName("results")
    val results: List<Any>
)
