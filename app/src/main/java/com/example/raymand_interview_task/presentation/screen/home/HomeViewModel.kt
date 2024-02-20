package com.example.raymand_interview_task.presentation.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    var events = MutableSharedFlow<HomeEvents>()
        private set

    fun navigateToDetails() = viewModelScope.launch {
        events.emit(HomeEvents.NavigateToDetails)
    }

}