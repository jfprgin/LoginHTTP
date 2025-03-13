package com.example.loginhttp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.loginhttp.ui.screens.LoginScreen
import com.example.loginhttp.ui.theme.LoginHTTPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginHTTPTheme {
                val loginViewModel: LoginViewModel = viewModel()

                LoginScreen(viewModel = loginViewModel)
            }
        }
    }
}
