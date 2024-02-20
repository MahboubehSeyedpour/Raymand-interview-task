package com.example.raymand_interview_task.data

import com.example.raymand_interview_task.data.response.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {


    @GET("/v1/find")
    suspend fun search(@Query("query") query: String?): Response<SearchResponse>
}