package com.eugurguner.ccif.presentation.coin_detail

import com.eugurguner.ccif.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
