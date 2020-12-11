package com.example.calculadoraimc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_resultado.*

class ResultadoFragment : Fragment() {

        private lateinit var mainViewModel: MainViewModel

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            var view = inflater.inflate(R.layout.fragment_resultado, container, false)
            mainViewModel = ViewModelProvider(requireActivity(), ViewModelFactory()).get(MainViewModel::class.java)
            return view
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


            var imc = mainViewModel.calcularIMC()
            var resultadoExtenso = ""


            when {
                imc < 16 -> {
                    resultadoExtenso = "Magreza Grave"
                }
                imc >=16 && imc < 17 -> {
                    resultadoExtenso = "Magreza Moderada"
                }
                imc >=17 && imc < 18.5 -> {
                    resultadoExtenso = "Magreza Leve"
                }
                imc >=18.5 && imc < 25 -> {
                    resultadoExtenso = "Saudável"
                }
                imc >=25 && imc < 30 -> {
                    resultadoExtenso = "Sobrepeso"
                }
                imc >=30 && imc < 35 -> {
                    resultadoExtenso = "Obesidade Grau I"
                }
                imc >=35 && imc < 40 -> {
                    resultadoExtenso = "Obesidade Grau II (Severa)"
                }
                imc >= 40 -> {
                    resultadoExtenso = "Obesidade Grau III (Mórbida)"
                }
            }


            textViewResultado.text = "${mainViewModel.nome} seu IMC é de:\n\n $imc \n\n Sua Classificação é: \n\n $resultadoExtenso"
        }
}