package com.example.cleanarch.data.repository

import com.example.cleanarch.data.dto.CoinDetailsDto
import com.example.cleanarch.data.dto.CoinDto
import com.example.cleanarch.data.remote.CoinPaprikaApi
import com.example.cleanarch.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoinList(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(id: String): CoinDetailsDto {
        return api.getCoinById(id)
    }

}