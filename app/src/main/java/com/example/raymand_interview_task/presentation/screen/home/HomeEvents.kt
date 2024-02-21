package com.example.raymand_interview_task.presentation.screen.home

sealed class HomeEvents {
    class NavigateToDetails(val id: String) : HomeEvents()
}