package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Entity(@SerializedName("primaryImage")
                  val primaryImage: PrimaryImage,
                  @SerializedName("__typename")
                  val Typename: String = "")