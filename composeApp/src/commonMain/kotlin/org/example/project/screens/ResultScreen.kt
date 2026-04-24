package org.example.project.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavKey
import org.example.project.model.GameMode

@Composable
fun ResultScreen(
    navigateToMenu: () -> NavKey?,
    playAgainButtons: List<GameMode>,
    navigateToSettings: () -> Boolean
) {
    Column {

    }
}