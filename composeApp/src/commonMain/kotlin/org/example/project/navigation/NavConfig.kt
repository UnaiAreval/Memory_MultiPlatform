package org.example.project.navigation

import androidx.navigation3.runtime.NavKey
import androidx.savedstate.serialization.SavedStateConfiguration
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val navConfig = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            subclass(Route.MainMenu::class, Route.MainMenu.serializer())
            subclass(Route.MemoryGame::class, Route.MemoryGame.serializer())
            subclass(Route.OrderGame::class, Route.OrderGame.serializer())
            subclass(Route.ResultsScreen::class, Route.ResultsScreen.serializer())
            subclass(Route.SettingsScreen::class, Route.SettingsScreen.serializer())
        }
    }
}
