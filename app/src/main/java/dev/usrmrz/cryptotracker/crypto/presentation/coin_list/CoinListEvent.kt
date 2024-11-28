package dev.usrmrz.cryptotracker.crypto.presentation.coin_list

import dev.usrmrz.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}