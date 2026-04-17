package org.example.project.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import org.example.project.screens.MemoriGameScreen
import org.example.project.screens.MenuScreen
import org.example.project.screens.OrderGameScreen
import org.example.project.screens.ResultScreen

@Composable
fun NavigationWrapper(){
    val backStack = rememberNavBackStack(navConfig, Route.MainMenu)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Route.MainMenu> {
                MenuScreen(
                    navigateToMemoryGame = { backStack.add(Route.MemoriGame) },
                    navigateToOrderGame = { backStack.add(Route.OrderGame) }
                )
            }
            entry<Route.MemoriGame> {
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
                    navigateToMenu = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}
