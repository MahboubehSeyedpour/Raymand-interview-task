package com.example.raymand_interview_task.presentation.screen.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.raymand_interview_task.R
import com.example.raymand_interview_task.presentation.components.CardInfo
import com.example.raymand_interview_task.presentation.components.Imageposter
import com.example.raymand_interview_task.presentation.components.MovieSummary

@Composable
fun DetailsScreen(
    navController: NavController,
    viewModel: DetailsViewModel = hiltViewModel()
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .weight(2f)
                    .padding(8.dp),
            ) {
                Imageposter(viewModel)
                Spacer(modifier = Modifier.height(20.dp))
            }

            Row(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
            ) {
                Spacer(modifier = Modifier.height(20.dp))
            }

            Row(
                modifier = Modifier
                    .weight(2f)
                    .padding(8.dp),
            ) {
                MovieSummary(viewModel)
            }
        }
        CardInfo(
            viewModel,
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.card_spacing))
                .fillMaxWidth()
        )
    }
}