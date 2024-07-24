package com.example.android3homework5mc5.utils

interface CustomCallback <T>{

    fun onResponse(data: T)

    fun onFailure(t: Throwable)
}