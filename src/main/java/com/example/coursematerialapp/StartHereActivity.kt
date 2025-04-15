package com.example.coursematerialapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coursematerialapp.adapters.ModuleAdapter
import com.example.coursematerialapp.data.Module
import com.example.coursematerialapp.databinding.ActivityStartHereBinding

class StartHereActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartHereBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartHereBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sample module data
        val modules = listOf(
            Module("Getting Started", "Introduction to the course"),
            Module("Basic Concepts", "Learn the fundamentals"),
            Module("Advanced Topics", "Dive deeper into the subject"),
            Module("Final Project", "Apply what you've learned")
        )

        // Setup RecyclerView
        binding.modulesRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@StartHereActivity)
            adapter = ModuleAdapter(modules) { module ->
                // Handle item click
                val intent = Intent(this@StartHereActivity, ModuleDetailActivity::class.java).apply {
                    putExtra("MODULE_TITLE", module.title)
                    putExtra("MODULE_DESC", module.description)
                }
                startActivity(intent)
            }
        }
    }
}