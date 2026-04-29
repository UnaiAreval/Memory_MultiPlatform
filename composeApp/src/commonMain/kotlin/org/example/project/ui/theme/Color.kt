package org.example.project.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

enum class Colors{
    Base, BrownPalette, ImperialPalette, PinkAndBluePalette
}
data class Palette(
    val name: String,
    val colorEnum: Colors
)

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

    var palettesList = listOf<Palette>(
        Palette("Base Colors",Colors.Base),
        Palette("Brown Colors", Colors.BrownPalette),
        Palette("Imperial", Colors.ImperialPalette),
        Palette("Pink & Blue", Colors.PinkAndBluePalette)
    )

    //the other color palette will be used depending on the game mode and the deck used
    fun changeAppColors(colors: Colors){
        when (colors) {
            Colors.Base -> base()
            Colors.BrownPalette -> brownPalette()
            Colors.ImperialPalette -> imperialPalette()
            Colors.PinkAndBluePalette -> pinkAndBluePalette()
        }
    }

    private fun base(){
        background = Color(0xFFFFFFFF)
        borders = Color(0xFF4A26AD)
        text  = Color(0xFF000000)
        button = Color(0xFF764CEA)
        buttonText = Color(0xFFFFFFFF)
        buttonBackground = Color(0xFFBDBDBD)
        group0 = Color(0xFF00A6FF)
        group1 = Color(0xFFFD0000)
    }
    private fun brownPalette(){
        background = Color(0xFFA78C70)
        borders = Color(0xFF715638)
        text  = Color(0xFF000000)
        button = Color(0xFF573600)
        buttonText = Color(0xFFBB9D7D)
        buttonBackground = Color(0xFFBF884D)
        group0 = Color(0xFF8B2F2F)
        group1 = Color(0xFF2F6D8A)
    }
    private fun imperialPalette(){
        background = Color(0xFF000000)
        borders = Color(0xFFCB9B50)
        text  = Color(0xFFFFFFFF)
        button = Color(0xFF8A2F2F)
        buttonText = Color(0xFFE5A949)
        buttonBackground = Color(0xFFBF884D)
        group0 = Color(0xFF90799E)
        group1 = Color(0xFFA58F63)
    }
    private fun pinkAndBluePalette(){
        background = Color(0xFFFDB3FF)
        borders = Color(0xFF7FF0FF)
        text  = Color(0xFFFFFFFF)
        button = Color(0xFFAA61FF)
        buttonText = Color(0xFF000000)
        buttonBackground = Color(0xFFCEA3FF)
        group0 = Color(0xFFFC5CFF)
        group1 = Color(0xFF2BB5FF)
    }
}