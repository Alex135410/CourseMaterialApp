package com.example.coursematerialapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.example.coursematerialapp.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startHereCard.setOnClickListener {
            startActivity(Intent(this, StartHereActivity::class.java))
        }

        binding.learningModulesCard.setOnClickListener {
            startActivity(Intent(this, LearningModulesActivity::class.java))
        }
    }
}