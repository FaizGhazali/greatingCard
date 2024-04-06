package com.example.greatingcard

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
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
    Column(Modifier.fillMaxWidth()) { //max item width
        Row(Modifier.weight(1f)) {

            //2 item
            ComposableInfoCard(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                bgColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                bgColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )


        }
        Row(Modifier.weight(1f)) {
            //2item
            ComposableInfoCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                bgColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                bgColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }

    }


}

@Composable
fun ComposeBusinessCardApp() {
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .border(2.dp, Color.Red),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp, top = 4.dp)
                    .border(2.dp, Color.Blue),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Profile Picture")
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp, top = 2.dp)
                    .border(2.dp, Color.Blue),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Full Name")
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp, top = 2.dp, bottom = 4.dp)
                    .border(2.dp, Color.Blue),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Full Name")
            }
        }
    }
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter

    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 0.dp, bottom = 40.dp)
                .border(2.dp, Color.Red),
            verticalArrangement = Arrangement.Center, //left justified
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp, top = 4.dp)
                    .border(2.dp, Color.Blue),

                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    Modifier.padding
                        (start = 50.dp, top = 4.dp, bottom = 4.dp)
                ) {
                    Text(text = "icon", modifier = Modifier.border(2.dp, Color.Magenta))
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "+60-132022352", modifier = Modifier.border(2.dp, Color.Magenta))
                    //Space 10dp
                }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp, top = 2.dp)
                    .border(2.dp, Color.Blue),

                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    Modifier.padding
                        (start = 50.dp, top = 4.dp, bottom = 4.dp)
                ) {
                    Text(text = "icon", modifier = Modifier.border(2.dp, Color.Magenta))
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "@faizghazra", modifier = Modifier.border(2.dp, Color.Magenta))
                }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp, top = 2.dp, bottom = 4.dp)
                    .border(2.dp, Color.Blue),


                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    Modifier.padding
                        (start = 50.dp, top = 4.dp, bottom = 4.dp)
                ) {
                    Text(text = "icon", modifier = Modifier.border(2.dp, Color.Magenta))
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "ahmadfaiz21@outlook.com",
                        modifier = Modifier.border(2.dp, Color.Magenta)
                    )
                }

            }
        }
    }
}

@Composable
private fun ComposableProfile(
    profilePicture: Painter,
    name: String,
    title: String,
    phoneNumber: String,
    socialMedia: String,
    email: String,
    modifier:
    Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)

            ) {
                Row {
                    Image(painter = profilePicture, contentDescription = null) // how to do this
                }

            }
            Box {
                Row {
                    Text(
                        text = name,

                        )
                }
            }
            Row {
                Text(
                    text = title,

                    )
            }
        }
        Column(
            modifier = Modifier.align(Alignment.BottomCenter),


            ) {
            Text(
                text = phoneNumber, textAlign = TextAlign.Center


            )
            Text(
                text = socialMedia,
                textAlign = TextAlign.Center

            )
            Text(
                text = email,

                )
        }

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
            .background(bgColor),

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
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
    }

}


@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    GreatingCardTheme {
        ComposeBusinessCardApp()
    }
}


