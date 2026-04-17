package org.example.project.model


enum class ImageLocation{
    Local, Remote
}
open class Card(
    val name: String,
    val image: String,
    val imageLocation: ImageLocation,
    val display: Boolean //true -> see image | false -> cover image
)

data class OrderCard(val groupIndex: Int, val card: Card) : Card(
    name = card.name, image = card.image, imageLocation = card.imageLocation, display = true
)

object MemoryDecks {
    fun spanishMythology(): List<Card>{
        return listOf(
            Card (name = "Ramidreju", image = "https://static.wikia.nocookie.net/mitologiaiberica/images/f/f9/Ramidreju_by_verreaux-d36hdf2.jpg/revision/latest?cb=20121201094046&path-prefix=es", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "Dip", image = "https://www.detectivesdelahistoria.es/wp-content/uploads/2017/11/dip.png", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "Lamia", image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRijkQwXUhmeN36pAshjGAOM0EhtWU99_oaqA&s", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "Bú", image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCKx0pN3pxtZ6YR-qjarcv3xbBL8wKxFSCbw&s", imageLocation = ImageLocation.Remote, display = false)
        )
    }

    fun warhammer40k(): List<Card>{
        return listOf(
            Card (name = "Konrad Curze", image = "https://preview.redd.it/konrad-curze-during-the-horus-heresy-art-by-victor-fernandez-v0-mb6x8ps8abr91.jpg?auto=webp&s=2eaaae0a91ef1946b6b08b576bfe832c415e1244", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "Silent king", image = "https://artwork.40k.gallery/wp-content/uploads/2023/09/Szarekh-768x1353.jpg.webp", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "Demon Mortarion", image = "https://preview.redd.it/mortarion-horus-heresy-fanart-by-me-v0-6a1sric4o5b91.jpg?auto=webp&s=c4d7f7fc4a84a187671f34671db17a0282e050e3", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "Saint Celestin", image = "https://static.wikia.nocookie.net/warhammer40k/images/e/ef/Saint_celestine.jpg/revision/latest?cb=20250104204154", imageLocation = ImageLocation.Remote, display = false)
        )
    }

    fun femboy(): List<Card>{
        return listOf(
            Card (name = "Astolfo", image = "", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "Venti", image = "", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "Felix", image = "", imageLocation = ImageLocation.Remote, display = false),
            Card (name = "", image = "", imageLocation = ImageLocation.Remote, display = false)
        )
    }
}

object OrderDecks{
    val groups = arrayOf<String>("", "")

    fun femboyOrNot(): List<OrderCard>{
        groups[0] = "Femboy"
        groups[1] = "Not a femboy"

        return listOf(
            OrderCard(0, Card(name = "", image = "", imageLocation = ImageLocation.Remote, display = true)),
            OrderCard(0, Card(name = "", image = "", imageLocation = ImageLocation.Remote, display = true)),
            OrderCard(0, Card(name = "", image = "", imageLocation = ImageLocation.Remote, display = true)),
            OrderCard(0, Card(name = "", image = "", imageLocation = ImageLocation.Remote, display = true)),

            OrderCard(1, Card(name = "", image = "", imageLocation = ImageLocation.Remote, display = true)),
            OrderCard(1, Card(name = "", image = "", imageLocation = ImageLocation.Remote, display = true)),
            OrderCard(1, Card(name = "", image = "", imageLocation = ImageLocation.Remote, display = true)),
            OrderCard(1, Card(name = "", image = "", imageLocation = ImageLocation.Remote, display = true))
        )
    }
}