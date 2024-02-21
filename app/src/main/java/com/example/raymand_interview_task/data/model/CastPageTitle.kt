package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class CastPageTitle(@SerializedName("__typename")
                         val Typename: String = "",
                         @SerializedName("edges")
                         val edges: List<EdgesItem>?)