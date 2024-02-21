package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class PrimaryImage(@SerializedName("__typename")
                        val Typename: String = "",
                        @SerializedName("width")
                        val width: Int = 0,
                        @SerializedName("caption")
                        val caption: Caption,
                        @SerializedName("id")
                        val id: String = "",
                        @SerializedName("url")
                        val url: String = "",
                        @SerializedName("height")
                        val height: Int = 0)