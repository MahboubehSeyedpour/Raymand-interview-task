package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Meta(@SerializedName("publicationStatus")
                val publicationStatus: String = "",
                @SerializedName("canonicalId")
                val canonicalId: String = "",
                @SerializedName("__typename")
                val Typename: String = "")