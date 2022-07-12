package com.eugurguner.ccif.domain.repository

import com.eugurguner.ccif.data.remote.dto.CoinDetailDto
import com.eugurguner.ccif.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}