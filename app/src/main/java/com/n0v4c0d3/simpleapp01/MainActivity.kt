package com.n0v4c0d3.simpleapp01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var decreaseBtn: Button
    private lateinit var increaseBtn: Button
    private lateinit var counterText: TextView

    private var currentCount = -99

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decreaseBtn = findViewById(R.id.decrease_btn)
        increaseBtn = findViewById(R.id.increase_btn)
        counterText = findViewById(R.id.count_text)

        currentCount = counterText.text.toString().toInt()

        decreaseBtn.setOnClickListener {
            currentCount -= 1
            updateCountView()
        }

        increaseBtn.setOnClickListener {
            currentCount += 1
            updateCountView()
        }
    }

    private fun updateCountView() {
        counterText.text = currentCount.toString()
    }
}