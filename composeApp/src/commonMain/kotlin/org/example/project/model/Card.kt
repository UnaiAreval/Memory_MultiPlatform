package org.example.project.model

import org.jetbrains.compose.resources.DrawableResource

enum class ImageLocation{
    Local, Remote
}
data class Card(
    val name: String,
    val imageUrl: String?,
    val imageLocal: DrawableResource?,
    val imageLocation: ImageLocation,
    val groupIndex: Int
)