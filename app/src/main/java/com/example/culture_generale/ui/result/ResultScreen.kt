package com.example.culture_generale.ui.result

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ResultScreen(
    modifier: Modifier = Modifier,
    score: Int,
    total: Int,
    playerRating: Int,
    onRestart: () -> Unit,
    onHome: () -> Unit
) {
    val percentage = score.toFloat() / total
    val message = when {
        percentage >= 0.8f -> "Excellent !"
        percentage >= 0.6f -> "Bien joué !"
        percentage >= 0.4f -> "Pas mal !"
        else -> "À améliorer…"
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Partie terminée !",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(32.dp))

        Text(
            text = "$score / $total",
            style = MaterialTheme.typography.displayLarge,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = message,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(24.dp))

        Text(
            text = "Niveau : $playerRating",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(Modifier.height(56.dp))

        Button(
            onClick = onRestart,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text("Rejouer", style = MaterialTheme.typography.titleMedium)
        }

        Spacer(Modifier.height(12.dp))

        OutlinedButton(
            onClick = onHome,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text("Accueil", style = MaterialTheme.typography.titleMedium)
        }
    }
}