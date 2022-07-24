package com.example.tails.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tails.ui.theme.TailSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TailSTheme {
                // A surface container using the 'background' color from the theme
                App()
            }
        }
    }
}

@Composable
fun App() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = {  }
    ) { paddingValues ->
        BodyContent(modifier = Modifier
                .padding(paddingValues)
        )
    }
}

@Composable
fun TopBar() {
    TopAppBar() {

    }
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Surface(modifier = modifier) {

    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    TailSTheme(darkTheme = true) {
        App()
    }
}