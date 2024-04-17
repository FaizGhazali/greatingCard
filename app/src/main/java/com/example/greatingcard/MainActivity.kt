package com.example.greatingcard

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreatingCardTheme {
                LemonJuiceApp()
            }
        }
    }
}

@Composable
fun LemonJuice( modifier: Modifier = Modifier){
    var lemonPhase by remember { mutableStateOf(0) }
    val imageResource = when (lemonPhase){
        0 -> R.drawable.lemon_tree
        1 -> R.drawable.lemon_squeeze
        2 -> R.drawable.lemon_drink
        3 -> R.drawable.lemon_restart
        else ->R.drawable.lemon_tree
    }
    if(lemonPhase>3){
        lemonPhase = 0
    }
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(painter = painterResource(imageResource),
            contentDescription = "lemon Tree",
            modifier = Modifier
                .clickable {
                    lemonPhase++
                }
            )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Tap a Lemon Tree to select a lemon")
    }
}

@Preview
@Composable
fun LemonJuiceApp(){
    LemonJuice( modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
        .background(Color.White))
}