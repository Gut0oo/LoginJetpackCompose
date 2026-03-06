package com.example.loginapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapplication.ui.theme.Blue
import com.example.loginapplication.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register(navController : NavController){
    val username by remember { mutableStateOf (value = "") };
    val fullname by remember { mutableStateOf (value = "") };
    val email by remember { mutableStateOf (value = "") };
    val password by remember { mutableStateOf (value = "") };

    var terms by remember { mutableStateOf (value = false) };




    Column(
        modifier = Modifier
            .background(color = White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TopAppBar(
            title = {
                Text(
                    text = "Sign Up",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,

                    color = White
                )
            },
            modifier = Modifier
                .fillMaxWidth(),

            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Blue
            )
        )


        Spacer(
            modifier = Modifier.height(50.dp)
        )

        OutlinedTextField(
            value = username,
            onValueChange = {

            },

            label = {
                Text(text = "Username")
            }
        )

        OutlinedTextField(
            value = fullname,
            onValueChange = {

            },

            label = {
                Text(text = "Full Name")
            }
        )

        OutlinedTextField(
            value = email,
            onValueChange = {

            },

            label = {
                Text(text = "Email")
            }
        )

        OutlinedTextField(
            value = password,
            onValueChange = {

            },

            label = {
                Text(text = "Password")
            }
        )


        Row(
            modifier = Modifier,

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Checkbox(
                checked = terms,
                onCheckedChange = {
                    terms = it;
                },

                enabled = true,

                colors = CheckboxDefaults.colors(
                    checkedColor = Blue
                )
            )

            Text(
                text = "Agree with Terms & Conditions"
            )

        }

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Button(
            onClick = {

            },
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(25.dp, 15.dp),

             colors = ButtonDefaults.buttonColors(containerColor = Blue)
        ) {
            Text(text = "Register")
        }

        Text(
            text = "Im already a member",
            modifier = Modifier
                .clickable{
                    navController.navigate(route = "main")
                },
            textDecoration = TextDecoration.Underline
        )
    }
}

/*
@Preview
@Composable
fun RegisterPreview(){
    Register();
}
*/