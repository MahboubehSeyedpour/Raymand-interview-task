package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class CountriesOfOrigin(@SerializedName("__typename")
                             val Typename: String = "",
                             @SerializedName("countries")
                             val countries: List<CountriesItem>?)