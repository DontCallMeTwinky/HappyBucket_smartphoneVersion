package com.example.cupcakes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.cupcakes.ui.theme.CupcakesTheme

class Activity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var textUnit = 70.sp
        enableEdgeToEdge()
        setContent {
            CupcakesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        message = "I SAID \n\n\nI WANT \n\n\nCUPCAKES \n\n\nMORT!!!1",
                        modifier = Modifier.padding(innerPadding),
                        textUnit = textUnit,
                        color = Color.Red
                    )
                }
            }
        }
    }
}
