package com.example.raymand_interview_task.presentation.screen.home

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.raymand_interview_task.presentation.navigation.Routes
import kotlinx.coroutines.flow.collectLatest

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {

    LaunchedEffect("events") {
        viewModel.events.collectLatest { event ->
            when (event) {
                is HomeEvents.NavigateToDetails -> navController.navigate(Routes.Details.route) {
                    launchSingleTop = true
                }
            }
        }
    }

    Button(onClick = { viewModel.navigateToDetails() }) {
        Text(text = "Navigate to Details")
    }
}