package com.example.unsplashapi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import androidx.paging.ExperimentalPagingApi
import com.example.unsplashapi.navigation.SetupNavGraph
import com.example.unsplashapi.ui.theme.UnsplashAPITheme


import dagger.hilt.android.AndroidEntryPoint

@ExperimentalPagingApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnsplashAPITheme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}