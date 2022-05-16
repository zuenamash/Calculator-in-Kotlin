package com.example.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnCalculator:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculator=findViewById(R.id.btnCalculator)
        btnCalculator.setOnClickListener {
            var intent=Intent(this,btnCalc::class.java)
            startActivity(intent)
        }
    }
}