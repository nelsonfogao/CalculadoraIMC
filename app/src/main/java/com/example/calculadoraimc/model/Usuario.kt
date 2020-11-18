package com.example.calculadoraimc.model

import java.io.Serializable

class Usuario(
        var nome: String,
        var peso: Float = 0f,
        var altura: Float = 0f
): Serializable {
        override fun toString(): String {
        return "Nome: \t$nome\n" +
                "Peso: \t$peso\n" +
                "Altura: \t$altura\n"

        }
}