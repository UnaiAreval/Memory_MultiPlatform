package org.example.project.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

enum class ColorsAndDeckName{
    GameMenu, SpMythology, WarHammer, AnimeGirlLike
}

object AppColors{
    //this are the basic app colors, which are used in the menu
    var background by mutableStateOf(Color(0xFFFFFFFF))
    var borders by mutableStateOf(Color(0xFF4A26AD))
    var text by mutableStateOf(Color(0xFF000000))
    var button by mutableStateOf(Color(0xFF764CEA))
    var buttonText by mutableStateOf(Color(0xFFFFFFFF))
    var buttonBackground by mutableStateOf(Color(0xFFA3A3A3))
    var group0 by mutableStateOf(Color(0xFFA990EE))
    var group1 by mutableStateOf(Color(0xFFA990EE))

    //the other color palette will be used depending on the game mode and the deck used
    fun changeAppColors(colorsAndDeckName: ColorsAndDeckName){
        when (colorsAndDeckName) {
            ColorsAndDeckName.GameMenu -> gameMenu()
            ColorsAndDeckName.SpMythology -> spanishMythologyColorPalette()
            ColorsAndDeckName.WarHammer -> warHammerColorPalette()
            ColorsAndDeckName.AnimeGirlLike -> animeGirlColorPalette()
        }
    }

    private fun gameMenu(){
        background = Color(0xFFFFFFFF)
        borders = Color(0xFF4A26AD)
        text  = Color(0xFF000000)
        button = Color(0xFF764CEA)
        buttonText = Color(0xFFFFFFFF)
        buttonBackground = Color(0xFFA3A3A3)
        group0 = Color(0xFF00A6FF)
        group1 = Color(0xFFFD0000)
    }
    private fun spanishMythologyColorPalette(){
        background = Color(0xFFA78C70)
        borders = Color(0xFF715638)
        text  = Color(0xFF000000)
        button = Color(0xFF573600)
        buttonText = Color(0xFFBB9D7D)
        buttonBackground = Color(0xFFBF884D)
        group0 = Color(0xFF8B2F2F)
        group1 = Color(0xFF2F6D8A)
    }
    private fun warHammerColorPalette(){
        background = Color(0xFF000000)
        borders = Color(0xFFCB9B50)
        text  = Color(0xFFFFFFFF)
        button = Color(0xFFCD9C51)
        buttonText = Color(0xFF000000)
        group0 = Color(0xFF90799E)
        group1 = Color(0xFF9D9878)
    }
    private fun animeGirlColorPalette(){
        background = Color(0xFFFDB3FF)
        borders = Color(0xFF7FF0FF)
        text  = Color(0xFFFFFFFF)
        button = Color(0xFFAA61FF)
        buttonText = Color(0xFF000000)
        group0 = Color(0xFFFC5CFF)
        group1 = Color(0xFF2BB5FF)
    }
}