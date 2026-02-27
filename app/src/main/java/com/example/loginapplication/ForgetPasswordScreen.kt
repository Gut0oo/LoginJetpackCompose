package com.example.loginapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginapplication.ui.theme.Black
import com.example.loginapplication.ui.theme.Blue
import com.example.loginapplication.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgetPassword(){
    var email by remember { mutableStateOf(value = "") }
    var new by remember { mutableStateOf(value = "") }
    var confirm by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier
            .background(color = White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        TopAppBar(
            modifier = Modifier.fillMaxWidth()
                .size(200.dp),

            title = {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .padding(10.dp)
                ) {
                    Button(
                        onClick = {},

                        modifier = Modifier
                            .size(90.dp, 70.dp)
                            .padding(10.dp),

                        colors = ButtonDefaults.buttonColors(containerColor = Blue)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Voltar tela",

                            modifier = Modifier.size(20.dp),
                            tint = Black

                        )
                    }

                    Text(
                        text = "Forget Password",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,

                        modifier = Modifier.padding(10.dp)
                    )
                }
            },

            colors = TopAppBarDefaults.topAppBarColors(containerColor = White)
        )

        


        Spacer(
            modifier = Modifier.width(100.dp)
        )

        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },

                label = {
                    Text(
                        text = "Email"
                    )
                }
            )
            OutlinedTextField(
                value = new,
                onValueChange = {
                    new = it
                },

                label = {
                    Text(
                        text = "New password"
                    )
                }
            )

            OutlinedTextField(
                value = confirm,
                onValueChange = {
                    confirm = it
                },

                label = {
                    Text(
                        text = "Confirm Password"
                    )
                }
            )


            Button(
                onClick = {

                },

                colors = ButtonDefaults.buttonColors(containerColor = Blue),

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(35.dp)
            ) {
                Text(
                    text = "Update",
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }
}


@Preview
@Composable
fun ForgetPasswordPreview(){
    ForgetPassword();
}