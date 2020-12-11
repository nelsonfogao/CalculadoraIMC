package com.example.calculadoraimc

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_imc.*

class ImcFragment : Fragment() {

        private lateinit var mainViewModel: MainViewModel

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            var view = inflater.inflate(R.layout.fragment_imc, container, false)
            mainViewModel = ViewModelProvider(requireActivity(), ViewModelFactory()).get(MainViewModel::class.java)
            return view
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

            btnCalcular.setOnClickListener{
                if(editTextNome.text.isNullOrEmpty() || editTextPeso.text.isNullOrEmpty() || editTextAltura.text.isNullOrEmpty()){
                    Snackbar.make(it, "Digite seus dados!!", Snackbar.LENGTH_SHORT).setTextColor(Color.WHITE)
                        .setBackgroundTint(Color.RED)
                        .show()
                }else {
                    actionCalcularIMC()
                    findNavController().navigate(R.id.resultadoFragment)
                }
            }

        }

    private fun actionCalcularIMC() {

        var nome = editTextNome.text.toString()
        var peso = editTextPeso.text.toString()
        var altura = editTextAltura.text.toString()

        mainViewModel.nome = nome
        mainViewModel.altura = altura.toFloat()
        mainViewModel.peso = peso.toFloat()

    }

}