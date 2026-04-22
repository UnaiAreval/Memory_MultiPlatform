package org.example.project.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.example.project.ui.theme.AppColors
import org.example.project.ui.theme.ColorsAndDeckName


enum class ImageLocation{
    Local, Remote
}
data class Card(
    val name: String,
    val image: String,
    val imageLocation: ImageLocation,
    val groupIndex: Int
)

object GameDeckAndColor {

    var deck by mutableStateOf(listOf<Card>())
    val groups = arrayOf<String>("", "")
    val appColors = AppColors

    fun spanishMythology(){
        groups[0] = "Feral / animal"
        groups[1] = "Human like"
        appColors.changeAppColors(ColorsAndDeckName.SpMythology)

        deck = listOf(
            Card (name = "Ramidreju", image = "https://static.wikia.nocookie.net/mitologiaiberica/images/f/f9/Ramidreju_by_verreaux-d36hdf2.jpg/revision/latest?cb=20121201094046&path-prefix=es", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Dip", image = "https://www.detectivesdelahistoria.es/wp-content/uploads/2017/11/dip.png", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Bú", image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCKx0pN3pxtZ6YR-qjarcv3xbBL8wKxFSCbw&s", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Lamia", image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRijkQwXUhmeN36pAshjGAOM0EhtWU99_oaqA&s", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1)
        )
    }

    fun warhammer40k(){
        groups[0] = "Imperium of mankind"
        groups[1] = "All other heretic ones"
        appColors.changeAppColors(ColorsAndDeckName.WarHammer)

        deck = listOf(
            Card (name = "Saint Celestin", image = "https://static.wikia.nocookie.net/warhammer40k/images/e/ef/Saint_celestine.jpg/revision/latest?cb=20250104204154", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Konrad Curze", image = "https://preview.redd.it/konrad-curze-during-the-horus-heresy-art-by-victor-fernandez-v0-mb6x8ps8abr91.jpg?auto=webp&s=2eaaae0a91ef1946b6b08b576bfe832c415e1244", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "Silent king", image = "https://artwork.40k.gallery/wp-content/uploads/2023/09/Szarekh-768x1353.jpg.webp", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "Demon Mortarion", image = "https://preview.redd.it/mortarion-horus-heresy-fanart-by-me-v0-6a1sric4o5b91.jpg?auto=webp&s=c4d7f7fc4a84a187671f34671db17a0282e050e3", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1)
        )
    }

    fun animeGirlLike(){
        groups[0] = "Femboy"
        groups[1] = "Girl"
        appColors.changeAppColors(ColorsAndDeckName.AnimeGirlLike)

        deck = listOf(
            Card (name = "Astolfo", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Venti", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "Felix", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 0),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, groupIndex = 1)
        )
    }

    fun animeHorse(){
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
    }
}