package com.codedev.cryptocurrencyapplication.data.remote.models.trending

data class RemoteTrendingCoinsList(
    val coins: List<Coin>,
    val exchanges: List<Any>
)