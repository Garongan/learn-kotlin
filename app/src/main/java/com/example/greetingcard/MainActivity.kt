package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			GreetingCardTheme {
//				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//					Greeting(
//						name = "Alvindo Tri Jatmiko",
//						modifier = Modifier.padding(innerPadding)
//					)
//				}
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colorScheme.background
				) {
					Greeting(name = "Alvindo Tri Jatmiko")
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String) {
	Surface(color = Color.Magenta) {
		Text(
			text = "Hi, my name is $name",
			modifier = Modifier.padding(24.dp)
		)
	}
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
	GreetingCardTheme {
		Greeting("Alvindo Tri Jatmiko")
	}
}