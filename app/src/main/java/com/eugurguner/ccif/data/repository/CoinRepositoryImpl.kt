package com.eugurguner.ccif.data.repository

import com.eugurguner.ccif.data.remote.CoinPaprikaApi
import com.eugurguner.ccif.data.remote.dto.CoinDetailDto
import com.eugurguner.ccif.data.remote.dto.CoinDto
import com.eugurguner.ccif.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}