package com.jw_android.learn_modern_android.view.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.utils_study.Console

class MyAdapter(private var item: MutableList<Memo>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.item1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.recylcerview_layout, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val model = item[position]
        Console.log(model.title)
        holder.tvTitle.text = model.title
    }

    override fun getItemCount(): Int {
        return item.size
    }
}