package com.n0v4c0d3.simpleapp01

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var decreaseBtn: Button
    private lateinit var increaseBtn: Button
    private lateinit var counterText: TextView
    private lateinit var personImageView: ImageView
    private lateinit var toggleGlassesButton: Button

    private var currentCount = -99
    private var glassesOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decreaseBtn = findViewById(R.id.decrease_btn)
        increaseBtn = findViewById(R.id.increase_btn)
        counterText = findViewById(R.id.count_text)
        personImageView = findViewById(R.id.person_image_view)
        toggleGlassesButton = findViewById(R.id.toggle_glasses)

        currentCount = counterText.text.toString().toInt()
        personImageView.setImageResource(R.drawable.no_glasses)

        decreaseBtn.setOnClickListener {
            currentCount -= 1
            updateCountView()
        }

        increaseBtn.setOnClickListener {
            currentCount += 1
            updateCountView()
        }

        toggleGlassesButton.setOnClickListener {
            glassesOn = !glassesOn
            toggleGlasses()
        }
    }

    private fun updateCountView() {
        counterText.text = currentCount.toString()
    }

    private fun toggleGlasses() {
        val rId = when(glassesOn){
            true -> R.drawable.glasses
            false -> R.drawable.no_glasses
        }
        personImageView.setImageResource(rId)
    }
}