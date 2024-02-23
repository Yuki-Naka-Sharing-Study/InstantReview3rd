package com.example.instant_review_third

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

//「空のMainFragment」ここから「各Fragment」に「Navigation」で画面遷移する。
class MainFragment : Fragment() {

    private lateinit var btnMainToAte: Button
    private lateinit var btnMainToWant: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        btnMainToAte = view.findViewById(R.id.btn_main_to_ate)
        btnMainToWant = view.findViewById(R.id.btn_main_to_want)

        btnMainToAte.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_ateFragment)
        }

        btnMainToWant.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_wantFragment)
        }

        return view
    }

}