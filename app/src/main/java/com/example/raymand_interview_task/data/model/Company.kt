package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Company(@SerializedName("__typename")
                   val Typename: String = "",
                   @SerializedName("companyText")
                   val companyText: CompanyText,
                   @SerializedName("id")
                   val id: String = "")