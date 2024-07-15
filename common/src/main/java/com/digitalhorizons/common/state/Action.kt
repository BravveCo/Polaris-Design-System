package com.digitalhorizons.common.state

sealed class AppAction : ViewAction {
    object LoadData : AppAction()
    data class DataLoaded(val data: List<String>) : AppAction()
    data class ErrorOccurred(val error: String) : AppAction()
}