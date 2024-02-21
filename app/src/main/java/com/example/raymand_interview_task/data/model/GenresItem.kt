package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class GenresItem(@SerializedName("__typename")
                      val Typename: String = "",
                      @SerializedName("text")
                      val text: String = "",
                      @SerializedName("id")
                      val id: String = "")