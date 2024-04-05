package com.example.greatingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greatingcard.ui.theme.GreatingCardTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreatingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                ) {
                    TaskComplete(
                            messageT1 = stringResource(R.string.messageT1),
                            messageT2 = stringResource(R.string.messageT2)

                    )
                }
            }
        }
    }
}



@Composable
fun TaskManager(messageT1: String, messageT2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)

    Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
                painter = image,
                contentDescription = null,
        )
        Text(
                text = messageT1,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(0.dp, 24.dp, 0.dp, 8.dp),
        )
        Text(
                text = messageT2,
                fontSize = 16.sp,
        )
    }
}



@Composable
fun TaskComplete(messageT1: String, messageT2: String, modifier: Modifier = Modifier) {
    Box(modifier) {
        TaskManager(messageT1 = messageT1, messageT2 = messageT2, modifier = Modifier.fillMaxSize())
    }
}

@Preview(showBackground = true, name = "TaskComplete Preview")
@Composable
fun TaskCompletePreview() {
    GreatingCardTheme() {
        TaskComplete(
                messageT1 = stringResource(R.string.messageT1),
                messageT2 = stringResource(R.string.messageT2)
        )
    }
}



