package org.example.project.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.viewmodel.GameViewModel

@Composable
fun SettingsScreen(goBack: () -> Unit, appVM: GameViewModel){
    Column(
        modifier = Modifier.fillMaxSize().background(appVM.appColors.background)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.2f)
                .align(Alignment.CenterHorizontally)
                .background(appVM.appColors.backgroundSupport)
                .padding(20.dp)
        ) {
            Button(
                onClick = {goBack()},
                border = BorderStroke(2.dp, appVM.appColors.borders),
                modifier = Modifier.align(Alignment.CenterStart),
                colors = ButtonColors(
                    containerColor = appVM.appColors.button,
                    contentColor = appVM.appColors.buttonText,
                    disabledContainerColor = appVM.appColors.button,
                    disabledContentColor = appVM.appColors.buttonText
                )
            ){
                Text(
                    text = "Go Back",
                    color = appVM.appColors.buttonText
                )
            }
            Text(
                text = "Settings",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center),
                color = appVM.appColors.text
            )
        }
        Spacer(modifier = Modifier.fillMaxSize(0.1f))
        Text(
            text = "Palette selector:",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = appVM.appColors.text
        )
        LazyColumn (
            Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(0.6f).fillMaxHeight(0.6f)
                .padding(10.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(appVM.appColors.buttonBackground)
                .border(width = 5.dp, color = appVM.appColors.borders, RoundedCornerShape(20.dp))
                .padding(5.dp)
        ) {
            for (palette in appVM.appColors.palettesList){
                item {
                    Text(
                        text = " - ${palette.name} palette",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = appVM.appColors.text,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(5.dp)
                            .clickable{ appVM.changeColors(colorToChange = palette.colorEnum) }
                    )
                }
            }
        }
        Spacer(modifier = Modifier.fillMaxSize(0.1f))
        Text(
            text = "Deck selector:",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = appVM.appColors.text
        )
        LazyRow (
            Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(0.6f).fillMaxHeight(0.6f)
                .padding(10.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(appVM.appColors.buttonBackground)
                .border(width = 5.dp, color = appVM.appColors.borders, RoundedCornerShape(20.dp))
                .padding(5.dp)
        ){
            for (deck in appVM.decksList){
                item {
                    Box(
                        modifier = Modifier.clickable{ deck.value }
                    ){
                        Text(
                            text = deck.key,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            color = appVM.appColors.text,
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .padding(5.dp)
                                .clickable{ deck.value }
                        )
                    }
                }
            }
        }
    }
}