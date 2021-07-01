package com.example.newsapp

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(private val items:ArrayList<String>,private val listener: NewsItemClicked): RecyclerView.Adapter<viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent,false)
        val viewHolder = viewHolder(view)
        view.setOnClickListener{
            listener.OnItemClicked(items[viewHolder.adapterPosition])
        }

        return viewHolder



    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentItem = items[position]
        holder.title.text = currentItem

    }

    override fun getItemCount(): Int {
        return items.size

    }


}

class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(R.id.title)


}

interface  NewsItemClicked{
    fun OnItemClicked (item:String)
}

