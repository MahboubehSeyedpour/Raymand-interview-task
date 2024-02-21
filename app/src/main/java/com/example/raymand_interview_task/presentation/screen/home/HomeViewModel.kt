package com.example.raymand_interview_task.presentation.screen.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.raymand_interview_task.data.ModelState
import com.example.raymand_interview_task.data.Resource
import com.example.raymand_interview_task.data.model.Result
import com.example.raymand_interview_task.data.model.ResultOfNameResult
import com.example.raymand_interview_task.data.repositories.MovieRepository
import com.example.raymand_interview_task.data.response.SearchResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val movieRepository: MovieRepository
) : ViewModel() {

    var events = MutableSharedFlow<HomeEvents>()
        private set
    var searchState by mutableStateOf(ModelState<SearchResponse>())
        private set
    var titleResults by mutableStateOf<List<Result>>(emptyList())
    var nameResults by mutableStateOf<List<ResultOfNameResult>>(emptyList())
    var searchQuery by mutableStateOf("")

    fun onSearchQueryChanged(value: String) {
        searchQuery = value
    }


    fun onSearchClicked() {
        movieRepository.search(searchQuery).onEach { result ->
            when (result) {
                is Resource.Error -> {
                    searchState = ModelState(error = result.message ?: "")
                }

                is Resource.Loading -> {
                    searchState = ModelState(isLoading = true)
                }

                is Resource.Success -> {
                    titleResults = result.data?.titleResults?.results ?: emptyList()
                    nameResults = result.data?.nameResults?.results ?: emptyList()
                    searchState = ModelState(response = result.data)
                }
            }
        }.launchIn(viewModelScope)
    }

    fun navigateToDetails(id: String) = viewModelScope.launch {
        events.emit(HomeEvents.NavigateToDetails(id))
    }

}