package com.example.calculadoraimc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home_imc.*

class HomeImcFragment : Fragment() {

        private lateinit var mainViewModel: MainViewModel

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            var view = inflater.inflate(R.layout.fragment_home_imc, container, false)
            mainViewModel = ViewModelProvider(requireActivity(), ViewModelFactory()).get(MainViewModel::class.java)
            return view
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            btnStart.setOnClickListener{
                findNavController().navigate(R.id.imcFragment)
            }
        }
}