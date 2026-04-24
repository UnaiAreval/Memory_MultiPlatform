package org.example.project.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.example.project.viewmodel.DeckViewModel

@Composable
fun SettingsScreen(goBack: () -> Unit, appVM: DeckViewModel){
    Row {
        Button(onClick = {goBack()}){
            Text("Go Back")
        }
        AnimatedVisibility(
            visible = false
        ){
            LazyColumn {
            }
        }
    }
}