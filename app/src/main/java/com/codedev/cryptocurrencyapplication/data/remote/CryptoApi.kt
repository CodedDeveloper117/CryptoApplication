package com.codedev.cryptocurrencyapplication.data.remote

import com.codedev.cryptocurrencyapplication.data.remote.models.exchanges.RemoteExchanges
import com.codedev.cryptocurrencyapplication.data.remote.models.remote_coin.RemoteCoinItem
import com.codedev.cryptocurrencyapplication.data.remote.models.remote_status_update.RemoteStatusUpdate
import com.codedev.cryptocurrencyapplication.data.remote.models.trending.RemoteTrendingCoinsList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoApi {

    @GET("search/trending")
    suspend fun getTrendingCoins() : Response<RemoteTrendingCoinsList>

    @GET("status_update")
    suspend fun getStatusUpdate(
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 15
    ): Response<RemoteStatusUpdate>

    @GET("exchanges")
    suspend fun getExchanges(
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 15
    ): Response<RemoteExchanges>

    @GET("coins/markets")
    suspend fun getCoinInfo(
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 15,
        @Query("vs_currency") currency: String = "usd",
        @Query("order") order: String = "market_cap_desc",
        @Query("sparkline") sparkline: Boolean = false
    ): Response<RemoteCoinItem>
}