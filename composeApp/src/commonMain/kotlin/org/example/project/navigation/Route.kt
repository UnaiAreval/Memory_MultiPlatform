package org.example.project.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Route : NavKey{
    @Serializable
    data object MainMenu: Route()
    @Serializable
    data object MemoryGame: Route()
    @Serializable
    data object OrderGame: Route()
    @Serializable
    data object ResultsScreen: Route()
    @Serializable
    data object SettingsScreen: Route()
}