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

        var resultadoExtenso = ""


        if (imc < 18.5){
            resultadoExtenso = "Magreza"
        }else if(imc in 18.5..24.5){
            resultadoExtenso = "Normal"
        }else if(imc in 25.0..29.9){
            resultadoExtenso = "Sobrepeso"
        }else if (imc in 30.0..39.9){
            resultadoExtenso = "Obesidade"
        }else{
            resultadoExtenso = "Obesidade Grave"
        }



        textViewResult.text = "${usuario.nome.toString()} seu IMC é de:\n\n $imc \n\n Sua Classificação é: \n\n $resultadoExtenso"
    }
}