package com.example.coursematerialapp.data
import com.example.coursematerialapp.R

data class Module(
    val title: String,
    val description: String,
    val imageResId: Int = R.drawable.ic_default_module
)

