package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class DirectorsPageTitleItem(@SerializedName("credits")
                                  val credits: List<CreditsItem>?,
                                  @SerializedName("__typename")
                                  val Typename: String = "")