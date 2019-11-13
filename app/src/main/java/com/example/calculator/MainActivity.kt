package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){

            val input:String = editText7.text.toString()
            val value:Double = input.toDouble()
            val result:Double = value * 0.123

            txtOutput.text = "%.2f".format(result)
        }
    }
}
