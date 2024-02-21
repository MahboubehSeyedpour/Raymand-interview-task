package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class Colorations(@SerializedName("__typename")
                       val Typename: String = "",
                       @SerializedName("items")
                       val items: List<ItemsItem>?)