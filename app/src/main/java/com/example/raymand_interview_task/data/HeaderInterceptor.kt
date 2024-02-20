package com.example.raymand_interview_task.data

import com.example.raymand_interview_task.rapidApi_host
import com.example.raymand_interview_task.rapidApi_key
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class HeaderInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()

        requestBuilder.apply {
            addHeader(
                "X-RapidAPI-Host", rapidApi_host
            )
            addHeader(
                "X-RapidAPI-Key", rapidApi_key
            )
        }

        val request = requestBuilder.build()

        return chain.proceed(request)
    }
}