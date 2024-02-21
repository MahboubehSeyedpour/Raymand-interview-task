package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class TechnicalSpecifications(@SerializedName("__typename")
                                   val Typename: String = "",
                                   @SerializedName("colorations")
                                   val colorations: Colorations,
                                   @SerializedName("soundMixes")
                                   val soundMixes: SoundMixes,
                                   @SerializedName("aspectRatios")
                                   val aspectRatios: AspectRatios)