package com.example.raymand_interview_task.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.SubcomposeAsyncImage
import com.example.raymand_interview_task.presentation.screen.details.DetailsViewModel

@Composable
fun Imageposter(viewModel: DetailsViewModel) {
    SubcomposeAsyncImage(
        model = viewModel.movie?.primaryImage?.url,
        contentDescription = viewModel.movie?.primaryImage?.caption?.plainText,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}