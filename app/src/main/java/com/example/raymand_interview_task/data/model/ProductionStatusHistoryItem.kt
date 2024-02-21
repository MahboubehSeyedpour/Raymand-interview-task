package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class ProductionStatusHistoryItem(@SerializedName("__typename")
                                       val Typename: String = "",
                                       @SerializedName("status")
                                       val status: Status)