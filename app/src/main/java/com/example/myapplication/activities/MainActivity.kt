package com.example.myapplication.activities

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button1)
        val username = findViewById<EditText>(R.id.editTextTextPersonName)
        val password = findViewById<EditText>(R.id.editTextTextPassword)

        button.setOnClickListener {
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("sample", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("sample", "load again")
    }

    override fun onPause() {
        super.onPause()
        Log.d("sample", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("sample", "onStop")
//      val intent = Intent(Intent.ACTION_VIEW)
//      intent.data = (Uri.parse("http://www.javatpoint.com"))
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("sample", "DisposeSQL")
//      val bundle = Bundle()
//      bundle.putString("string", "sample")
//      bundle.putInt("Int", 3)
//      val secondIntent = Intent(this, SecondActivity::class.java).putExtra("bundle",bundle)
//      startActivity(secondIntent)
    }
}