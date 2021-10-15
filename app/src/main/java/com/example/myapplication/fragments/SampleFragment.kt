package com.example.myapplication.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.activities.SecondActivity

/**
 * Copyright 2021, White Cloak Technologies, Inc., All rights reserved.
 *
 * @author alenbrubio
 * @since 10/14/2021
 */

class SampleFragment : Fragment(R.layout.fragment_sample) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = getView()?.findViewById<Button>(R.id.button_sample)
        val button2 = getView()?.findViewById<Button>(R.id.button_second)
        button?.setOnClickListener {
            findNavController().navigate(R.id.fragment_second)
        }

        button2?.setOnClickListener {
            val secondIntent = Intent(requireContext(), SecondActivity::class.java)
            startActivity(secondIntent)
        }
    }
}