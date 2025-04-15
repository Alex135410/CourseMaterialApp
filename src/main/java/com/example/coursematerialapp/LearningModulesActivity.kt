package com.example.coursematerialapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coursematerialapp.databinding.ActivityLearningModulesBinding
import com.example.coursematerialapp.adapters.ModuleAdapter
import com.example.coursematerialapp.data.Module


class LearningModulesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLearningModulesBinding
    private lateinit var adapter: ModuleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLearningModulesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val modules = (1..13).map {
            Module("Lesson $it", "Content for lesson $it")
        }

        adapter = ModuleAdapter(modules) { module ->
            val intent = Intent(this, LessonDetailActivity::class.java).apply {
                putExtra("lessonNumber", module.title.substringAfter(" "))
                putExtra("title", module.title)
            }
            startActivity(intent)
        }

        binding.modulesRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.modulesRecyclerView.adapter = adapter
    }
}