package org.example.project.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import org.example.project.model.Card
import org.example.project.model.ImageLocation
import org.example.project.model.MemoryDecks
import org.example.project.model.OrderCard
import org.example.project.model.OrderDecks
import org.example.project.model.OrderDecks.groups
import org.example.project.ui.theme.AppColors


enum class DeckName{
    SpMythology, WarHammer, Femboy
}

class MemoriViewModel : ViewModel() {
    val appColors = AppColors
    var deck by mutableStateOf(listOf<Card>())

    val memoryDecks = MemoryDecks
    val orderDecks = OrderDecks

    fun changeToMemoryDeck(deckName: DeckName){

    }

    fun changeToOrderDeck(deckName: DeckName){
    }
}