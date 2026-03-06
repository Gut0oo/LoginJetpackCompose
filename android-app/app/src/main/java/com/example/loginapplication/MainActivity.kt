package com.example.loginapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapplication.ui.theme.LoginApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginApplicationTheme {

                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "main"
                ){
                    composable(route = "main") {
                        Login(navController)
                    }

                    composable(route = "forgot_password") {
                        ForgetPassword(navController)
                    }

                    composable(route = "register_screen") {
                        Register(navController)
                    }
                }

            }
        }
    }
}