package org.example.project.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import org.example.project.model.GameMode
import org.example.project.screens.MemoriGameScreen
import org.example.project.screens.MenuScreen
import org.example.project.screens.OrderGameScreen
import org.example.project.screens.ResultScreen
import org.example.project.screens.SettingsScreen
import org.example.project.viewmodel.DeckViewModel

@Composable
fun NavigationWrapper(){
    val appVM: DeckViewModel = viewModel{ DeckViewModel() }
    val backStack = rememberNavBackStack(navConfig, Route.MainMenu)

    val gameModes = listOf<GameMode>(
        GameMode("Memory", { backStack.add(Route.MemoryGame) }),
        GameMode("Order", { backStack.add(Route.OrderGame) })
    )

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Route.MainMenu> {
                MenuScreen(
                    navigateToSettings = {backStack.add(Route.SettingsScreen)},
                    appVM,
                    gameModes
                )
            }
            entry<Route.MemoryGame> {
                MemoriGameScreen(
                    navigateToResult = {
                        backStack.removeLastOrNull()
                        backStack.add(Route.ResultsScreen)
                    },
                    exitGame = {
                        backStack.removeLastOrNull()
                    }
                )
            }
            entry<Route.OrderGame> { key ->
                OrderGameScreen(
                    navigateToResult = {
                        backStack.removeLastOrNull()
                        backStack.add(Route.ResultsScreen)
                    },
                    exitGame = {
                        backStack.removeLastOrNull()
                    }
                )
            }
            entry<Route.ResultsScreen> {
                ResultScreen(
                    navigateToMenu = { backStack.removeLastOrNull() },
                    navigateToSettings = {backStack.add(Route.SettingsScreen)},
                    playAgainButtons = gameModes
                )
            }
            entry<Route.SettingsScreen> {
                SettingsScreen(
                    goBack = {backStack.removeLastOrNull()},
                    appVM
                )
            }
        }
    )
}
