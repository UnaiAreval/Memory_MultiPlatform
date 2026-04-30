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
    var backgroundSupport by mutableStateOf(Color(0xFFDCDCDC))
    var borders by mutableStateOf(Color(0xFF4A26AD))
    var text by mutableStateOf(Color(0xFF000000))
    var button by mutableStateOf(Color(0xFF764CEA))
    var buttonText by mutableStateOf(Color(0xFFFFFFFF))
    var buttonBackground by mutableStateOf(Color(0xFFBDBDBD))
    var group0 by mutableStateOf(Color(0xFF00A6FF))
    var group1 by mutableStateOf(Color(0xFFFD0000))

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
        backgroundSupport = Color(0xFFDCDCDC)
        borders = Color(0xFF4A26AD)
        text  = Color(0xFF000000)
        button = Color(0xFF764CEA)
        buttonText = Color(0xFFFFFFFF)
        buttonBackground = Color(0xFFBDBDBD)
        group0 = Color(0xFF00A6FF)
        group1 = Color(0xFFFD0000)
    }
    private fun brownPalette(){
        background = Color(0xFFCEBEA0)
        backgroundSupport = Color(0xFF7B6557)
        borders = Color(0xFF6F592C)
        text  = Color(0xFF000000)
        button = Color(0xFF573600)
        buttonText = Color(0xFFBB9D7D)
        buttonBackground = Color(0xFFBF884D)
        group0 = Color(0xFF8B2F2F)
        group1 = Color(0xFF2F6D8A)
    }
    private fun imperialPalette(){
        background = Color(0xFF000000)
        backgroundSupport = Color(0xFF404040)
        borders = Color(0xFFA77F40)
        text  = Color(0xFFFFFFFF)
        button = Color(0xFF8A2F2F)
        buttonText = Color(0xFFE5A949)
        buttonBackground = Color(0xFF3F3F3F)
        group0 = Color(0xFF90799E)
        group1 = Color(0xFFA58F63)
    }
    private fun pinkAndBluePalette(){
        background = Color(0xFFFDB3FF)
        backgroundSupport = Color(0xFFFC8CFF)
        borders = Color(0xFF63FFFF)
        text  = Color(0xFFFFFFFF)
        button = Color(0xFFB3FFFC)
        buttonText = Color(0xFF000000)
        buttonBackground = Color(0xFF925AF9)
        group0 = Color(0xFFFC5CFF)
        group1 = Color(0xFF5CDEFF)
    }
}