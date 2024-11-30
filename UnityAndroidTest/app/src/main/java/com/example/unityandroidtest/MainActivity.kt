package com.example.unityandroidtest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unityandroidtest.ui.theme.UnityAndroidTestTheme
import com.unity3d.player.UnityPlayerActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnityAndroidTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    private fun navigateToUnity() {
        val intent = Intent(this, UnityPlayerActivity::class.java)
        startActivity(intent)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    val context = LocalContext.current
    TextButton(
        onClick = {
            val intent = Intent(context, UnityPlayerActivity::class.java)
            context.startActivity(intent)
        },
        modifier = modifier.padding(top = 16.dp)
    ) {
        Text("Go to Unity")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnityAndroidTestTheme {
        Greeting("Android")
    }
}


