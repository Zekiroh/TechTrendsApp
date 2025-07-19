package com.codezero.techtrendsapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.codezero.techtrendsapp.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Set click listener for Generative AI card
        findViewById<LinearLayout>(R.id.btn_generative_ai).setOnClickListener {
            startActivity(Intent(this, GenerativeAIActivity::class.java))
        }

        // Set click listener for Healthcare AI card
        findViewById<LinearLayout>(R.id.btn_healthcare_ai).setOnClickListener {
            startActivity(Intent(this, HealthcareAIActivity::class.java))
        }

        // Set click listener for Autonomous Tech card
        findViewById<LinearLayout>(R.id.btn_autonomous_tech).setOnClickListener {
            startActivity(Intent(this, AutonomousTechActivity::class.java))
        }

        // Set click listener for XR card
        findViewById<LinearLayout>(R.id.btn_xr).setOnClickListener {
            startActivity(Intent(this, XRActivity::class.java))
        }

        // Set click listener for Ethical AI card
        findViewById<LinearLayout>(R.id.btn_ethical_ai).setOnClickListener {
            startActivity(Intent(this, EthicalAIActivity::class.java))
        }

        // Set click listener for Glossary card
        findViewById<LinearLayout>(R.id.btn_glossary).setOnClickListener {
            startActivity(Intent(this, GlossaryActivity::class.java))
        }

        // Animate each card with a fade-in and upward slide effect
        val cards = listOf(
            R.id.btn_generative_ai,
            R.id.btn_healthcare_ai,
            R.id.btn_autonomous_tech,
            R.id.btn_xr,
            R.id.btn_ethical_ai,
            R.id.btn_glossary
        )

        cards.forEachIndexed { index, id ->
            val card = findViewById<LinearLayout>(id)
            card.alpha = 0f                            // Start fully transparent
            card.translationY = 40f                    // Start slightly below original position
            card.animate()
                .alpha(1f)                       // Fade in
                .translationY(0f)                // Slide up to original position
                .setStartDelay((index * 100).toLong()) // Stagger animations
                .setDuration(400)
                .start()
        }
    }
}