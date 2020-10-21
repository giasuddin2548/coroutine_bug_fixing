package com.genxmultiplexer.coroutinefundemental

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var list: List<Database>) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val index=list[position]
        holder.texViewName.text=index.name

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val texViewName:TextView=itemView.findViewById(R.id.simple_textViewId)

    }
}