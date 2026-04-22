package org.example.project.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import org.example.project.screens.MemoriGameScreen
import org.example.project.screens.MenuScreen
import org.example.project.screens.OrderGameScreen
import org.example.project.screens.ResultScreen
import org.example.project.viewmodel.GameViewModel

@Composable
fun NavigationWrapper(){
    val gameVM: GameViewModel = viewModel{ GameViewModel() }
    val backStack = rememberNavBackStack(navConfig, Route.MainMenu)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Route.MainMenu> {
                MenuScreen(
                    navigateToMemoryGame = { backStack.add(Route.MemoriGame) },
                    navigateToOrderGame = { backStack.add(Route.OrderGame) },
                    gameVM
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
