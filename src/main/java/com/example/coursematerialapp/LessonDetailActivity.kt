package com.example.coursematerialapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.example.coursematerialapp.databinding.ActivityLessonDetailBinding


class LessonDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLessonDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lessonNumber = intent.getStringExtra("lessonNumber") ?: "1"
        val title = intent.getStringExtra("title") ?: "Lesson"

        binding.lessonTitle.text = title

        binding.slidesButton.setOnClickListener {
            // In a real app, you'd open the slides
            val intent = Intent(this, ContentActivity::class.java).apply {
                putExtra("title", "$title - Slides")
            }
            startActivity(intent)
        }

        binding.labButton.setOnClickListener {
            // In a real app, you'd open the lab
            val intent = Intent(this, ContentActivity::class.java).apply {
                putExtra("title", "$title - Lab")
            }
            startActivity(intent)
        }
    }
}