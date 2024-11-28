package dev.usrmrz.cryptotracker

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dev.usrmrz.cryptotracker.core.navigation.AdaptiveCoinListDetailPane
import dev.usrmrz.cryptotracker.core.presentation.util.ObserveAsEvents
import dev.usrmrz.cryptotracker.core.presentation.util.toString
import dev.usrmrz.cryptotracker.crypto.presentation.coin_detail.CoinDetailScreen
import dev.usrmrz.cryptotracker.crypto.presentation.coin_list.CoinListEvent
import dev.usrmrz.cryptotracker.crypto.presentation.coin_list.CoinListScreen
import dev.usrmrz.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import dev.usrmrz.cryptotracker.ui.theme.CryptoTrackerTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoTrackerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AdaptiveCoinListDetailPane(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}