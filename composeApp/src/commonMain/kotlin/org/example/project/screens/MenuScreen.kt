package org.example.project.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import memori.composeapp.generated.resources.Res
import memori.composeapp.generated.resources.memorylogo
import org.example.project.model.GameMode
import org.example.project.viewmodel.GameViewModel
import org.jetbrains.compose.resources.painterResource

@Composable
fun MenuScreen(navigateToMemoryGame: () -> Unit, navigateToOrderGame: () -> Unit, gameVM: GameViewModel) {

    var gameModes = listOf<GameMode>(
        GameMode("Memory", navigateToMemoryGame),
        GameMode("Order", navigateToOrderGame)
    )

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "What's this game even about?",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 100.dp)
        )

        Image(
            painter = painterResource(Res.drawable.memorylogo),
            contentDescription = "App icon",
            modifier = Modifier.fillMaxSize(0.4f).align(Alignment.CenterHorizontally)
        )

        Spacer(Modifier.fillMaxSize(0.1f))
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(10.dp)
                .border(width = 2.dp, color = gameVM.decksAndColors.appColors.borders )
        ){
            Text(
                text = "Game Modes: ",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.TopCenter)
            )

            LazyColumn(Modifier.align(Alignment.BottomCenter)) {
                for (mode in gameModes){
                    item {
                        Button(
                            onClick = {mode.navTo()},
                            modifier = Modifier.fillMaxSize(0.2f),
                            shape = RoundedCornerShape(20.dp),
                            border = BorderStroke(width = 2.dp, color = gameVM.decksAndColors.appColors.borders),
                            colors = ButtonColors(
                                containerColor = gameVM.decksAndColors.appColors.buttonBack,
                                contentColor = gameVM.decksAndColors.appColors.buttonText,
                                disabledContainerColor = gameVM.decksAndColors.appColors.buttonBack,
                                disabledContentColor = gameVM.decksAndColors.appColors.buttonText
                            )
                        ){
                            Text(mode.name)
                        }
                    }
                }
            }
        }
    }
}