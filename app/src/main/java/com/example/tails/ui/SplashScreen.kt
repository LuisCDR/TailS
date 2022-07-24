package com.example.tails

import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tails.ui.theme.TailSTheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    val expanded : Boolean by remember { mutableStateOf(false) }

    Card {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.mipmap.ic_launcher_round),
                contentDescription = "${stringResource(id = R.string.app_name)} logo"
            )

            LaunchedEffect(expanded) {
                delay(10000)
            }.run {
                AnimateText(expanded = !expanded)
            }
        }

    }
}

@Composable
fun AnimateText(expanded: Boolean) {
    AnimatedVisibility(
        visible = expanded,
        enter = expandVertically(expandFrom = Alignment.Top) { 20 }
    ) {
        Column(
            modifier = Modifier.padding(bottom = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.h6
            )
            Text(
                text = stringResource(id = R.string.greeting),
                style = MaterialTheme.typography
                    .body1.copy(
                        fontWeight = FontWeight.Light,
                        fontSize = 15.sp
                    )
            )
        }
    }
}


@Preview(
    showBackground = true,
    widthDp = 280,
    heightDp = 380
)
@Composable
fun SplashScreenPreview() {
    TailSTheme {
        SplashScreen()
    }
}