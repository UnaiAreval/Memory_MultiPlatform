package org.example.project.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import memori.composeapp.generated.resources.Res
import memori.composeapp.generated.resources.memorylogo
import org.jetbrains.compose.resources.painterResource

@Composable
fun MenuScreen(navigateToMemoryGame: () -> Boolean, navigateToOrderGame: () -> Boolean) {
    Column {
        Text("What's this game even about?", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, modifier = Modifier.align(Alignment.CenterHorizontally))
        Image(
            painter = painterResource(Res.drawable.memorylogo),
            contentDescription = "App icon",
            modifier = Modifier.fillMaxSize(0.2f).align(Alignment.CenterHorizontally)
        )
        Spacer(Modifier.fillMaxSize(0.1f))
        Text(text = "Game Modes: ", fontSize = 15.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, modifier = Modifier.align(Alignment.CenterHorizontally))
        Row {
            Button(
                onClick = {navigateToMemoryGame()}
            ){
                Text("Play Memory")
            }
            Button(
                onClick = {navigateToOrderGame()}
            ){
                Text("Play Order")
            }
        }
    }
}