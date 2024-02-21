package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Plot(@SerializedName("plotText")
                val plotText: PlotText,
                @SerializedName("__typename")
                val Typename: String = "",
                @SerializedName("language")
                val language: Language)