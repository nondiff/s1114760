package com.example.s1114760

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.s1114760.ui.theme.S1114760Theme

class MainActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S1114760Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting5("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting5(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val activity = (context as Activity)
    Column {
        Button(onClick = { activity.finish() })
        {
            Text(text = "簡介")
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
            text = "主要機構",
            color = Color.Red,
            modifier = modifier
        )
        Button(onClick = {
            var it = Intent(context, MainActivity5::class.java)
            context.startActivity(it)
        }) {
            Text(text = "台中市愛心家園")
        }
        Button(onClick = {
            var it = Intent(context, MainActivity6::class.java)
            context.startActivity(it)
        }) {
            Text(text = "瑪利亞學園")
        }
        Text(
            text = "「台中市愛心家園」經市政府公開評選後，委託瑪利亞基金會經營管理，於91年啟用，整棟建築物有四個樓層，目前開辦就醫、就養、就學、就業四大領域的十項業務，提供身心障礙者全方位的服務。\n",
            color = Color.Black,
            modifier = modifier
        )
        Text(
            text = "長按以下圖片，可以觀看愛心家園地圖",
            color = Color.Blue,
            modifier = modifier
        )
        Button(
            onClick = {
                var it = Intent(Intent.ACTION_VIEW)
                it.data = Uri.parse("geo:24.13162628719077,120.65332936759829")
                context.startActivity(it)
            }
        )
        {
            Image(
                painter = painterResource(id = R.drawable.lovehome),
                contentDescription = "圖3",
                modifier = Modifier
                    .fillMaxSize().pointerInput(Unit) {
                        detectTapGestures(
                            onLongPress = { var msg = "長按" },
                        )
                    }
            )
        }


    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    S1114760Theme {
        Greeting5("Android")
    }
}