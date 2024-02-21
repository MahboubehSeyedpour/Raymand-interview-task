package com.example.raymand_interview_task.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.raymand_interview_task.R
import com.example.raymand_interview_task.presentation.screen.details.DetailsViewModel

@Composable
fun CardInfo(viewModel: DetailsViewModel, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        elevation = 8.dp
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = viewModel.movie?.titleText?.text ?: "")
                Spacer(modifier = Modifier.height(10.dp))
                Divider()
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Info(
                        title = "Rate",
                        data = (viewModel.movie?.ratingsSummary?.aggregateRating ?: "").toString()
                    )
                    Info(title = "Type", data = (viewModel.movie?.titleType?.text ?: "").toString())
                    Info(
                        title = "Year",
                        data = (viewModel.movie?.releaseYear?.year ?: "").toString()
                    )
                }
            }

            Image(
                painter = painterResource(id = R.mipmap.imdb_foreground),
                contentDescription = "imdb"
            )
        }
    }
}