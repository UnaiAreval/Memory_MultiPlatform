package org.example.project.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import memori.composeapp.generated.resources.Res
import memori.composeapp.generated.resources.memorylogo
import memori.composeapp.generated.resources.settings_icon
import org.example.project.model.GameMode
import org.example.project.viewmodel.GameViewModel
import org.jetbrains.compose.resources.painterResource

@Composable
fun MenuScreen(navigateToSettings: () -> Unit, appVM: GameViewModel, gameModes: List<GameMode>) {
    Column(modifier = Modifier.fillMaxSize().background(appVM.appColors.background)) {
        Box(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.15f)
                .background(appVM.appColors.backgroundSupport)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "What's this game even about?",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center),
                color = appVM.appColors.text
            )
            Icon(
                painter = painterResource(Res.drawable.settings_icon),
                contentDescription = "Localized description",
                modifier = Modifier.fillMaxHeight(0.4f)
                    .clickable{ navigateToSettings() }
                    .align(Alignment.CenterEnd)
                    .padding(20.dp)
            )
        }

        Image(
            painter = painterResource(Res.drawable.memorylogo),
            contentDescription = "App icon",
            modifier = Modifier.fillMaxSize(0.2f).align(Alignment.CenterHorizontally).padding(10.dp)
        )

        Spacer(Modifier.fillMaxSize(0.1f))

        Text(
            text = "Game Modes: ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = appVM.appColors.text
        )
        LazyColumn(
            Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(0.4f).fillMaxHeight(0.6f)
                .padding(10.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(appVM.appColors.buttonBackground)
                .border(width = 2.dp, color = appVM.appColors.borders, RoundedCornerShape(20.dp))
        ) {
            for (mode in gameModes){
                item {
                    Button(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .fillMaxWidth()
                            .padding(5.dp),
                        onClick = {mode.navTo()},
                        border = BorderStroke(width = 2.dp, color = appVM.appColors.borders),
                        colors = ButtonColors(
                            containerColor = appVM.appColors.button,
                            contentColor = appVM.appColors.buttonText,
                            disabledContainerColor = appVM.appColors.button,
                            disabledContentColor = appVM.appColors.buttonText
                        )
                    ){
                        Text(
                            text = mode.name,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            item {
                Text(appVM.deck[0].name)
            }
        }
    }
}