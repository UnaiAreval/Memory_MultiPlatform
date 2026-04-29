package org.example.project.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import org.example.project.model.Card
import org.example.project.model.ImageLocation
import org.example.project.ui.theme.AppColors
import org.example.project.ui.theme.Colors


class DeckViewModel : ViewModel() {
    var table by mutableStateOf( listOf<Int>() ) //used to set the card pairs in the table
    var deck by mutableStateOf(listOf<Card>())

    var textToDivideGroups by mutableStateOf("")
    val groups = arrayOf<String>("", "")
    val appColors = AppColors


    fun changeDeck(deckName: String){
        when (deckName){
            "Spanish Mythology" -> spanishMythology()
            "WarHammer 40k" -> warhammer40k()
            "Anime Girls" -> animeGirlLike()
            "Umamusume" -> animeHorse()
        }
    }
    fun changeColors(colorToChange: Colors){
        appColors.changeAppColors(colorToChange)
    }

    //Offline decks
    private fun spanishMythology(){
        textToDivideGroups = "How is this creature shaped?"
        groups[0] = "Feral / animal"
        groups[1] = "Human like"

        deck = listOf(
            Card (name = "Ramidreju", image = "https://static.wikia.nocookie.net/mitologiaiberica/images/f/f9/Ramidreju_by_verreaux-d36hdf2.jpg/revision/latest?cb=20121201094046&path-prefix=es", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Dip", image = "https://www.detectivesdelahistoria.es/wp-content/uploads/2017/11/dip.png", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Lamia", image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRijkQwXUhmeN36pAshjGAOM0EhtWU99_oaqA&s", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "Bú", image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCKx0pN3pxtZ6YR-qjarcv3xbBL8wKxFSCbw&s", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1)
        )
        table = listOf(
            1, 1, 2, 2,
            3, 3, 4, 4,
            5, 5, 6, 6,
            7, 7, 8, 8
        )
        mixTableCards()
    }

    private fun warhammer40k(){
        textToDivideGroups = "Recognise the ones who are with the Emperor"
        groups[0] = "Imperium of mankind"
        groups[1] = "All other heretic ones"

        deck = listOf(
            Card (name = "Saint Celestin", image = "https://static.wikia.nocookie.net/warhammer40k/images/e/ef/Saint_celestine.jpg/revision/latest?cb=20250104204154", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Sebastian Yarrick", image = "https://static.wikia.nocookie.net/warhammer40k/images/2/2e/Latest_%281%29.jpg/revision/latest?cb=20141217150657", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Konrad Curze", image = "https://preview.redd.it/konrad-curze-during-the-horus-heresy-art-by-victor-fernandez-v0-mb6x8ps8abr91.jpg?auto=webp&s=2eaaae0a91ef1946b6b08b576bfe832c415e1244", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "Silent king", image = "https://artwork.40k.gallery/wp-content/uploads/2023/09/Szarekh-768x1353.jpg.webp", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "Demon Mortarion", image = "https://preview.redd.it/mortarion-horus-heresy-fanart-by-me-v0-6a1sric4o5b91.jpg?auto=webp&s=c4d7f7fc4a84a187671f34671db17a0282e050e3", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "Ghazghkull Mag Uruk Thraka", image = "https://static.wikia.nocookie.net/warhammer40k/images/9/9e/Ghazghkull2.png/revision/latest?cb=20140723001859", imageLocation = ImageLocation.Remote, groupIndex = 1)
        )
        table = listOf(
            1, 1, 2, 2,
            3, 3, 4, 4,
            5, 5, 6, 6,
            7, 7, 8, 8
        )
        mixTableCards()
    }

    private fun animeGirlLike(){
        textToDivideGroups = "Which of them are boys?"
        groups[0] = "Femboy"
        groups[1] = "Girl"

        deck = listOf(
            Card (name = "Astolfo", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Venti", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Felix", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Aphra", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1)
        )
        table = listOf(
            1, 1, 2, 2,
            3, 3, 4, 4,
            5, 5, 6, 6,
            7, 7, 8, 8
        )
        mixTableCards()
    }

    private fun animeHorse(){
        textToDivideGroups = "Which gender are / were this horses in real life?"
        groups[0] = "Male"
        groups[1] = "Female"

        deck = listOf(
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1)
        )
        table = listOf(
            1, 1, 2, 2,
            3, 3, 4, 4,
            5, 5, 6, 6,
            7, 7, 8, 8
        )
        mixTableCards()
    }

    //Mix the table cards order
    fun mixTableCards(){
        table = table.shuffled()
    }
}