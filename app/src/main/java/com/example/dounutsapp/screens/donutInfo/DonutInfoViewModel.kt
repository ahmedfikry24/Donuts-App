package com.example.dounutsapp.screens.donutInfo

import androidx.lifecycle.ViewModel
import com.example.dounutsapp.screens.donutInfo.state.DonutInfoUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DonutInfoViewModel : ViewModel() {

    private val _state = MutableStateFlow(DonutInfoUiState())
    val state = _state.asStateFlow()

    fun onClickMines() {
        if (state.value.quantity > 0) {
            _state.update {
                it.copy(
                    quantity = state.value.quantity - 1,
                    quantityStatus = false,
                    totalPrice = state.value.totalPrice - 16
                )
            }
        }
    }

    fun onClickPlus() {
        _state.update {
            it.copy(
                quantity = state.value.quantity + 1,
                quantityStatus = true,
                totalPrice = state.value.totalPrice + 16
            )
        }
    }
}