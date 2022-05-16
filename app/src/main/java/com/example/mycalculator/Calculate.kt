package com.example.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculate : AppCompatActivity() {

    lateinit var addBtn: Button
    lateinit var subtractBtn: Button
    lateinit var multiplyBtn: Button
    lateinit var modulousBtn: Button
    lateinit var etFirstNumber:EditText
    lateinit var etSecond: EditText
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

            addBtn = findViewById(R.id.addBtn)
            subtractBtn = findViewById(R.id.subtractBtn)
            multiplyBtn= findViewById(R.id.multiplyBtn)
            modulousBtn = findViewById(R.id.modulousBtn)
            etFirstNumber= findViewById(R.id.etFirstNumber)
            etSecond= findViewById(R.id.etSecond)
            tvResult = findViewById(R.id.tvResult)

            addBtn.setOnClickListener {
                var a = etFirstNumber.text.toString().toInt()
                var b= etSecond.text.toString().toInt()
                calculateAddition(a,b)
            }
            subtractBtn.setOnClickListener {
                var a = etFirstNumber.text.toString().toInt()
                var b = etSecond.text.toString().toInt()
                calculateSubtraction(a,b)
            }
            multiplyBtn.setOnClickListener {
                var a = etFirstNumber.text.toString().toInt()
                var b = etSecond.text.toString().toInt()
                calculateMultiplication(a,b)
            }
            modulousBtn.setOnClickListener {
                var a = etFirstNumber.text.toString().toInt()
                var b = etSecond.text.toString().toInt()
                calculateModulus(a,b)

            }
        }
        fun calculateAddition(Number1: Int, Number2: Int) {
            var addition = Number1 + Number2
            tvResult.text = addition.toString()
        }

        fun calculateSubtraction(Number1: Int, Number2: Int) {
            var subtract  = Number1 - Number2
            tvResult.text = subtract.toString()
        }

        fun calculateMultiplication(Number1: Int, Number2: Int) {
            var multiple = Number1 * Number2
            tvResult.text = multiple.toString()
        }

        fun calculateModulus(Number1: Int, Number2: Int) {
            var modulus = Number1 % Number2
            tvResult.text = modulus.toString()

        }}


