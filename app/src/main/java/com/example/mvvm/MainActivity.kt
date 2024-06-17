package com.example.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvvm.ui.theme.MvvmTheme
import com.example.mvvm.viewModels.ContadorViewModel
import com.example.mvvm.viewModels.LoteriaViewModel
import com.example.mvvm.views.Contador
import com.example.mvvm.views.LoteriaView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val viewModel :  ContadorViewModel by viewModels()
        val viewModel :  LoteriaViewModel by viewModels()
        setContent {
            //Contador(viewModel = viewModel)
            LoteriaView(viewModel = viewModel)
        }
    }
}

