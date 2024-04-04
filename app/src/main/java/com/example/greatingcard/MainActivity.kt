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
                    ArticleImage(
                            message1 = stringResource(R.string.message1),
                            message2 = stringResource(R.string.message2),
                            message3 = stringResource(R.string.message3),

                            )
                }
            }
        }
    }
}


@Composable
fun ArticleText(message1: String, message2: String, message3: String, modifier: Modifier =
        Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
            modifier = modifier
    ) {
        Image(
                painter =  image,
                contentDescription = null,
        )
        Text(
                text = message1,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
        )
        Text(
                text = message2,
                modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 0.dp),
                textAlign = TextAlign.Justify
        )
        Text(
                text = message3,
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Justify
        )
    }

}


@Composable
fun ArticleImage(message1: String, message2: String, message3: String, modifier: Modifier =
        Modifier) {

    Box(modifier) {

        ArticleText(
                message1 = message1,
                message2 = message2,
                message3 = message3,
                modifier = Modifier
                        .fillMaxSize()

        )
    }

}

@Preview(showBackground = true, name = "BirthdayCardPreview")
@Composable
fun ArticlePreview() {
    GreatingCardTheme {
//        GreetingText(message = "Happy Birthday Sam!", from = "From aaa ")
        ArticleImage(
                message1 = stringResource(R.string.message1),
                message2 = stringResource(R.string.message2),
                message3 = stringResource(R.string.message3),
        )
    }
}

