package com.example.ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView


 lateinit var btnAccept: Button
 lateinit var text: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAccept = findViewById(R.id.btnAccept)
        text = findViewById(R.id.text)
        btnAccept.setOnClickListener {
            text.text = getString(R.string.button_clicked)
        }
    }
}