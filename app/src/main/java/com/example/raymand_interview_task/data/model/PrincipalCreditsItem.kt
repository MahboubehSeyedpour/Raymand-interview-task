package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class PrincipalCreditsItem(@SerializedName("totalCredits")
                                val totalCredits: Int = 0,
                                @SerializedName("credits")
                                val credits: List<Credits>?,
                                @SerializedName("__typename")
                                val Typename: String = "",
                                @SerializedName("category")
                                val category: Category)