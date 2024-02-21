package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Budget(@SerializedName("amount")
                  val amount: Int = 0,
                  @SerializedName("__typename")
                  val Typename: String = "",
                  @SerializedName("currency")
                  val currency: String = "")