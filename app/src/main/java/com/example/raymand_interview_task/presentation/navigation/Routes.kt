package com.example.raymand_interview_task.presentation.navigation

sealed class Routes(val route: String) {
    object Home: Routes("home")
    object Details: Routes("details")
}
