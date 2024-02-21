package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class AssociatedTitle (

    @SerializedName("id") val id : String,
    @SerializedName("releaseYear") val releaseYear : ReleaseYear,
    @SerializedName("titleText") val titleText : TitleText,
    @SerializedName("originalTitleText") val originalTitleText : OriginalTitleText,
    @SerializedName("series") val series : String,
    @SerializedName("__typename") val __typename : String
)