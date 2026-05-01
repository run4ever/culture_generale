package com.example.culture_generale

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.culture_generale.ui.game.GamePhase
import com.example.culture_generale.ui.game.GameScreen
import com.example.culture_generale.ui.game.GameViewModel
import com.example.culture_generale.ui.home.HomeScreen
import com.example.culture_generale.ui.theme.CultureGénéraleTheme

class MainActivity : ComponentActivity() {
    private val viewModel: GameViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CultureGénéraleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val state by viewModel.state.collectAsState()
                    when (state.phase) {
                        GamePhase.HOME -> HomeScreen(
                            modifier = Modifier.padding(innerPadding),
                            onStartGame = viewModel::startGame
                        )
                        GamePhase.PLAYING -> GameScreen(
                            modifier = Modifier.padding(innerPadding),
                            state = state,
                            onSelectAnswer = viewModel::selectAnswer,
                            onNextQuestion = viewModel::nextQuestion,
                            onGoHome = viewModel::goHome
                        )
                    }
                }
            }
        }
    }
}