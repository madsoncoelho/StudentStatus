package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = btnCalculate
        val tvResult = tvResult

        btnCalculate.setOnClickListener {
            val firstGrade: Double = etFirstGrade.text.toString().toDouble()
            val secondGrade: Double = etSecondGrade.text.toString().toDouble()
            val misses: Int = etMisses.text.toString().toInt()

            val average = (firstGrade + secondGrade) / 2

            if (average >= 6 && misses <= 10) {
                tvResult.text = "O aluno foi aprovado.\nNota Final: $average"
                tvResult.setTextColor(Color.GREEN)
            }
            else {
                tvResult.text = "O aluno foi reprovado.\nNota Final: $average"
                tvResult.setTextColor(Color.RED)
            }
        }
    }
}