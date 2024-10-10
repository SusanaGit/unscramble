package com.susanafigueroa.u4_unscramble.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel : ViewModel() {

    // Representa el estado de la UI.
    // MutableStateFlow: emite y guarda el estado actual y notifica a los observadores cada vez
    // que el estado cambia.
    // GameUiState(): valor inicial del flujo. Es una clase de datos.
    private val _uiState = MutableStateFlow(GameUiState())

    // Una vez iniciado, uiState de tipo StateFlow expone un estado que solo puede
    // ser modificado dentro de esta clase.
    // Otros componentes pueden observar el StateFlow.
    // Cada vez que el estado uiState cambia, la vista se actualiza automáticamente.
    val uiState: StateFlow<GameUiState> = _uiState.asStateFlow()

    // Para guardar la palabra desordenada actual.
    // lateinit = variable que no se inicializa en el momento de su declaración sinó luego
    private lateinit var currentWord: String

    // Conjunto mutable para almacenar las palabras usadas en el juego.
    private var usedWords: MutableSet<String> = mutableSetOf()

}