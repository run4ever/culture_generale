package com.example.culture_generale.ui.game

import androidx.lifecycle.ViewModel
import com.example.culture_generale.data.Question
import com.example.culture_generale.data.QuestionRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.math.pow
import kotlin.math.roundToInt

enum class GamePhase { HOME, PLAYING }

data class GameState(
    val phase: GamePhase = GamePhase.HOME,
    val questions: List<Question> = emptyList(),
    val currentIndex: Int = 0,
    val selectedAnswerIndex: Int? = null,
    val answerConfirmed: Boolean = false,
    val playerRating: Int = 1000,
    val lastRatingDelta: Int = 0
)

class GameViewModel : ViewModel() {
    private val _state = MutableStateFlow(GameState())
    val state: StateFlow<GameState> = _state.asStateFlow()

    fun startGame() {
        _state.value = GameState(
            phase = GamePhase.PLAYING,
            questions = QuestionRepository.questions.shuffled(),
            playerRating = _state.value.playerRating
        )
    }

    fun selectAnswer(index: Int) {
        val current = _state.value
        if (current.answerConfirmed) return
        val question = current.questions[current.currentIndex]
        val isCorrect = question.correctIndex == index
        val delta = eloRatingDelta(current.playerRating, question.rating, isCorrect)
        _state.value = current.copy(
            selectedAnswerIndex = index,
            answerConfirmed = true,
            playerRating = (current.playerRating + delta).coerceAtLeast(100),
            lastRatingDelta = delta
        )
    }

    fun nextQuestion() {
        val current = _state.value
        val nextIndex = current.currentIndex + 1
        // Boucle infinie : on remélange quand on arrive à la fin
        val (newIndex, newQuestions) = if (nextIndex >= current.questions.size) {
            0 to QuestionRepository.questions.shuffled()
        } else {
            nextIndex to current.questions
        }
        _state.value = current.copy(
            currentIndex = newIndex,
            questions = newQuestions,
            selectedAnswerIndex = null,
            answerConfirmed = false,
            lastRatingDelta = 0
        )
    }

    fun goHome() {
        _state.value = GameState(playerRating = _state.value.playerRating)
    }

    private fun eloRatingDelta(playerRating: Int, questionRating: Int, correct: Boolean): Int {
        val expected = 1.0 / (1.0 + 10.0.pow((questionRating - playerRating) / 400.0))
        val result = if (correct) 1.0 else 0.0
        return (32.0 * (result - expected)).roundToInt()
    }
}