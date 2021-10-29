package com.xjkwak.sleeptrackerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SleepNightViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val idTextView : TextView = itemView.findViewById(R.id.id_value)
}

class SleepNightAdapter(val data: Array<SleepNight>) : RecyclerView.Adapter<SleepNightViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SleepNightViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.sleep_night_item_view, parent, false)
        return SleepNightViewHolder(view)
    }

    override fun onBindViewHolder(holder: SleepNightViewHolder, position: Int) {
        val item = data[position]

        holder.idTextView.text = item.id.toString()
    }

    override fun getItemCount(): Int = data.size
}