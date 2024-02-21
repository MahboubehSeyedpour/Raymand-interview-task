package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Node(@SerializedName("attributeId")
                val attributeId: String = "",
                @SerializedName("question")
                val question: Question,
                @SerializedName("__typename")
                val Typename: String = "")