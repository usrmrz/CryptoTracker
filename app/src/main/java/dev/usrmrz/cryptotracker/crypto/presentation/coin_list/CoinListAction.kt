package dev.usrmrz.cryptotracker.crypto.presentation.coin_list

import dev.usrmrz.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}