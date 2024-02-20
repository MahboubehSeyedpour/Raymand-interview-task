package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class FindPageMeta(
    @SerializedName("searchTerm")
    val searchTerm: String,
    @SerializedName("includeAdult")
    val includeAdult: Boolean,
    @SerializedName("isExactMatch")
    val isExactMatch: Boolean,
)
