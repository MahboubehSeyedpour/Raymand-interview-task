package com.example.raymand_interview_task.data.repositories

import com.example.raymand_interview_task.data.Resource
import com.example.raymand_interview_task.data.response.SearchResponse
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    fun search(query: String?): Flow<Resource<SearchResponse>>
}