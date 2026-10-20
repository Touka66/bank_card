package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                )
                    BankCardScreen()
                }
            }
        }
    }

@Composable
fun BankCardScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x0000000)),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .width(340.dp)
                .height(200.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xffFF69B4)

            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 20.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp)

            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "TOIKA BANK",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = ".... .... .... 4821",
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Medium,
                        letterSpacing = 2.sp
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "KRISTINA EGOROVA",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Light
                        )
                        Text(
                            text = "11/30",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                }
            }
        }
    }
}
