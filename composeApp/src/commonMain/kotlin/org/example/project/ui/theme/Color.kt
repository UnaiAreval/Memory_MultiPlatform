package org.example.project.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

enum class ColorsAndDeckName{
    GameMenu, SpMythology, WarHammer, Femboy
}

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
    fun changeAppColors(colorsAndDeckName: ColorsAndDeckName){
        when (colorsAndDeckName) {
            ColorsAndDeckName.GameMenu -> gameMenu()
            ColorsAndDeckName.SpMythology -> spanishMythologyColorPalette()
            ColorsAndDeckName.WarHammer -> warHammerColorPalette()
            ColorsAndDeckName.Femboy -> femboyColorPalette()
        }
    }

    private fun gameMenu(){}
    private fun spanishMythologyColorPalette(){}
    private fun warHammerColorPalette(){}
    private fun femboyColorPalette(){}
}