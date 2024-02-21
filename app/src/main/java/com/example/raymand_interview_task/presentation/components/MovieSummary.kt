package com.example.raymand_interview_task.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.raymand_interview_task.presentation.screen.details.DetailsViewModel

@Composable
fun MovieSummary(viewModel: DetailsViewModel) {
    LazyColumn(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Bottom) {
        item {
            Text(
                text = viewModel.movie?.plot?.plotText?.plainText ?: "",
                color = Color.DarkGray,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}