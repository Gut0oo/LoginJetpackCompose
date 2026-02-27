package com.example.loginapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginapplication.ui.theme.Blue
import com.example.loginapplication.ui.theme.White

@Composable
fun Login(){
    val email by remember { mutableStateOf("") }
    val password by remember { mutableStateOf("") }

    var checked by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .background(color = White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = "Login",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,
            
            modifier = Modifier
                .padding(0.dp, 25.dp, 0.dp)
        )

        Spacer(
            modifier = Modifier.padding(30.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = {

            },
            label = {

                Row{
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null
                    )
                    Text("Email")
                }
            },
        )

        Spacer(
            modifier = Modifier.padding(5.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = {

            },
            label = {
                Row{
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null,

                    )
                    Text("Password")
                }
            }
        )

        Row(
            modifier = Modifier.size(275.dp, 40.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = {
                    checked = it
                },

                enabled = true,

                colors = CheckboxDefaults.colors(
                    checkedColor = Blue
                ),
            )

            Text(
                text = "Forgot Password?",
                textDecoration = TextDecoration.Underline
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp, 40.dp, 40.dp, 5.dp)
                .size(50.dp),
            onClick = {

            },

            colors = ButtonDefaults.buttonColors(
                containerColor = Blue
            )

        ) {
            Text(
                text = "Login",
                fontSize = 25.sp
            )
        }

        Text(
            text = "Register",
            textDecoration = TextDecoration.Underline
        )
    }
}

@Preview
@Composable
fun LoginPreview(){
    Login()
}