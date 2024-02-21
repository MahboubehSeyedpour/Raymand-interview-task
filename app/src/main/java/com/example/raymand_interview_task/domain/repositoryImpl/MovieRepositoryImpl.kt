package com.example.raymand_interview_task.domain.repositoryImpl

import com.example.raymand_interview_task.data.Resource
import com.example.raymand_interview_task.data.RetrofitService
import com.example.raymand_interview_task.data.SafeApiRequest
import com.example.raymand_interview_task.data.repositories.MovieRepository
import com.example.raymand_interview_task.data.response.MovieDetailsResponse
import com.example.raymand_interview_task.data.response.SearchResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api: RetrofitService
) : MovieRepository, SafeApiRequest() {
    override fun search(query: String?): Flow<Resource<SearchResponse>> = apiRequestFlow { api.search(query) }

    override fun getMovieDetails(id: String): Flow<Resource<MovieDetailsResponse>> = apiRequestFlow { api.getMovieDetails(id) }
}