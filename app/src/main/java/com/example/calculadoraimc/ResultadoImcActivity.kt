package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadoraimc.model.Usuario
import kotlinx.android.synthetic.main.activity_resultado_imc.*

class ResultadoImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

        var usuario = intent.getSerializableExtra("usuario") as Usuario

        var nome = usuario.nome.toString()
        var peso = usuario.peso
        var altura = usuario.altura

        var imc = peso / (altura * altura)

        textViewResult.text = "${usuario.nome.toString()} seu IMG é de:\n $imc"
    }
}