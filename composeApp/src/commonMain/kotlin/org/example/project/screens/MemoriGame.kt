package org.example.project.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.navigation3.runtime.NavKey
import org.example.project.viewmodel.GameViewModel

@Composable //exitGame is used to go back to menu screen
fun MemoriGameScreen(navigateToResult: () -> Boolean, exitGame: () -> NavKey?, appVM: GameViewModel) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.2f)
                .background(appVM.appColors.backgroundSupport)
                .align(Alignment.CenterHorizontally)
        ){
            Button(
                onClick = {exitGame()},
                border = BorderStroke(2.dp, appVM.appColors.borders),
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
                text = "Memori",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterVertically),
                color = appVM.appColors.text
            )
        }
        Box(){}
    }
}