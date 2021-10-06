package com.codedev.cryptocurrencyapplication.data.remote.models.remote_status_update

data class StatusUpdate(
    val category: String,
    val created_at: String,
    val description: String,
    val pin: Boolean,
    val project: Project,
    val user: String,
    val user_title: String
)