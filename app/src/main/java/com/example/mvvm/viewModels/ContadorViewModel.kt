package com.example.mvvm.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {
    private val _contador = mutableStateOf(0)  // guion bajo cuando
    // es privada PERO es por convencion.
    // Esta es la que vamos a manipular en el view model. La que se va a incrementar
    val contador: State<Int> = _contador // esta va a servir para leer desde composable.
    // NO SE puede modificar

    fun add() {
        _contador.value = _contador.value + 1
    }
}