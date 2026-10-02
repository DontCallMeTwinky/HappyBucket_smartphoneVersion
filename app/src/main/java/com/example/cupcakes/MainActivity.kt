package com.example.cupcakes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cupcakes.ui.theme.CupcakesTheme
import androidx.core.content.ContextCompat.startActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        var textUnit = 16.sp
//       fontSize by remember { mutableStateOf(16.sp) }
        val innerPadding = PaddingValues(top = 10.dp, start = 15.dp)
        setContent {
            CupcakesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        message = "i want cupcakes mort",
                        modifier = Modifier.padding(innerPadding),
                        textUnit = textUnit,
                        color = Color.Green
                    )
                }
            }
        }

        setContentView(R.layout.main_activity_layout)  /**R.layout.content_layout_id*/
        val button: Button = findViewById(R.id.killck_here)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent: Intent = Intent(this@MainActivity, Activity2::class.java)
                startActivity(intent)
            }
        })

        val button2: Button = findViewById(R.id.killck_here2)
        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent: Intent = Intent(this@MainActivity, Activity2::class.java)
                startActivity(intent)
            }
        })

        /** findViewById<Button>(R.id.supabutton)
          *  .setOnClickListener {
          *      Log.d("BUTTONS", "User tapped the Supabutton")
          *  }
          */
    }
}

fun startAct2(view: View)
{
    //val intent: Intent = Intent(this@MainActivity, Activity2::class.java)
    //startActivity(intent)
}

@Composable
fun Greeting(message: String, modifier: Modifier = Modifier, textUnit: TextUnit, color: Color) {
    Text(
        text = message,
        modifier = modifier,
        fontSize = textUnit,
        fontFamily = FontFamily.Cursive,
        color = color
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CupcakesTheme {
        var textUnit by remember { mutableStateOf(16.sp) }
        val innerPadding = PaddingValues(top = 10.dp, start = 15.dp)
        Greeting("i want cupcakes mort",
            modifier = Modifier.padding(innerPadding),
            textUnit = textUnit,
            color = Color.Green
            )
    }
}