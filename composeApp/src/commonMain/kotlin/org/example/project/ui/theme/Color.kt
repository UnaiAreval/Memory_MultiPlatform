package org.example.project.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import org.example.project.viewmodel.DeckName

object AppColors{
    //this are the basic app colors, which are used in the menu
    var background by mutableStateOf(Color(0xFFFFFFFF))
    var borders by mutableStateOf(Color(0xFF4A26AD))
    var text by mutableStateOf(Color(0xFF000000))
    var buttonBack by mutableStateOf(Color(0xFF764CEA))
    var buttonText by mutableStateOf(Color(0xFFFFFFFF))
    var cardBack by mutableStateOf(Color(0xFF684D3F))
    var group by mutableStateOf(Color(0xFFA990EE)) //used for the box/button to select the card group

    //the other color palette will be used depending on the game mode and the deck used
    fun changeAppColors(deckName: DeckName){
        when (deckName) {
            DeckName.SpMythology -> spanishMythologyColorPalette()
            DeckName.WarHammer -> warHammerColorPalette()
            DeckName.Femboy -> femboyColorPalette()
        }
    }

    private fun spanishMythologyColorPalette(){}
    private fun warHammerColorPalette(){}
    private fun femboyColorPalette(){}
}