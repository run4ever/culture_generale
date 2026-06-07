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
import com.example.culture_generale.ui.category.CategoryScreen
import com.example.culture_generale.ui.game.GamePhase
import com.example.culture_generale.ui.game.GameScreen
import com.example.culture_generale.ui.game.GameViewModel
import com.example.culture_generale.ui.home.HomeScreen
import com.example.culture_generale.ui.theme.CultureGeneraleTheme

class MainActivity : ComponentActivity() {
    private val viewModel: GameViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CultureGeneraleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val state by viewModel.state.collectAsState()
                    when (state.phase) {
                        GamePhase.HOME -> HomeScreen(
                            modifier = Modifier.padding(innerPadding),
                            onStartAllCategories = { viewModel.startGame(null) },
                            onChooseCategory = viewModel::goToCategorySelect
                        )
                        GamePhase.CATEGORY_SELECT -> CategoryScreen(
                            modifier = Modifier.padding(innerPadding),
                            onSelectCategory = { viewModel.startGame(it) },
                            onGoBack = viewModel::goHome
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