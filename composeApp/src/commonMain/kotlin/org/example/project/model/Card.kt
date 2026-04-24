package org.example.project.model

enum class ImageLocation{
    Local, Remote
}
data class Card(
    val name: String,
    val image: String,
    val imageLocation: ImageLocation,
    val groupIndex: Int
)