package org.example.project.model

data class GameMode(
    val name: String,
    val navTo: () -> Unit
)