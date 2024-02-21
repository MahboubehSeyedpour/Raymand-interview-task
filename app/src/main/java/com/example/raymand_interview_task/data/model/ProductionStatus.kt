package com.example.raymand_interview_task.data.model

import com.google.gson.annotations.SerializedName

data class ProductionStatus(@SerializedName("currentProductionStage")
                            val currentProductionStage: CurrentProductionStage,
                            @SerializedName("productionStatusHistory")
                            val productionStatusHistory: List<ProductionStatusHistoryItem>?,
                            @SerializedName("__typename")
                            val Typename: String = "",
                            @SerializedName("restriction")
                            val restriction: Any)