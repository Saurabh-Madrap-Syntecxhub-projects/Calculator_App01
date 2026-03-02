package com.ssmj.calculatorapp01

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val engine = CalculatorEngine()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1 = findViewById<EditText>(R.id.input1)
        val input2 = findViewById<EditText>(R.id.input2)
        val resultText = findViewById<TextView>(R.id.resultText)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnMul = findViewById<Button>(R.id.btnMul)
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        val btnClear = findViewById<Button>(R.id.btnClear)

        fun perform(op: String) {
            val a = input1.text.toString()
            val b = input2.text.toString()

            if (a.isBlank() || b.isBlank()) {
                resultText.text = "Enter both numbers"
                return
            }

            val num1 = a.toDoubleOrNull()
            val num2 = b.toDoubleOrNull()

            if (num1 == null || num2 == null) {
                resultText.text = "Invalid input"
                return
            }

            val result = engine.calculate(num1, num2, op)

            result.onSuccess {
                resultText.text = "Result: $it"
            }.onFailure {
                resultText.text = it.message
            }
        }

        btnAdd.setOnClickListener { perform("+") }
        btnSub.setOnClickListener { perform("-") }
        btnMul.setOnClickListener { perform("*") }
        btnDiv.setOnClickListener { perform("/") }

        btnClear.setOnClickListener {
            input1.text.clear()
            input2.text.clear()
            resultText.text = "Result:"
        }
    }
}