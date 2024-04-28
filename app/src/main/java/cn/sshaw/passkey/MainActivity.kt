package cn.sshaw.passkey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cn.sshaw.passkey.ui.theme.PasskeyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PasskeyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TotalWealth(amount = 123.56)
                }
            }
        }
    }
}

@Composable
fun TotalWealth(amount: Double) {
    Card {
        Row {
            Text(text = "总金额")
            Text(text = "CN¥ $amount")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TotalWealthPreview() {
    PasskeyTheme {
        TotalWealth(amount = 123.45)
    }
}