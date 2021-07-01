package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val item = fecthData()

        val adapter: NewsListAdapter = NewsListAdapter(item,this)
        recyclerView.adapter = adapter


    }
    private  fun  fecthData():ArrayList<String>{
        val list = ArrayList< String>()
        for(i in 0 until 100) {
            list.add("Item $i")
        }
        return list

    }

    override fun OnItemClicked(item: String) {
        Toast.makeText(this,"you clicked $item",Toast.LENGTH_LONG).show()
    }
}