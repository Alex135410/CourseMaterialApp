package com.example.coursematerialapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.coursematerialapp.databinding.ActivityModuleDetailBinding

class ModuleDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityModuleDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModuleDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get data from intent
        val title = intent.getStringExtra("MODULE_TITLE") ?: "Default Title"
        val description = intent.getStringExtra("MODULE_DESC") ?: "Default Description"
        val imageResId = intent.getIntExtra("MODULE_IMAGE", R.drawable.ic_default_module)

        // Set data to views
        binding.titleTextView.text = title
        binding.descriptionTextView.text = description
        binding.moduleImageView.setImageResource(imageResId)
    }
}