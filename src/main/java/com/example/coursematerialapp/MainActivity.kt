package com.example.coursematerialapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coursematerialapp.ui.theme.CourseMaterialAppTheme
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.coursematerialapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInButton.setOnClickListener {
            // Basic validation - in a real app, you'd verify credentials
            val email = binding.emailEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                startActivity(Intent(this, DashboardActivity::class.java))
            } else {
                binding.emailEditText.error = "Please enter credentials"
            }
        }

        binding.signUpText.setOnClickListener {
            // Navigate to sign up screen (not implemented in this example)
        }

        binding.forgotPasswordText.setOnClickListener {
            // Handle forgot password (not implemented in this example)
        }
    }
}