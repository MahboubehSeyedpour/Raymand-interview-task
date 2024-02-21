package com.example.raymand_interview_task.presentation.screen.home

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.raymand_interview_task.R
import com.example.raymand_interview_task.presentation.components.MovieCard
import com.example.raymand_interview_task.presentation.components.SearchBar
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
                is HomeEvents.NavigateToDetails -> navController.navigate("${Routes.Details.route}?id=${event.id}") {
                    launchSingleTop = true
                }
            }
        }
    }


    Column(modifier = Modifier.fillMaxSize()) {

        SearchBar(
            text = viewModel.searchQuery,
            onTextChanged = { value -> viewModel.onSearchQueryChanged(value) },
            onDone = { viewModel.onSearchClicked() }
        )

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Results(viewModel = viewModel)
            }

            if (viewModel.searchState.isLoading) {
                CircularProgressIndicator(color = colorResource(id = R.color.dark_gray))
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Results(viewModel: HomeViewModel) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        horizontalArrangement = Arrangement.SpaceBetween,
//            contentPadding = PaddingValues(12.dp),
        content = {

            items(items = viewModel.titleResults, key = { item -> item.id }) { item ->
                MovieCard(
                    modifier = Modifier
                        .padding(dimensionResource(id = R.dimen.card_spacing))
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                        .animateItemPlacement(
                            tween(durationMillis = 250)
                        )
                        .clickable { viewModel.navigateToDetails(item.id) },
                    title = item.titleNameText,
                    releaseDate = item.titleReleaseText,
                    imageDescription = item.titlePosterImageModel?.caption.orEmpty(),
                    imageUrl = item.titlePosterImageModel?.url ?: ""
                )
                Spacer(modifier = Modifier.height(12.dp))
            }


            items(items = viewModel.nameResults, key = { item -> item.id }) { item ->
                MovieCard(
                    modifier = Modifier
                        .padding(dimensionResource(id = R.dimen.card_spacing))
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                        .animateItemPlacement(
                            tween(durationMillis = 250)
                        )
                        .clickable { viewModel.navigateToDetails(item.id) },
                    title = item.knownForTitleText,
                    releaseDate = item.knownForTitleYear,
                    imageDescription = item.avatarImageModel.caption,
                    imageUrl = item.avatarImageModel.url ?: ""
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    )
}
