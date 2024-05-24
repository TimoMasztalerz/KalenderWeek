package com.example.myapplication.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

abstract class RvViewAdapter(private val data: List<String>) :
    RecyclerView.Adapter<RvViewAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView8)

    }
}