package com.example.instant_review_third.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.instant_review_third.R

class ReviewMakeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_review_make, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toolbar = view.findViewById<com.google.android.material.appbar.MaterialToolbar>(R.id.toolbar_review_make)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.setDisplayShowTitleEnabled(false)

        val btnCloseReviewMake: ImageButton = view.findViewById(R.id.btn_close_review_make)
        btnCloseReviewMake.setOnClickListener {
            findNavController().navigate(R.id.action_reviewMakeFragment_to_ateFragment)
        }

        val textSave: TextView = view.findViewById(R.id.text_view_save_review_make)
        textSave.setOnClickListener {

        }
    }

}