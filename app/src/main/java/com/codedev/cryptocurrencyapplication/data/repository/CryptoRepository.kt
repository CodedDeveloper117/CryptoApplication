package com.codedev.cryptocurrencyapplication.data.repository

import com.codedev.cryptocurrencyapplication.data.remote.models.exchanges.RemoteExchanges
import com.codedev.cryptocurrencyapplication.data.remote.models.remote_coin.RemoteCoinItem
import com.codedev.cryptocurrencyapplication.data.remote.models.remote_status_update.RemoteStatusUpdate
import com.codedev.cryptocurrencyapplication.data.remote.models.trending.RemoteTrendingCoinsList
import com.codedev.cryptocurrencyapplication.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface CryptoRepository {

    suspend fun getTrendingCryptos(): Flow<Resource<RemoteTrendingCoinsList>>

    suspend fun getStatusUpdate(): Flow<Resource<RemoteStatusUpdate>>

    suspend fun getCoinInfo(): Flow<Resource<RemoteCoinItem>>

    suspend fun getExchanges(): Flow<Resource<RemoteExchanges>>

}