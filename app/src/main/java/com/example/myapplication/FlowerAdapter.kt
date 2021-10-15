package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

/**
 * Copyright 2021, White Cloak Technologies, Inc., All rights reserved.
 *
 * @author alenbrubio
 * @since 10/15/2021
 */

class FlowerAdapter(val context: Context, private val data: List<Flower>) : RecyclerView.Adapter<FlowerAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id.txt_title)
        val image = view.findViewById<ImageView>(R.id.img)
        val root = view.rootView

        fun bindTitle(word: String) {
            title.text = word
        }

        fun bindImage(url: String?) {
            if (url != null) {
                Glide.with(context).load(url).into(image)
            }
        }

        fun onClick(word: String) {
            root.setOnClickListener {
                Toast.makeText(context, word, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_flower, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindTitle(data[position].title)
        holder.bindImage(data[position].image)
        holder.onClick(data[position].title)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}