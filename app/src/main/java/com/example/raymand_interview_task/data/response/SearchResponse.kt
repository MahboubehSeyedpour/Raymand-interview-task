package com.example.raymand_interview_task.data.response

import com.example.raymand_interview_task.data.model.CompanyResults
import com.example.raymand_interview_task.data.model.FindPageMeta
import com.example.raymand_interview_task.data.model.KeywordResults
import com.example.raymand_interview_task.data.model.NameResults
import com.example.raymand_interview_task.data.model.TitleResults
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("resultsSectionOrder")
    val resultsSectionOrder: List<String>,
    @SerializedName("findPageMeta")
    val findPageMeta: FindPageMeta,
    @SerializedName("keywordResults")
    val keywordResults: KeywordResults,
    @SerializedName("titleResults")
    val titleResults: TitleResults,
    @SerializedName("nameResults")
    val nameResults: NameResults,
    @SerializedName("companyResults")
    val companyResults: CompanyResults
)
