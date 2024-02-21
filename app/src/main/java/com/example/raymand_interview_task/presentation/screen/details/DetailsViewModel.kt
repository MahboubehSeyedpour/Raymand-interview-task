package com.example.raymand_interview_task.presentation.screen.details

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.raymand_interview_task.data.ModelState
import com.example.raymand_interview_task.data.Resource
import com.example.raymand_interview_task.data.repositories.MovieRepository
import com.example.raymand_interview_task.data.response.MovieDetailsResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    val movieRepository: MovieRepository
) : ViewModel() {

    var movieId by mutableStateOf(savedStateHandle.get<String>("id")!!)
        private set

    var state by mutableStateOf(ModelState<MovieDetailsResponse>())
        private set

    var movie by mutableStateOf<MovieDetailsResponse?>(null)

    init {
        getMovieDetails()
    }

    fun getMovieDetails() {
        movieRepository.getMovieDetails(movieId).onEach { result ->
            when (result) {
                is Resource.Error -> {
                    state = ModelState(error = result.message ?: "")
                }

                is Resource.Loading -> {
                    state = ModelState(isLoading = true)
                }

                is Resource.Success -> {
                    movie = result.data
                    state = ModelState(response = result.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}