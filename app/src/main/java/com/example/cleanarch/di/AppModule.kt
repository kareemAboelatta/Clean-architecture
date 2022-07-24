package com.example.cleanarch.di

import android.provider.SyncStateContract
import com.example.cleanarch.common.Constants
import com.example.cleanarch.common.Constants.BASE_URL
import com.example.cleanarch.data.remote.CoinPaprikaApi
import com.example.cleanarch.data.repository.CoinRepositoryImpl
import com.example.cleanarch.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import retrofit2.converter.gson.GsonConverterFactory
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }

}