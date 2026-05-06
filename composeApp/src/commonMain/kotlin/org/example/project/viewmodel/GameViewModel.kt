package org.example.project.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import memori.composeapp.generated.resources.Res
import memori.composeapp.generated.resources.null_icon
import org.example.project.model.Card
import org.example.project.model.ImageLocation
import org.example.project.ui.theme.AppColors
import org.example.project.ui.theme.Colors


class GameViewModel : ViewModel() {
    var table by mutableStateOf( listOf<Int>() ) //used to set the card pairs in the table
    var deck = mutableListOf(Card(name = "No deck selected", imageUrl = null, imageLocal = Res.drawable.null_icon, imageLocation = ImageLocation.Local, groupIndex = 0))
    val decksList = mapOf<String,() -> Unit>(
        "Spanish Mythology" to { spanishMythology() },
        "WarHammer 40k" to { warhammer40k() },
        "Anime Girls" to { animeGirlLike() },
        "Umamusume" to { animeHorse() }
    )
    var cardsSelected = 0 // count the amount of cards flipped

    val textToDivideGroups = mutableStateOf("")
    val groups = arrayOf<String>("", "")

    val appColors = AppColors

    fun changeColors(colorToChange: Colors){
        appColors.changeAppColors(colorToChange)
    }

    //Offline decks
    private fun spanishMythology(){
        textToDivideGroups.value = "How is this creature shaped?"
        groups[0] = "Feral / animal"
        groups[1] = "Human like"

        deck = mutableListOf<Card>()
        deck.add( Card (name = "Ramidreju", imageUrl = "https://static.wikia.nocookie.net/mitologiaiberica/images/f/f9/Ramidreju_by_verreaux-d36hdf2.jpg/revision/latest?cb=20121201094046&path-prefix=es", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0) )
        deck.add( Card (name = "Dip", imageUrl = "https://www.detectivesdelahistoria.es/wp-content/uploads/2017/11/dip.png", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0) )
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0) )
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0) )
        deck.add( Card (name = "Lamia", imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRijkQwXUhmeN36pAshjGAOM0EhtWU99_oaqA&s", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1) )
        deck.add( Card (name = "Bú", imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCKx0pN3pxtZ6YR-qjarcv3xbBL8wKxFSCbw&s", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1) )
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1) )
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1) )

        table = listOf(
            1, 1, 2, 2,
            3, 3, 4, 4,
            5, 5, 6, 6,
            7, 7, 8, 8
        )
        mixTableCards()
    }

    private fun warhammer40k(){
        textToDivideGroups.value = "Recognise the ones who are with the Emperor"
        groups[0] = "Imperium of mankind"
        groups[1] = "All other heretic ones"

        deck = mutableListOf<Card>()
        deck.add( Card (name = "Saint Celestin", imageUrl = "https://static.wikia.nocookie.net/warhammer40k/images/e/ef/Saint_celestine.jpg/revision/latest?cb=20250104204154", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "Sebastian Yarrick", imageUrl = "https://static.wikia.nocookie.net/warhammer40k/images/2/2e/Latest_%281%29.jpg/revision/latest?cb=20141217150657", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "Konrad Curze", imageUrl = "https://preview.redd.it/konrad-curze-during-the-horus-heresy-art-by-victor-fernandez-v0-mb6x8ps8abr91.jpg?auto=webp&s=2eaaae0a91ef1946b6b08b576bfe832c415e1244", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "Silent king", imageUrl = "https://artwork.40k.gallery/wp-content/uploads/2023/09/Szarekh-768x1353.jpg.webp", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "Demon Mortarion", imageUrl = "https://preview.redd.it/mortarion-horus-heresy-fanart-by-me-v0-6a1sric4o5b91.jpg?auto=webp&s=c4d7f7fc4a84a187671f34671db17a0282e050e3", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "Ghazghkull Mag Uruk Thraka", imageUrl = "https://static.wikia.nocookie.net/warhammer40k/images/9/9e/Ghazghkull2.png/revision/latest?cb=20140723001859", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))

        table = listOf(
            1, 1, 2, 2,
            3, 3, 4, 4,
            5, 5, 6, 6,
            7, 7, 8, 8
        )
        mixTableCards()
    }

    private fun animeGirlLike(){
        textToDivideGroups.value = "Which of them are boys?"
        groups[0] = "Femboy"
        groups[1] = "Girl"

        deck = mutableListOf<Card>()
        deck.add( Card (name = "Astolfo", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "Venti", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "Felix", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "Aphra", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))

        table = listOf(
            1, 1, 2, 2,
            3, 3, 4, 4,
            5, 5, 6, 6,
            7, 7, 8, 8
        )
        mixTableCards()
    }

    private fun animeHorse(){
        textToDivideGroups.value = "Which gender are / were this horses in real life?"
        groups[0] = "Male"
        groups[1] = "Female"

        deck = mutableListOf<Card>()
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 0))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))
        deck.add( Card (name = "", imageUrl = "", imageLocal = null, imageLocation = ImageLocation.Remote, groupIndex = 1))

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