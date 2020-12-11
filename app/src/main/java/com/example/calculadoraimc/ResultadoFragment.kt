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


            textViewResultado.text = "${mainViewModel.nome} seu IMC é de:\n\n $imc \n\n Sua Classificação é: \n\n $resultadoExtenso"
        }
}