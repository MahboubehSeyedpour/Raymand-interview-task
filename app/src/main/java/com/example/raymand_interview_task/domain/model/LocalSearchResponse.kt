package com.example.raymand_interview_task.domain.model

import com.example.raymand_interview_task.data.model.Result
import com.example.raymand_interview_task.data.model.ResultOfNameResult

data class LocalSearchResponse(
    val titleResults: List<Result>,
    val nameResults: List<ResultOfNameResult>,
    val message: String
)
