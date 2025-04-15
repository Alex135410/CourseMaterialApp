package com.example.coursematerialapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coursematerialapp.R
import com.example.coursematerialapp.data.Module

class ModuleAdapter(
    private val modules: List<Module>,
    private val onItemClick: (Module) -> Unit
) : RecyclerView.Adapter<ModuleAdapter.ModuleViewHolder>() {

    inner class ModuleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.moduleTitle)
        private val descTextView: TextView = itemView.findViewById(R.id.moduleDescription)

        fun bind(module: Module) {
            titleTextView.text = module.title
            descTextView.text = module.description
            itemView.setOnClickListener { onItemClick(module) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_module, parent, false)
        return ModuleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        holder.bind(modules[position])
    }

    override fun getItemCount() = modules.size
}