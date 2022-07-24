package com.example.cleanarch.domain.repository

import com.example.cleanarch.data.dto.CoinDetailsDto
import com.example.cleanarch.data.dto.CoinDto

interface CoinRepository {

    suspend fun getCoinList(): List<CoinDto>


    suspend fun getCoinById(id:String): CoinDetailsDto
}