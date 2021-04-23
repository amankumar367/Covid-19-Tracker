package com.covid.aman.ui

import com.covid.aman.data.model.StateData


sealed class MainState {
    object Init: MainState()
    object Loading: MainState()
    data class Error(var message: String?): MainState()
    data class Success(var data: List<StateData>): MainState()
}