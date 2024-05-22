package com.example.s1114760

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.s1114760.ui.theme.S1114760Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S1114760Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column {
        Button(onClick = { var it = Intent(context, SecondActivity::class.java)
            context.startActivity(it)
        }){
            Text(text = "主要機構")
        }
        Image(
            painter = painterResource(id = R.drawable.maria),
            contentDescription = "圖片",
            alpha = 0.7f,
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Black)
        )
        Text(
            text = "簡介",
            color = Color.Blue,
            modifier = modifier
        )
        Text(
            text = "瑪利亞基金會服務總覽",
            color = Color.Blue,
            modifier = modifier
        )
        Image(
            painter = painterResource(id = R.drawable.service),
            contentDescription = "圖片2",
            alpha = 2.0f,
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Black)
        )
        Button(onClick = { var it = Intent(context, MainActivity3::class.java)
            context.startActivity(it)
        }){
            Text(text = "資工二B楊依姍")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S1114760Theme {
        Greeting("Android")
    }
}