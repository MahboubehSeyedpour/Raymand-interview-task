package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class ProductionBudget(@SerializedName("__typename")
                            val Typename: String = "",
                            @SerializedName("budget")
                            val budget: Budget)