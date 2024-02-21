package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class TitleGenres(@SerializedName("genres")
                       val genres: List<Genres>?,
                       @SerializedName("__typename")
                       val Typename: String = "")