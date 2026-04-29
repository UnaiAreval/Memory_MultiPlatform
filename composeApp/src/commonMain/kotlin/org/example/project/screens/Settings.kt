package org.example.project.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import org.example.project.viewmodel.DeckViewModel

@Composable
fun SettingsScreen(goBack: () -> Unit, appVM: DeckViewModel){
    Column(
        modifier = Modifier.fillMaxSize().background(appVM.appColors.background)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.2f).align(Alignment.CenterHorizontally).padding(20.dp)
        ) {
            Button(
                onClick = {goBack()},
                modifier = Modifier.align(Alignment.CenterStart),
                colors = ButtonColors(
                    containerColor = appVM.appColors.button,
                    contentColor = appVM.appColors.buttonText,
                    disabledContainerColor = appVM.appColors.button,
                    disabledContentColor = appVM.appColors.buttonText
                )
            ){
                Text("Go Back")
            }
            Text(
                text = "Settings",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        LazyColumn (
            Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(0.4f).fillMaxHeight(0.6f)
                .padding(10.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(appVM.appColors.buttonBackground)
                .border(width = 10.dp, color = appVM.appColors.borders, RoundedCornerShape(20.dp))
                .padding(10.dp)
        ) {
            for (palette in appVM.appColors.palettesList){
                item {
                    Text(
                        text = " - ${palette.name} palette",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(5.dp)
                            .clickable{ appVM.changeColors(colorToChange = palette.colorEnum) }
                    )
                }
            }
        }
    }
}