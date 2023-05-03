
package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addingNumbers()
        substractNumbers()
        multiplyNumbers()
        divideNumbers()

    }

    fun addingNumbers() {

        var num1 = findViewById<EditText>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_add)

        button.setOnClickListener {

            var result1 = num1.text.toString().toInt()
            var result2 = num2.text.toString().toInt()
            var getResult = result1 + result2
            Toast.makeText(this, "$getResult", Toast.LENGTH_SHORT).show()
        }

    }

    fun substractNumbers() {

        var num1 = findViewById<EditText>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_sub)

        button.setOnClickListener {

            var result1 = num1.text.toString().toInt()
            var result2 = num2.text.toString().toInt()
            var getResult = result1 - result2
            Toast.makeText(this, "$getResult", Toast.LENGTH_SHORT).show()
        }

    }

    fun multiplyNumbers() {

        var num1 = findViewById<EditText>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_mul)

        button.setOnClickListener {

            var result1 = num1.text.toString().toInt()
            var result2 = num2.text.toString().toInt()
            var getResult = result1 * result2
            Toast.makeText(this, "$getResult", Toast.LENGTH_SHORT).show()
        }

    }

    fun divideNumbers() {

        var num1 = findViewById<EditText>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.btn_div)

        button.setOnClickListener {

            var result1 = num1.text.toString().toInt()
            var result2 = num2.text.toString().toInt()
            var getResult = result1 / result2
            Toast.makeText(this, "$getResult", Toast.LENGTH_SHORT).show()
        }

    }
}