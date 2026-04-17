package org.example.project.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import org.example.project.model.Card
import org.example.project.model.MemoryDecks
import org.example.project.model.OrderDecks
import org.example.project.ui.theme.AppColors
import org.example.project.ui.theme.ColorsAndDeckName


class MemoriViewModel : ViewModel() {
    val appColors = AppColors
    var deck by mutableStateOf(listOf<Card>())

    val memoryDecks = MemoryDecks
    val orderDecks = OrderDecks

    fun changeToMemoryDeck(newColorsAndDeck: ColorsAndDeckName){
        appColors.changeAppColors(newColorsAndDeck)
    }

    fun changeToOrderDeck(newColorsAndDeck: ColorsAndDeckName){
        appColors.changeAppColors(newColorsAndDeck)
    }
}