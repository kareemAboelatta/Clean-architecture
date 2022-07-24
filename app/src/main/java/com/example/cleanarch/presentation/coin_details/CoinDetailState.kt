package com.example.cleanarch.presentation.coin_details

import com.example.cleanarch.domain.models.CoinDetail


data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
