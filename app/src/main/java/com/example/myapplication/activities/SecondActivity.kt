package com.example.myapplication.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

/**
 * Copyright 2021, White Cloak Technologies, Inc., All rights reserved.
 *
 * @author alenbrubio
 * @since 10/14/2021
 */

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val string = intent.getBundleExtra("sample")?.getString("string")
        val int = intent.getBundleExtra("sample")?.getInt("Int")
        val txt = findViewById<TextView>(R.id.txt1)


        txt.text = "$string and $int"
    }
}