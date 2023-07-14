package com.example.dounutsapp.screens.home

import androidx.lifecycle.ViewModel
import com.example.dounutsapp.screens.home.state.HomeUiSate
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _state = MutableStateFlow(HomeUiSate())
    val state: StateFlow<HomeUiSate>
        get() = _state
}