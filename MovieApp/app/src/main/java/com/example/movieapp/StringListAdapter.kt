package com.example.movieapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StringListAdapter(private var strings: List<String>) : RecyclerView.Adapter<StringListAdapter.StringViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_string, parent, false)
        return StringViewHolder(view)
    }

    override fun getItemCount(): Int = strings.size

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        holder.string.text = strings[position];
    }

    inner class StringViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val string: TextView = itemView.findViewById(R.id.item_string_text)
    }
}