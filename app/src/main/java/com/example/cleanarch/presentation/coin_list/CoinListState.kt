package com.example.cleanarch.presentation.coin_list

import com.example.cleanarch.domain.models.Coin


data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
