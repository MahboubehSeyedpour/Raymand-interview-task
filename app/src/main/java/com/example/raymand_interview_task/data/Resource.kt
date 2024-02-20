package com.example.raymand_interview_task.data

sealed class Resource<T>(val data: T? = null, val message: String? = null, val status: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(status: String?, message: String?, data: T? = null) : Resource<T>(data, message, status)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}