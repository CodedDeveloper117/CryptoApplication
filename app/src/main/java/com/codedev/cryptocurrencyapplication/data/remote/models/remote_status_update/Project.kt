package com.codedev.cryptocurrencyapplication.data.remote.models.remote_status_update

data class Project(
    val id: String,
    val image: Image,
    val name: String,
    val symbol: String,
    val type: String
)