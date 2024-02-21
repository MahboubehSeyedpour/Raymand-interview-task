package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class TitleType(@SerializedName("__typename")
                     val Typename: String = "",
                     @SerializedName("canHaveEpisodes")
                     val canHaveEpisodes: Boolean = false,
                     @SerializedName("displayableProperty")
                     val displayableProperty: DisplayableProperty,
                     @SerializedName("id")
                     val id: String = "",
                     @SerializedName("text")
                     val text: String = "")