package com.example.android3homework5mc5.utils

data class UiState<T>(
    val isLoading: Boolean = true,
    val error: String? = null,
    val success: T? = null
)
