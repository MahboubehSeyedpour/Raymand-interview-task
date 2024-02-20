package com.example.raymand_interview_task.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent
import com.example.raymand_interview_task.R

@Composable
fun MovieCard(
    modifier: Modifier = Modifier,
    elevation: Dp = 8.dp,
    title: String,
    releaseDate: String?,
    imageDescription: String,
    imageUrl: String
) {

    Card(
        modifier = modifier,
        elevation = elevation,
    ) {
        Box(
            modifier = Modifier.background(colorResource(id = R.color.dark_gray)),
            contentAlignment = Alignment.Center
        ) {
            MoviePoster(
                imageUrl = imageUrl,
                desc = imageDescription
            )
            MovieInfo(
                modifier = Modifier,
                textAlignment = TextAlign.End,
                title = title,
                releaseDate = releaseDate ?: ""
            )
        }
    }
}

@Composable
fun MoviePoster(
    imageUrl: String?,
    desc: String
) {
    SubcomposeAsyncImage(
        model = imageUrl,
        contentDescription = desc,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds,
        alpha = 0.6f
    )
}

@Composable
fun MovieInfo(modifier: Modifier, textAlignment: TextAlign, title: String, releaseDate: String?) {

    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Text(
            text = title,
            style = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            ),
            color = Color(0xFFFFFFFF),
            modifier = Modifier.fillMaxWidth().padding(dimensionResource(id = R.dimen.card_horizontal_padding))
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = releaseDate.orEmpty(),
            style = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            ),
            color = Color(0xFFFFFFFF),
            modifier = Modifier.fillMaxWidth()
        )

    }
}