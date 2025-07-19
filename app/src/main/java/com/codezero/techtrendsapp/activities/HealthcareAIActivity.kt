package com.codezero.techtrendsapp.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.codezero.techtrendsapp.R

class HealthcareAIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthcare_ai)

        // Handle back button click to close the activity
        val backButton = findViewById<ImageView>(R.id.btn_back)
        backButton.setOnClickListener {
            finish() // Closes the current screen and returns to the home
        }

        // Set title and subtitle text in the header
        val title = findViewById<TextView>(R.id.header_title)
        val subtitle = findViewById<TextView>(R.id.header_subtitle)

        title.text = "Healthcare AI"                               // Title shown in the top header
        subtitle.text = "Transform patient care with technology"   // Short descriptive subtitle
    }
}