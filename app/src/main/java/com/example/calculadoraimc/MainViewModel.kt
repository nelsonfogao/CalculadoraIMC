package com.example.calculadoraimc

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
        var nome: String = ""
        var peso: Float = 0f
        var altura: Float = 0f
        var imc :Float = 0f

    fun calcularIMC ():Float{
        imc = peso / (altura * altura)
        return imc
    }
}