package com.digitalhorizons.common.state

data class AppState(
    val isLoading: Boolean = false,
    val data: List<String> = emptyList(),
    val error: String? = null
) : ViewState