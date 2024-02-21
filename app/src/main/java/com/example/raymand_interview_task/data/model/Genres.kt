package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Genres(@SerializedName("__typename")
                  val Typename: String = "",
                  @SerializedName("genre")
                  val genre: Genre)