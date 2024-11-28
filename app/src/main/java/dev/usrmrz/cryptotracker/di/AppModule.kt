package dev.usrmrz.cryptotracker.di

import dev.usrmrz.cryptotracker.core.data.networking.HttpClientFactory
import dev.usrmrz.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import dev.usrmrz.cryptotracker.crypto.domain.CoinDataSource
import dev.usrmrz.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}