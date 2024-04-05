package com.example.greatingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.fillMaxWidth
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
                    //Preview
                    ComposeQuadApp()
                }
            }
        }
    }
}


@Composable
fun ComposeQuadApp() {
    Column() { //max item width
        Row(Modifier.weight(1f)) {

            //2 item
            ComposableInfoCard(title = "Text composable",
                    description = "Displays text and follows the recommended Material Design guidelines.",
                    bgColor = Color(0xFFEADDFF)
            )
            ComposableInfoCard(title = "Image composable",
                    description = "Creates a composable that lays out and draws a given Painter class object.",
                    bgColor = Color(0xFFD0BCFF)
            )
            

        }
        Row(Modifier.weight(1f)) {
            //2item
            ComposableInfoCard(title = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence.",
                    bgColor = Color(0xFFB69DF8)
            )
            ComposableInfoCard(title = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence.",
                    bgColor = Color(0xFFF6EDFF)
            )
        }
        Row(Modifier.weight(1f)) {
            //2item
            ComposableInfoCard(title = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence.",
                    bgColor = Color(0xFFB69DF8)
            )
            ComposableInfoCard(title = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence.",
                    bgColor = Color(0xFFF6EDFF)
            )
        }
    }
    Column {

    }

}

@Composable
private fun ComposableInfoCard(
        title: String,
        description: String,
        bgColor: Color,
        modifier: Modifier = Modifier,
) {
    Column(
            modifier = modifier
                    .fillMaxSize()
                    .background(bgColor)
                    .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
                text = title,
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold
        )
        Text(
                text = description,
                textAlign = TextAlign.Justify
        )
    }

}


@Preview(showBackground = true,)
@Composable
fun QuadrantPreview() {
    GreatingCardTheme {
        ComposeQuadApp()
    }
}


