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

        val backButton = findViewById<ImageView>(R.id.btn_back)
        backButton.setOnClickListener {
            finish()
        }

        val title = findViewById<TextView>(R.id.header_title)
        val subtitle = findViewById<TextView>(R.id.header_subtitle)

        title.text = "Healthcare AI"
        subtitle.text = "Transform patient care with technology"
    }
}
