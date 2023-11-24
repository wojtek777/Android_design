package com.example.logicgames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.logicgames.ui.theme.LogicGamesTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setContent()
        {
            LogicGamesTheme()
            {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    MainMenu("Logic Games v0.001")
                }
            }
        }
    }
}

@Composable
fun MainMenu(menuText: String, modifier: Modifier = Modifier)
{
    Text(
        text = "$menuText",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun MainMenuPreview()
{
    LogicGamesTheme()
    {
        MainMenu("Logic Games v0.001")
    }
}
