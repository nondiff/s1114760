package com.example.s1114760

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.s1114760.ui.theme.S1114760Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S1114760Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val activity = (context as Activity)
    Column {
        Image(
            painter = painterResource(id = R.drawable.maria),
            contentDescription = "圖片",
            alpha = 0.7f,
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Black)
        )
        Text(
            text = "關於App作者",
            color = Color.Blue,
            modifier = modifier
        )
        Image(
            painter = painterResource(id = R.drawable.ph),
            contentDescription = "圖片",
            alpha = 2.0f,
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Black)
                .height(height = 500.dp)
        )
        Button(onClick = { activity.finish() })
        {
            Text(text = "服務總覽")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    S1114760Theme {
        Greeting3("Android")
    }
}