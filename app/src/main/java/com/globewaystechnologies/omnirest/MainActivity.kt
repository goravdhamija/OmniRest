package com.globewaystechnologies.omnirest

import android.content.ComponentName
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.globewaystechnologies.omnirest.ui.theme.OmniRestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent()
        intent.component = ComponentName(
            "com.globewaystechnologies.slidevideospy", // The package name of the other app
            "com.globewaystechnologies.slidevideospy.PinkService" // The full class name of the Service
        )
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_NO_ANIMATION

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            stopService(intent)
        } else {
            stopService(intent)
        }
        finish()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OmniRestTheme {
        Greeting("Android")
    }
}