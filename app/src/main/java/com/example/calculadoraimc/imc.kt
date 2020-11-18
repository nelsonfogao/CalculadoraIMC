package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.example.calculadoraimc.model.Usuario
import kotlinx.android.synthetic.main.activity_imc.*
import kotlinx.android.synthetic.main.activity_main.*


class imc : AppCompatActivity() {

//    lateinit var usuario: Usuario

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)



        btnCalcular.setOnClickListener{
            actionCalcularIMC()
        }

    }

    private fun actionCalcularIMC() {

        var nome = editTextNome.text.toString()
        var peso = editTextPeso.text.toString()
        var altura = editTextAltura.text.toString()

        var usuario = Usuario(nome, peso.toFloat(), altura.toFloat())

        usuario.nome = nome.toString()
        usuario.altura = altura.toFloat()
        usuario.peso = peso.toFloat()

        var intent = Intent(this, ResultadoImcActivity::class.java)

        intent.putExtra("usuario", usuario)
        startActivity(intent)
    }


}