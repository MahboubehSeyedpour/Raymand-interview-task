package com.example.raymand_interview_task.data

data class ModelState<T>(
    val isLoading: Boolean = false,
    var response: T? = null,
    val error: String = ""
)