package com.eugurguner.ccif.presentation.coin_list

import com.eugurguner.ccif.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
