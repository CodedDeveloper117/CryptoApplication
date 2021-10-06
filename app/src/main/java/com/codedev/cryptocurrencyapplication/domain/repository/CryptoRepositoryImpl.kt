package com.codedev.cryptocurrencyapplication.domain.repository

import com.codedev.cryptocurrencyapplication.data.remote.models.exchanges.RemoteExchanges
import com.codedev.cryptocurrencyapplication.data.remote.models.remote_coin.RemoteCoinItem
import com.codedev.cryptocurrencyapplication.data.remote.models.remote_status_update.RemoteStatusUpdate
import com.codedev.cryptocurrencyapplication.data.remote.models.trending.RemoteTrendingCoinsList
import com.codedev.cryptocurrencyapplication.data.repository.CryptoRepository
import com.codedev.cryptocurrencyapplication.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CryptoRepositoryImpl: CryptoRepository {

    override suspend fun getTrendingCryptos(): Flow<Resource<RemoteTrendingCoinsList>> = flow {

    }

    override suspend fun getStatusUpdate(): Flow<Resource<RemoteStatusUpdate>> = flow {

    }

    override suspend fun getCoinInfo(): Flow<Resource<RemoteCoinItem>> = flow {

    }

    override suspend fun getExchanges(): Flow<Resource<RemoteExchanges>> = flow {
        
    }
}