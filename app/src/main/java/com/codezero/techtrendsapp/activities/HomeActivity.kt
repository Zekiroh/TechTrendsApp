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

        // Grid card click listeners
        findViewById<LinearLayout>(R.id.btn_generative_ai).setOnClickListener {
            startActivity(Intent(this, GenerativeAIActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btn_healthcare_ai).setOnClickListener {
            startActivity(Intent(this, HealthcareAIActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btn_autonomous_tech).setOnClickListener {
            startActivity(Intent(this, AutonomousTechActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btn_xr).setOnClickListener {
            startActivity(Intent(this, XRActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btn_ethical_ai).setOnClickListener {
            startActivity(Intent(this, EthicalAIActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btn_glossary).setOnClickListener {
            startActivity(Intent(this, GlossaryActivity::class.java))
        }
    }
}